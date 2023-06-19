package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "luggage")
public class Luggage {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "LuggageID")
	private int LuggageId;
	
	@ManyToOne
	@JoinColumn (name = "PassengerID")
	private Passenger passenger;

	public int getLuggageId() {
		return LuggageId;
	}

	public void setLuggageId(int luggageId) {
		LuggageId = luggageId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	} 	
	
}