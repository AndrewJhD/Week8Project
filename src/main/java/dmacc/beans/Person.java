package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Person {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int age;
	private String relationship;
	@Autowired
	private Job job;

	public Person() {
	super();
	this.relationship = "taken";

	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age, String relationship) {
		super();
		this.name = name;
		this.age = age;
		this.relationship = relationship;
		}
	public Person(int id, String name, int age, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.relationship = relationship;
		}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", age=" + age + ", relationship=" + relationship
				+ ", job=" + job +"]";	}
}
