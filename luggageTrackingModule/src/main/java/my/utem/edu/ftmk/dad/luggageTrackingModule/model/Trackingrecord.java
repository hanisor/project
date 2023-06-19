/*
 * package my.utem.edu.ftmk.dad.luggageTrackingModule.model;
 * 
 * import java.sql.Date; import java.sql.Time;
 * 
 * import jakarta.persistence.Column; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.JoinColumn; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table (name = "trackingrecord") public class Trackingrecord {
 * 
 * @Id
 * 
 * @GeneratedValue (strategy = GenerationType.IDENTITY)
 * 
 * @Column (name = "TrackingRecordID") private int TrackingRecordID;
 * 
 * @Column (name = "CheckInDate") private Date CheckInDate;
 * 
 * @Column (name = "CheckInTime") private Time CheckInTime;
 * 
 * @Column (name = "RecordedBy") private String recordBy;
 * 
 * @JoinColumn(name = "Cp1ID") private Checkpoint1 checkpoint1;
 * 
 * @JoinColumn(name = "Cp2ID") private Checkpoint2 checkpoint2;
 * 
 * @JoinColumn(name = "Cp3ID") private Checkpoint3 checkpoint3;
 * 
 * @JoinColumn(name = "Cp4ID") private Checkpoint4 checkpoint4;
 * 
 * @JoinColumn(name = "LuggageID") private Luggage luggage;
 * 
 * // @Column (name = "Luggage") // private Luggage luggage; // // @Column (name
 * = "Flight") // private Flight flight; // // @Column (name = "Shuttletruck")
 * // private Shuttletruck shuttletruck; // // @Column (name = "Conveyorlane")
 * // private Conveyorlane conveyorlane;
 * 
 * 
 * public Luggage getLuggage() { return luggage; } public void
 * setLuggage(Luggage luggage) { this.luggage = luggage; } public int
 * getTrackingRecordID() { return TrackingRecordID; } public void
 * setTrackingRecordID(int trackingRecordID) { TrackingRecordID =
 * trackingRecordID; }
 * 
 * public Date getCheckInDate() { return CheckInDate; } public void
 * setCheckInDate(Date checkInDate) { CheckInDate = checkInDate; }
 * 
 * public Time getCheckInTime() { return CheckInTime; } public void
 * setCheckInTime(Time checkInTime) { CheckInTime = checkInTime; }
 * 
 * public String getRecordBy() { return recordBy; } public void
 * setRecordBy(String recordBy) { this.recordBy = recordBy; } public Checkpoint1
 * getCheckpoint1() { return checkpoint1; } public void
 * setCheckpoint1(Checkpoint1 checkpoint1) { this.checkpoint1 = checkpoint1; }
 * public Checkpoint2 getCheckpoint2() { return checkpoint2; } public void
 * setCheckpoint2(Checkpoint2 checkpoint2) { this.checkpoint2 = checkpoint2; }
 * public Checkpoint3 getCheckpoint3() { return checkpoint3; } public void
 * setCheckpoint3(Checkpoint3 checkpoint3) { this.checkpoint3 = checkpoint3; }
 * public Checkpoint4 getCheckpoint4() { return checkpoint4; } public void
 * setCheckpoint4(Checkpoint4 checkpoint4) { this.checkpoint4 = checkpoint4; }
 * 
 * 
 * 
 * 
 * 
 * // public Luggage getLuggage() { // return luggage; // } // public void
 * setLuggage(Luggage luggage) { // this.luggage = luggage; // } // // public
 * Flight getFlight() { // return flight; // } // public void setFlight(Flight
 * flight) { // this.flight = flight; // } // // public Shuttletruck
 * getShuttletruck() { // return shuttletruck; // } // public void
 * setShuttletruck(Shuttletruck shuttletruck) { // this.shuttletruck =
 * shuttletruck; // } // // public Conveyorlane getConveyorlane() { // return
 * conveyorlane; // } // public void setConveyorlane(Conveyorlane conveyorlane)
 * { // this.conveyorlane = conveyorlane; // } //
 * 
 * 
 * 
 * }
 */