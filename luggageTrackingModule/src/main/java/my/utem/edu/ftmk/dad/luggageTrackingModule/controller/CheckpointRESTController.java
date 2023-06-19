/*
 * package my.utem.edu.ftmk.dad.luggageTrackingModule.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint; import
 * my.utem.edu.ftmk.dad.luggageTrackingModule.repository.CheckpointRepository;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/checkpoints") public class CheckpointRESTController {
 * 
 * @Autowired private CheckpointRepository checkpointRepository;
 * 
 * @DeleteMapping("{CheckpointID}") public ResponseEntity<HttpStatus>
 * deleteCheckpoint(@PathVariable long checkpointId) {
 * checkpointRepository.deleteById(checkpointId);
 * 
 * return new ResponseEntity<>(HttpStatus.OK); }
 * 
 * @GetMapping public List<Checkpoint> getCheckpoint() { return
 * checkpointRepository.findAll(); }
 * 
 * @GetMapping ("{CheckpointID}") public Checkpoint getCheckpoint(@PathVariable
 * long checkpointId ) { Checkpoint checkpoint =
 * checkpointRepository.findById(checkpointId).get();
 * 
 * return checkpoint; }
 * 
 * @PostMapping public Checkpoint insertCheckpoint (@RequestBody Checkpoint
 * checkpoint) { return checkpointRepository.save(checkpoint); }
 * 
 * @PutMapping public Checkpoint updateCheckpoint (@RequestBody Checkpoint
 * checkpoint) { return checkpointRepository.save(checkpoint); }
 * 
 * }
 */