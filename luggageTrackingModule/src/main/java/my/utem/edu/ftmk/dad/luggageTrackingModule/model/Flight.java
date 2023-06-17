package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "Flight")
public class Flight {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "FlightID")
	private int FlightID;
	
	@Column (name = "FlightName")
	private String FlightName;
	
	@Column (name = "DepartingTime")
	private Time DepartingTime;
	
	@Column (name = "ArrivingTime")
	private Time ArrivingTime;
	
	@Column (name = "DepartingDate")
	private Date DepartingDate;
	
	@Column (name = "ArrivingDate")
	private Date ArrivingDate;
	
	
	
	public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		FlightID = flightID;
	}
	
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	
	public Date getDepartingDate() {
		return DepartingDate;
	}
	public void setDepartingDate(Date departingDate) {
		DepartingDate = departingDate;
	}
	
	public Date getArrivingDate() {
		return ArrivingDate;
	}
	public void setArrivingDate(Date arrivingDate) {
		ArrivingDate = arrivingDate;
	}
	
	public Time getDepartingTime() {
		return DepartingTime;
	}
	public void setDepartingTime(Time departingTime) {
		DepartingTime = departingTime;
	}
	
	public Time getArrivingTime() {
		return ArrivingTime;
	}
	public void setArrivingTime(Time arrivingTime) {
		ArrivingTime = arrivingTime;
	}
	
	
	
	
	

}
