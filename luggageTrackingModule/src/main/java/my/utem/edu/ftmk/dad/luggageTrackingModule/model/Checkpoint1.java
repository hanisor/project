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
@Table (name = "Checkpoint1")
public class Checkpoint1 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "Checkpoint1Id")
	private int Checkpoint1Id;
	
	@Column (name = "CheckpointDate")
	private Date CheckpointDate;
	
	@Column (name = "CheckpointTime")
	private Time CheckpointTime;

	
	@ManyToOne
	@JoinColumn (name = "AirportId")
	private Airport airport;

	@ManyToOne
	@JoinColumn (name = "LuggageId")
	private Luggage luggage;
	

	public int getCheckpoint1Id() {
		return Checkpoint1Id;
	}

	public void setCheckpoint1Id(int checkpoint1id) {
		Checkpoint1Id = checkpoint1id;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public Luggage getLuggage() {
		return luggage;
	}

	public void setLuggage(Luggage luggage) {
		this.luggage = luggage;
	}

	public Date getCheckpointDate() {
		return CheckpointDate;
	}

	public void setCheckpointDate(Date checkpointDate) {
		CheckpointDate = checkpointDate;
	}

	public Time getCheckpointTime() {
		return CheckpointTime;
	}

	public void setCheckpointTime(Time checkpointTime) {
		CheckpointTime = checkpointTime;
	}
	
	


}
