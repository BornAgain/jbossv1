package metier.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Frequency {
	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String name;
	private Double timeToYear;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getTimeToYear() {
		return timeToYear;
	}
	public void setTimeToYear(Double timeToYear) {
		this.timeToYear = timeToYear;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Frequency [id=" + id + ", code=" + code + ", name=" + name
				+ "]";
	}
	public Frequency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
