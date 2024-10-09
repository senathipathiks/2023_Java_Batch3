package com.crimemgt.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Criminal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int criminalId;

	private String criminalName;
	private String criminalAddress;
	private String criminalPhn;
	private String criminalAge;
	private String crimeDescription;
	private String usualCrime;
	
	@ManyToOne(targetEntity = Complaint.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "complaintId")
	private Complaint complaint;
	
	@ManyToOne(targetEntity = Station.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "stationId")
	private Station station;

	public Criminal() {
		super();
	}

	

	public int getCriminalId() {
		return criminalId;
	}

	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}

	public String getCriminalName() {
		return criminalName;
	}

	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}

	public String getCriminalAddress() {
		return criminalAddress;
	}

	public void setCriminalAddress(String criminalAddress) {
		this.criminalAddress = criminalAddress;
	}

	public String getCriminalPhn() {
		return criminalPhn;
	}

	public void setCriminalPhn(String criminalPhn) {
		this.criminalPhn = criminalPhn;
	}

	public String getCriminalAge() {
		return criminalAge;
	}

	public void setCriminalAge(String criminalAge) {
		this.criminalAge = criminalAge;
	}

	public String getCrimeDescription() {
		return crimeDescription;
	}

	public void setCrimeDescription(String crimeDescription) {
		this.crimeDescription = crimeDescription;
	}

	public String getUsualCrime() {
		return usualCrime;
	}

	public void setUsualCrime(String usualCrime) {
		this.usualCrime = usualCrime;
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return "Criminal [criminalId=" + criminalId + ", criminalName=" + criminalName + ", criminalAddress="
				+ criminalAddress + ", criminalPhn=" + criminalPhn + ", criminalAge=" + criminalAge
				+ ", crimeDescription=" + crimeDescription + ", usualCrime=" + usualCrime + ", complaint=" + complaint
				+ ", station=" + station + "]";
	}

	
}
