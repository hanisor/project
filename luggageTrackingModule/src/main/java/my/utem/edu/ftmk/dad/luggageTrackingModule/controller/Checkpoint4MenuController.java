package my.utem.edu.ftmk.dad.luggageTrackingModule.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpEntity;

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint4;
//import my.edu.utem.ftmk.dad.restorderapp.controller.OrderTypeRESTController;

/*
 * Manage request from front end and consume REST web service to manage CRUD operation 
 */

@Controller
public class Checkpoint4MenuController {
	
	private String defaultURI = "http://localhost:8080/luggagehandling/api/checkpoints4";
	
	@GetMapping("/checkpoint4/list")
	public String getCheckpoint4(Model model) {
		
		// The URI for GET flight
		String uri = "http://localhost:8080/luggagehandling/api/checkpoints4";
		
		// Get a list order types from the web service
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Checkpoint4[]> response = restTemplate. getForEntity(uri, Checkpoint4[].class);
		
		// Parse JSON data to array of object
		Checkpoint4 checkpoints4[] = response.getBody();
		
		// Parse an array to a list object
		List<Checkpoint4> checkpoint4List = Arrays.asList(checkpoints4);
		
		// Attach list to model as attribute
		model.addAttribute("checkpoints4",checkpoint4List);
		
	return "checkpoints4";
	}
	
	/*
	 *  This method will update or add an checkpoint4
	 *  
	 *  @param checkpoint4
	 *  @return
	 */
	
	@RequestMapping("/checkpoint4/save")
	public String updateCheckpoint4(@ModelAttribute Checkpoint4 checkpoint4) {
		
		// Create a new RestTemplate
		RestTemplate restTemplate = new RestTemplate();
		
		// Create request body
		HttpEntity<Checkpoint4> request = new HttpEntity<Checkpoint4>(checkpoint4);
		
		String checkpoint4Response = "";
		
		if (checkpoint4.getcp4ID()>0) {
			//This block update a new flight and send request as PUT
			
			restTemplate.put(defaultURI, request, Checkpoint4.class);
		} else {
			//This block adds a new flight and send request as POST
			
			checkpoint4Response = restTemplate.postForObject(defaultURI, request, String.class);
		}
		
		System.out.println(checkpoint4Response);
		
		//Redirect request to display a list of flight
		return "redirect:/checkpoint4/list";
	}
	
	/*
	 * This method gets an checkpoint4
	 * 
	 *  @param cp4ID
	 *  @param model
	 *  @return
	 */
	
	@GetMapping("/checkpoint4/{cp4ID}")
	public String getCheckpoint4(@PathVariable Integer cp4ID, Model model) {
		String pageTitle = "Checkpoint 4";
		Checkpoint4 checkpoint4 = new Checkpoint4();
		
		//This block get an checkpoint4 to be updated
		if (cp4ID>0) {
			
			// Generate new URI and append cp4ID to it
			String uri = defaultURI + "/" + cp4ID;
			
			// Get an order type from the web service
			RestTemplate restTemplate = new RestTemplate();
			checkpoint4 = restTemplate.getForObject(uri, Checkpoint4.class);
			
			// Give a new title to the page 
			pageTitle = "Edit checkpoint4";
		}
		
		//Attach value to pass to front end
		model.addAttribute("checkpoint4", checkpoint4);
		model.addAttribute("pageTitle", pageTitle);
		
		return "checkpoint4info";
	}
	
	/*
	 * This method will delete an flight
	 */
	
	@RequestMapping("/checkpoint4/delete/{cp4ID}")
	public String deleteCheckpoint4(@PathVariable int cp4ID) {
	
		// Generate new URI, similar to the mapping in FlightRESTController
		String uri = defaultURI + "/{cp4ID}";
		
		// Send a DELETE request and attach the value of orderTypeId into URI
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri,Map.of("cp4ID", Integer.toString(cp4ID)));
	
		
		return "redirect:/checkpoint4/list";
	}
}