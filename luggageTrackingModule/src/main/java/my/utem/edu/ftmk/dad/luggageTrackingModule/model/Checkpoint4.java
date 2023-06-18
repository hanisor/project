package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.lang.annotation.Repeatable;
import java.lang.annotation.*;


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
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface Columns {
	    Column[] value();
	}
	
	@Columns({
        @Column(name = "Date"),
        @Column(columnDefinition = "DATE DEFAULT CURRENT_DATE")
    })
    private Date Date;
	
	@Columns({
		@Column (name = "Time"),
        @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    })
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
