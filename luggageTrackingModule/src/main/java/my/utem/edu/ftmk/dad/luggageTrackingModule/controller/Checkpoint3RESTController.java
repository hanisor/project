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

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint3;
import my.utem.edu.ftmk.dad.luggageTrackingModule.repository.Checkpoint3Repository;


@RestController
@RequestMapping("/api/checkpoints3")
public class Checkpoint3RESTController {
	
	@Autowired
	private Checkpoint3Repository checkpoint3Repository;
	
	@DeleteMapping("{cp3ID}")
	public ResponseEntity<HttpStatus> deleteCheckpoint3(@PathVariable long cp3ID)
	{
		checkpoint3Repository.deleteById(cp3ID);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public List<Checkpoint3> getCheckpoint3()
	{
		return checkpoint3Repository.findAll();
	}
	
	@GetMapping ("{cp3ID}")
	public Checkpoint3 getCheckpoint3(@PathVariable long cp3ID )
	{
		Checkpoint3 checkpoint3 = checkpoint3Repository.findById(cp3ID).get();
		
		return checkpoint3;
	}
	
	@PostMapping
	public Checkpoint3 insertCheckpoint3 (@RequestBody Checkpoint3 checkpoint3)
	{
		return checkpoint3Repository.save(checkpoint3);
	}
	
	@PutMapping
	public Checkpoint3 updateCheckpoint3 (@RequestBody Checkpoint3 checkpoint3)
	{
		return checkpoint3Repository.save(checkpoint3);
	}

}
