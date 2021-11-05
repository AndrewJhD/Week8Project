package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
	private String occupation;
	private String CompName; // company name
	private String address;
	
	/*public Job() {
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
	public String getCompName() {
		return CompName;
	}
	public void setCompName(String CompName) {
		this.CompName = CompName;
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
	}*/
}
