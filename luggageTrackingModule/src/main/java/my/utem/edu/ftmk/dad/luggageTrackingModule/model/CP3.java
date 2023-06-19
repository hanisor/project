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
@Table (name = "cp3")
public class CP3 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "Cp3ID")
	private int Cp3ID;
	
	@Column (name = "Date")
	private Date Date;
	
	@Column (name = "Time")
	private Time Time;

	
	@ManyToOne
	@JoinColumn (name = "TruckID")
	private Shuttletruck truck;

	@ManyToOne
	@JoinColumn (name = "Cp2ID")
	private CP2 cp2;

	

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

	public Shuttletruck getTruck() {
		return truck;
	}

	public void setTruck(Shuttletruck truck) {
		this.truck = truck;
	}

	public int getCp3ID() {
		return Cp3ID;
	}

	public void setCp3ID(int cp3id) {
		Cp3ID = cp3id;
	}

	public CP2 getCp2() {
		return cp2;
	}

	public void setCp2(CP2 cp2) {
		this.cp2 = cp2;
	}

	

	

}
