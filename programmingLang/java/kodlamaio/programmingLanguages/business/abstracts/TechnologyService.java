package kodlamaio.programmingLanguages.business.abstracts;

import java.util.List;

import kodlamaio.programmingLanguages.business.requests.technologies.AddTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.DeleteTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.UpdateTechnologyRequest;
import kodlamaio.programmingLanguages.business.responses.technologies.GetAllTechnologiesResponse;

public interface TechnologyService {

	List<GetAllTechnologiesResponse> getAll();
	void add(AddTechnologyRequest createTechnologyRequest);
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	void update(UpdateTechnologyRequest updateTechnologyRequest);
	
}
