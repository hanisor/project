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
@Table (name = "cp2")
public class Checkpoint2 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "cp2ID")
	private int Checkpoint2Id;
	
	@Column (name = "Date")
	private Date Checkpoint2Date;
	
	@Column (name = "Time")
	private Time Checkpoint2Time;

	@ManyToOne
	@JoinColumn (name = "ConveyorLaneID")
	private  Conveyorlane conveyorlane;

	@ManyToOne
	@JoinColumn (name = "Cp1ID")
	private Checkpoint1 checkpoint1;

	public int getCheckpoint2Id() {
		return Checkpoint2Id;
	}

	public void setCheckpoint2Id(int checkpoint2Id) {
		Checkpoint2Id = checkpoint2Id;
	}

	public Date getCheckpoint2Date() {
		return Checkpoint2Date;
	}

	public void setCheckpoint2Date(Date checkpoint2Date) {
		Checkpoint2Date = checkpoint2Date;
	}

	public Time getCheckpoint2Time() {
		return Checkpoint2Time;
	}

	public void setCheckpoint2Time(Time checkpoint2Time) {
		Checkpoint2Time = checkpoint2Time;
	}

	public Conveyorlane getConveyorlane() {
		return conveyorlane;
	}

	public void setConveyorlane(Conveyorlane conveyorlane) {
		this.conveyorlane = conveyorlane;
	}

	public Checkpoint1 getCheckpoint1() {
		return checkpoint1;
	}

	public void setCheckpoint1(Checkpoint1 checkpoint1) {
		this.checkpoint1 = checkpoint1;
	}

	
	
	
}
