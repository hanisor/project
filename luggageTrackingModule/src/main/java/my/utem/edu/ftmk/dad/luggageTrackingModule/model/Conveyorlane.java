package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "conveyorlane")
public class Conveyorlane {
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "ConveyorLaneID")
	private int ConveyorLaneID;
	
	@Column (name = "Destination")
	private String Destination;
	
	public int getConveyorLaneID() {
		return ConveyorLaneID;
	}
	public void setConveyorLaneID(int conveyorLaneID) {
		ConveyorLaneID = conveyorLaneID;
	}
	
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	

}
