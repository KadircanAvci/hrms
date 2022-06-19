package kodlamaio.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name="job_seekers")
@Data
public class JobSeekers{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	

}
