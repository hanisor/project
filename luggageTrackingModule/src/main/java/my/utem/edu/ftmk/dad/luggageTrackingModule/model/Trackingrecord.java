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
@Table (name = "Trackingrecord")
public class Trackingrecord {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "TrackingRecordID")
	private int TrackingRecordID;
	
	@Column (name = "CheckInDate")
	private Date CheckInDate;
	
	@Column (name = "CheckInTime")
	private Time CheckInTime;
	
	@Column (name = "recordBy")
	private String recordBy;
	
//	@Column (name = "Luggage")
//	private Luggage luggage;
//	
//	@Column (name = "Flight")
//	private Flight flight;
//	
//	@Column (name = "Shuttletruck")
//	private Shuttletruck shuttletruck;
//	
//	@Column (name = "Conveyorlane")
//	private Conveyorlane conveyorlane;
	
	
	public int getTrackingRecordID() {
		return TrackingRecordID;
	}
	public void setTrackingRecordID(int trackingRecordID) {
		TrackingRecordID = trackingRecordID;
	}
	
	public Date getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		CheckInDate = checkInDate;
	}
	
	public Time getCheckInTime() {
		return CheckInTime;
	}
	public void setCheckInTime(Time checkInTime) {
		CheckInTime = checkInTime;
	}
	
	public String getRecordBy() {
		return recordBy;
	}
	public void setRecordBy(String recordBy) {
		this.recordBy = recordBy;
	}
	
//	public Luggage getLuggage() {
//		return luggage;
//	}
//	public void setLuggage(Luggage luggage) {
//		this.luggage = luggage;
//	}
//	
//	public Flight getFlight() {
//		return flight;
//	}
//	public void setFlight(Flight flight) {
//		this.flight = flight;
//	}
//	
//	public Shuttletruck getShuttletruck() {
//		return shuttletruck;
//	}
//	public void setShuttletruck(Shuttletruck shuttletruck) {
//		this.shuttletruck = shuttletruck;
//	}
//	
//	public Conveyorlane getConveyorlane() {
//		return conveyorlane;
//	}
//	public void setConveyorlane(Conveyorlane conveyorlane) {
//		this.conveyorlane = conveyorlane;
//	}
//	
	
	

}
