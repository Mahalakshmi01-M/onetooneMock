package onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class VoterDto {
	@Id
	private int voterCardId;
	private String name;
	private int age;
	public int getVoterCardId() {
		return voterCardId;
	}
	public void setVoterCardId(int voterCardId) {
		this.voterCardId = voterCardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "VoterDto [voterCardId=" + voterCardId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
