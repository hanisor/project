/*
 * package my.utem.edu.ftmk.dad.luggageTrackingModule.controller;
 * 
 * import java.util.Arrays; import java.util.List;
 * 
 * import org.springframework.http.ResponseEntity; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.client.RestTemplate;
 * 
 * //import my.utem.edu.ftmk.dad.luggageTrackingModule.model.Checkpoint1; import
 * my.utem.edu.ftmk.dad.luggageTrackingModule.model.Trackingrecord;
 * 
 * public class TrackingRecordMenuController {
 * 
 * private String defaultURI =
 * "http://localhost:8080/luggagehandling/api/trackingrecords";
 * 
 * @GetMapping("/trackingrecords/list") public String getTrackingrecords (Model
 * model) { // The URI for GET checkpoint String uri =
 * "http://localhost:8080/luggagehandling/api/trackingrecords";
 * 
 * // Get a list checkpoint from the web service RestTemplate restTemplate = new
 * RestTemplate(); ResponseEntity<Trackingrecord[]> response =
 * restTemplate.getForEntity(uri, Trackingrecord[].class);
 * 
 * // Parse JSON data to array of object Trackingrecord trackings[] =
 * response.getBody();
 * 
 * 
 * // Parse an array to a list object List<Trackingrecord> trackinglist =
 * Arrays.asList(trackings);
 * 
 * // Attach list to model as attribute model.addAttribute("trackingrecords",
 * trackinglist);
 * 
 * 
 * // returning HTML file return "trackingrecord"; } }
 */