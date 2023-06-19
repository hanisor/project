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

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint3;
//import my.edu.utem.ftmk.dad.restorderapp.controller.OrderTypeRESTController;

/*
 * Manage request from front end and consume REST web service to manage CRUD operation 
 */

@Controller
public class Checkpoint3MenuController {
	
	private String defaultURI = "http://localhost:8080/luggagehandling/api/checkpoints3";

	
	
	@GetMapping("/checkpoint3/list")
	public String getCheckpoint3(Model model) {
		
		// The URI for GET order types
		String uri = "http://localhost:8080/luggagehandling/api/checkpoints3";
		
		// Get a list order types from the web service
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Checkpoint3[]> response = restTemplate. getForEntity(uri, Checkpoint3[].class);
		
		// Parse JSON data to array of object
		Checkpoint3 checkpoints3[] = response.getBody();
		
		// Parse an array to a list object
		List<Checkpoint3> checkpoint3List = Arrays.asList(checkpoints3);
		
		// Attach list to model as attribute
		model.addAttribute("checkpoints3",checkpoint3List);
		
		return "checkpoints3";
	}
	
	/*
	 *  This method will update or add an checkpoint3
	 *  
	 *  @param checkpoint3
	 *  @return
	 */
	
	@RequestMapping("/checkpoint3/save")
	public String updateCheckpoint3(@ModelAttribute Checkpoint3 checkpoint3) {
		
		// Create a new RestTemplate
		RestTemplate restTemplate = new RestTemplate();
		
		// Create request body
		HttpEntity<Checkpoint3> request = new HttpEntity<Checkpoint3>(checkpoint3);
		
		String checkpoint3Response = "";

		if (checkpoint3.getcp3ID()>0) {
			//This block update a new order type and send request as PUT
			
			restTemplate.put(defaultURI, request, Checkpoint3.class);
		} else {
			//This block adds a new order type and send request as POST
			
			checkpoint3Response = restTemplate.postForObject(defaultURI, request, String.class);
		}
		
		System.out.println(checkpoint3Response);
		
		//Redirect request to display a list of checkpoint3
		return "redirect:/checkpoint3/list";
	}
	
	/*
	 * This method gets an cp3ID 
	 * 
	 *  @param cp3ID
	 *  @param model
	 *  @return
	 */
	
	@GetMapping("/checkpoint3/{cp3ID}")
	public String getCheckpoint3(@PathVariable Integer cp3ID, Model model) {
		String pageTitle = "Checkpoint 3";
		Checkpoint3 checkpoint3 = new Checkpoint3();
		
		//This block get an checkpoint3 to be updated
		if (cp3ID>0) {
			
			// Generate new URI and append TruckID to it
			String uri = defaultURI + "/" + cp3ID;
			
			// Get an order type from the web service
			RestTemplate restTemplate = new RestTemplate();
			checkpoint3 = restTemplate.getForObject(uri, Checkpoint3.class);
			
			// Give a new title to the page 
			pageTitle = "Edit cp3ID";
		}
		
		//Attach value to pass to front end
		model.addAttribute("checkpoint3", checkpoint3);
		model.addAttribute("pageTitle", pageTitle);
		
		return "checkpoint3info";
	}
	
	/* 
	 * This method will delete an checkpoint3
	 */
	
	@RequestMapping("/checkpoints3/delete/{cp3ID}")
	public String deleteCheckpoint3(@PathVariable int cp3ID) {
	
		// Generate new URI, similar to the mapping in ShuttletruckRESTController
		String uri = defaultURI + "/{cp3ID}";
		
		// Send a DELETE request and attach the value of TruckID into URI
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri,Map.of("cp3ID", Integer.toString(cp3ID)));
		
		return "redirect:/checkpoints3/list";
	}
}