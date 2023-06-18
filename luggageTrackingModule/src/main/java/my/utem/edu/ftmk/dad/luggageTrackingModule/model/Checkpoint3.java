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
public class Checkpoint3 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "cp3ID")
	private int Checkpoint3Id;
	
	@Column (name = "Date")
	private Date Checkpoint3Date;
	
	@Column (name = "Time")
	private Time Checkpoint3Time;

	@ManyToOne
	@JoinColumn (name = "TruckID")
	private  Shuttletruck shuttletruck;
	
	@ManyToOne
	@JoinColumn (name = "Cp2ID")
	private Checkpoint2 checkpoint2;

	public int getCheckpoint3Id() {
		return Checkpoint3Id;
	}

	public void setCheckpoint3Id(int checkpoint3Id) {
		Checkpoint3Id = checkpoint3Id;
	}

	public Date getCheckpoint3Date() {
		return Checkpoint3Date;
	}

	public void setCheckpoint3Date(Date checkpoint3Date) {
		Checkpoint3Date = checkpoint3Date;
	}

	public Time getCheckpoint3Time() {
		return Checkpoint3Time;
	}

	public void setCheckpoint3Time(Time checkpoint3Time) {
		Checkpoint3Time = checkpoint3Time;
	}

	public Shuttletruck getShuttletruck() {
		return shuttletruck;
	}

	public void setShuttletruck(Shuttletruck shuttletruck) {
		this.shuttletruck = shuttletruck;
	}

	public Checkpoint2 getCheckpoint2() {
		return checkpoint2;
	}

	public void setCheckpoint2(Checkpoint2 checkpoint2) {
		this.checkpoint2 = checkpoint2;
	}

	
	

	
	
	
}