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
	public class Checkpoint4 {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column (name = "cp4ID")
		private int Checkpoint4Id;
		
		@Column (name = "Date")
		private Date Checkpoint4Date;
		
		@Column (name = "Time")
		private Time Checkpoint4Time;

		@ManyToOne
		@JoinColumn (name = "FlightID")
		private  Flight flight;
		
		@ManyToOne
		@JoinColumn (name = "Cp3ID")
		private Checkpoint3 checkpoint3;

		public int getCheckpoint4Id() {
			return Checkpoint4Id;
		}

		public void setCheckpoint4Id(int checkpoint4Id) {
			Checkpoint4Id = checkpoint4Id;
		}

		public Date getCheckpoint4Date() {
			return Checkpoint4Date;
		}

		public void setCheckpoint4Date(Date checkpoint4Date) {
			Checkpoint4Date = checkpoint4Date;
		}

		public Time getCheckpoint4Time() {
			return Checkpoint4Time;
		}

		public void setCheckpoint4Time(Time checkpoint4Time) {
			Checkpoint4Time = checkpoint4Time;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public Checkpoint3 getCheckpoint3() {
			return checkpoint3;
		}

		public void setCheckpoint3(Checkpoint3 checkpoint3) {
			this.checkpoint3 = checkpoint3;
		}

		
		
}
