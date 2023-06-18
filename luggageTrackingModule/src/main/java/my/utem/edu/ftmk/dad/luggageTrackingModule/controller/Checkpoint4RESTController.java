package my.utem.edu.ftmk.dad.luggageTrackingModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint4;
import my.utem.edu.ftmk.dad.luggageTrackingModule.repository.Checkpoint4Repository;

@RestController
@RequestMapping("/api/checkpoints4")
public class Checkpoint4RESTController {
	
	@Autowired
	private Checkpoint4Repository checkpoint4Repository;
	
	/*@DeleteMapping("{Checkpoint2Id}")
	public ResponseEntity<HttpStatus> deleteCheckpoint1(@PathVariable long Checkpoint1Id)
	{
		checkpoint1Repository.deleteById(Checkpoint1Id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}*/
	
	@GetMapping
	public List<Checkpoint4> getCheckpoint4()
	{
		return checkpoint4Repository.findAll();
	}
	
	@GetMapping ("{Checkpoint4Id}")
	public Checkpoint4 getCheckpoint4(@PathVariable long Checkpoint4Id )
	{
		Checkpoint4 checkpoint4 = checkpoint4Repository.findById(Checkpoint4Id).get();
		
		return checkpoint4;
	}
}
