package my.utem.edu.ftmk.dad.luggageTrackingModule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Airport")
public class Airport {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "AirportId")
	private int AirportId;
	
	@Column (name = "AirportName")
	private String AirportName;
	
	@Column (name = "DepartingAirport")
	private String DepartingAirport;
	
	@Column (name = "ArrivalAirport")
	private String ArrivalAirport;
	
	
	
	
	public int getAirportId() {
		return AirportId;
	}
	public void setAirportId(int airportId) {
		AirportId = airportId;
	}
	public String getAirportName() {
		return AirportName;
	}
	public void setAirportName(String airportName) {
		AirportName = airportName;
	}
	
	public String getDepartingAirport() {
		return DepartingAirport;
	}
	public void setDepartingAirport(String departingAirport) {
		DepartingAirport = departingAirport;
	}
	
	public String getArrivalAirport() {
		return ArrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		ArrivalAirport = arrivalAirport;
	}

	
	

}
