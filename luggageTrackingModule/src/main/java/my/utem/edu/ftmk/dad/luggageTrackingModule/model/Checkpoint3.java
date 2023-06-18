package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import java.util.Date;
import java.sql.Time;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name = "cp3")
public class Checkpoint3 {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "CP3ID")
	private int cp3ID;
	
	public int getcp3ID() {
		return cp3ID;
	}

	public void setCP3ID(int cp3id) {
		cp3ID = cp3id;
	}	
	
	@Column (name = "Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date Date;
	
	@Column (name = "Time")
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "00:00:00")
	private Time Time;
	
	@Column (name = "TruckID")
	private String TruckID;
	
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

	public String getTruckID() {
		return TruckID;
	}

	public void setTruckID(String truckID) {
		TruckID = truckID;
	}

	public String getLuggageID() {
		return LuggageID;
	}

	public void setLuggageID(String luggageID) {
		LuggageID = luggageID;
	}
	
	
	
}
