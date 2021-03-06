package kodlamaio.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table (name="employer")
@Data

public class Employer{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column (name="company_name")
	private String companyName;
	
	@Column (name="web_sites")
	private String webSites;
	
	@Column (name="phone_number")
	private String phoneNumber;
	
	
	

}
