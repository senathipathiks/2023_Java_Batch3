package day1Assignment.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String eName;
	private String eDesig;
	private double esal;
	private long ePhone;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesig() {
		return eDesig;
	}

	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public long getePhone() {
		return ePhone;
	}

	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eDesig=" + eDesig + ", esal=" + esal + ", ePhone="
				+ ePhone + "]";
	}

}
