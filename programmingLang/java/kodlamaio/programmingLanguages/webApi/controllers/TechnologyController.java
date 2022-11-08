package kodlamaio.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.programmingLanguages.business.abstracts.TechnologyService;
import kodlamaio.programmingLanguages.business.requests.technologies.AddTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.DeleteTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.UpdateTechnologyRequest;
import kodlamaio.programmingLanguages.business.responses.technologies.GetAllTechnologiesResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	private TechnologyService technologyService;

	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	List<GetAllTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	void add(AddTechnologyRequest createTechnologyRequest){
		technologyService.add(createTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	void delete(DeleteTechnologyRequest deleteTechnologyRequest){
		technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/update")
	void update(UpdateTechnologyRequest updateTechnologyRequest) {
		technologyService.update(updateTechnologyRequest);
	}

}
