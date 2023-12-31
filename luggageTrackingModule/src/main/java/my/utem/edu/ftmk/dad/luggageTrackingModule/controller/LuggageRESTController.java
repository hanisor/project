package my.utem.edu.ftmk.dad.luggageTrackingModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Luggage;
import my.utem.edu.ftmk.dad.luggageTrackingModule.repository.LuggageRepository;

@RestController
@RequestMapping("/api/luggages")
public class LuggageRESTController {
	
	@Autowired
	private LuggageRepository luggageRepository;
	
	@DeleteMapping("{LuggageId}")
	public ResponseEntity<HttpStatus> deleteLuggage(@PathVariable long luggageId)
	{
		luggageRepository.deleteById(luggageId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public List<Luggage> getLuggage()
	{
		return luggageRepository.findAll();
	}
	
	@GetMapping ("{LuggageId}")
	public Luggage getLuggage(@PathVariable long luggageId )
	{
		Luggage luggage = luggageRepository.findById(luggageId).get();
		
		return luggage;
	}
	
	@PostMapping
	public Luggage insertLuggage (@RequestBody Luggage luggage)
	{
		return luggageRepository.save(luggage);
	}
	
	@PutMapping
	public Luggage updateLuggage (@RequestBody Luggage luggage)
	{
		return luggageRepository.save(luggage);
	}

}
