package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entites.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
	
}
