package onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class PersonDto {
    @Id
	private int personId;
	private String name;
	private String address;
	@OneToOne
	private VoterDto voterId;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	public VoterDto getVoterId() {
		return voterId;
	}
	public void setVoterId(VoterDto voterId) {
		this.voterId = voterId;
	}
	@Override
	public String toString() {
		return "PersonDto [personId=" + personId + ", name=" + name + ", address=" + address + ", voterId=" + voterId
				+ "]";
	}
	
	
	
}
	
	
	
