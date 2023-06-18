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

	import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint2;
	import my.utem.edu.ftmk.dad.luggageTrackingModule.repository.Checkpoint2Repository;

	@RestController
	@RequestMapping("/api/checkpoints2")
	public class Checkpoint2RESTController {
		
		@Autowired
		private Checkpoint2Repository checkpoint2Repository;
		
		/*@DeleteMapping("{Checkpoint2Id}")
		public ResponseEntity<HttpStatus> deleteCheckpoint1(@PathVariable long Checkpoint1Id)
		{
			checkpoint1Repository.deleteById(Checkpoint1Id);
			
			return new ResponseEntity<>(HttpStatus.OK);
		}*/
		
		@GetMapping
		public List<Checkpoint2> getCheckpoint2()
		{
			return checkpoint2Repository.findAll();
		}
		
		@GetMapping ("{Checkpoint2Id}")
		public Checkpoint2 getCheckpoint2(@PathVariable long Checkpoint2Id )
		{
			Checkpoint2 checkpoint2 = checkpoint2Repository.findById(Checkpoint2Id).get();
			
			return checkpoint2;
		}
}
