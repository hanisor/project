package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table (name = "cp4")
public class Checkpoint4 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "cp4ID")
	private int cp4ID;
	
	public int getcp4ID() {
		return cp4ID;
	}

	public void setcp4ID(int cp4id) {
		cp4ID = cp4id;
	}
	
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date Date;
	
	@Column (name = "Time")
	@Temporal(TemporalType.TIME)
	private Time Time;
	
	@Column (name = "FlightID")
	private String FlightID;
	
	@Column (name = "LuggageID")
	private String LuggageID;

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

	public String getFlightID() {
		return FlightID;
	}

	public void setFlightID(String flightID) {
		FlightID = flightID;
	}

	public String getLuggageID() {
		return LuggageID;
	}

	public void setLuggageID(String luggageID) {
		LuggageID = luggageID;
	}

}
