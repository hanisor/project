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
@Table(name = "passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "PassengerID")
	private int passengerId;
	
	@Column (name = "Name")
	private String Name;
	
	@Column (name = "PassengerIC")
	private String PassengerIC;
	
	@Column (name = "PhoneNumber")
	private String PhoneNumber;
	
	@Column (name = "Email")
	private String Email;
	
	@Column (name = "Gender")
	private char Gender;
	
	@ManyToOne
	@JoinColumn (name = "FlightID")
	private Flight flight;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassengerIC() {
		return PassengerIC;
	}

	public void setPassengerIC(String passengerIC) {
		PassengerIC = passengerIC;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
	
	

}
