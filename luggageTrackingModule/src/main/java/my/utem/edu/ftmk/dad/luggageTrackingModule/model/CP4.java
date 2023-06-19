package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "cp4")
public class CP4 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "Cp4ID")
	private int Cp4ID;
	
	@Column (name = "Date")
	private Date Date;
	
	@Column (name = "Time")
	private Time Time;

	
	@ManyToOne
	@JoinColumn (name = "FlightID")
	private Flight flight;

	@ManyToOne
	@JoinColumn (name = "Cp3ID")
	private CP3 cp3;

	

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Time getTime() {
		return Time;
	}

	public void setTime(Time time) {
		Time = time;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getCp4ID() {
		return Cp4ID;
	}

	public void setCp4ID(int cp4id) {
		Cp4ID = cp4id;
	}

	public CP3 getCp3() {
		return cp3;
	}

	public void setCp3(CP3 cp3) {
		this.cp3 = cp3;
	}

	
	

}
