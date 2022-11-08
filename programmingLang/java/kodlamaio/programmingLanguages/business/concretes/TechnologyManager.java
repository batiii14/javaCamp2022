package kodlamaio.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.programmingLanguages.business.abstracts.TechnologyService;
import kodlamaio.programmingLanguages.business.requests.technologies.AddTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.DeleteTechnologyRequest;
import kodlamaio.programmingLanguages.business.requests.technologies.UpdateTechnologyRequest;
import kodlamaio.programmingLanguages.business.responses.technologies.GetAllTechnologiesResponse;
import kodlamaio.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaio.programmingLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;
import kodlamaio.programmingLanguages.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository languageRepository;

	public TechnologyManager(TechnologyRepository technologyRepository,
			ProgrammingLanguageRepository languageRepository) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponses = new ArrayList<GetAllTechnologiesResponse>();

		for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setName(technology.getName());
			responseItem.setId(technology.getId());

			technologiesResponses.add(responseItem);
		}

		return technologiesResponses;
	}

	@Override
	public void add(AddTechnologyRequest addTechnology) {
		ProgrammingLanguage language = languageRepository.findById(addTechnology.getLanguageId()).get();
		Technology technology = new Technology();
		technology.setName(addTechnology.getName());
		technology.setLanguage(language);
		technologyRepository.save(technology);

	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnology) {
		Technology technology = technologyRepository.findById(deleteTechnology.getId()).get();
		technologyRepository.delete(technology);

	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnology) {

		Technology technology = technologyRepository.findById(updateTechnology.getId()).get();
		technology.setName(updateTechnology.getName());
		technology.setLanguage(languageRepository.findById(updateTechnology.getLanguageId()).get());
		technologyRepository.save(technology);
	}

}
