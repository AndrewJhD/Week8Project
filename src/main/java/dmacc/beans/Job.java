package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Job {
	private String occupation;
	private String CompName; // company name
	private String address;
	public Job() {
		super();
	}
	
	public Job(String occupation, String compName, String address) {
		super();
		this.occupation = occupation;
		this.CompName = compName;
		this.address = address;
	}
	
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getcompName() {
		return CompName;
	}
	public void setcompName(String compName) {
		this.CompName = compName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Job [occupation=" + occupation + ", company name=" + CompName + ", address=" + address + "]";
	}
}
