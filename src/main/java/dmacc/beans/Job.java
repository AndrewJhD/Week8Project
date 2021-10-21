package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Job {
	private String occupation;
	private String name; // company name
	private String address;
	public Job() {
		super();
	}
	
	public Job(String occupation, String name, String address) {
		super();
		this.occupation = occupation;
		this.name = name;
		this.address = address;
	}
	
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Job [occupation=" + occupation + ", name=" + name + ", address=" + address + "]";
	}
}
