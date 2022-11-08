package kodlamaio.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.programmingLanguages.business.abstracts.ProgrammingLanguageService;
import kodlamaio.programmingLanguages.business.requests.languages.CreateProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.DeleteProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.UpdateProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.responses.languages.GetAllProgrammingLanguageResponse;
import kodlamaio.programmingLanguages.business.responses.languages.GetProgrammingLanguagesByIdResponse;
import kodlamaio.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaio.programmingLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	private TechnologyRepository technologyRepository;
	boolean isItExist = false;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository,TechnologyRepository technologyRepository) {
		this.languageRepository = languageRepository;
		this.technologyRepository=technologyRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> languageResponse = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : languages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			languageResponse.add(responseItem);
			responseItem.setTechnologies(programmingLanguage.getTechnologies());

		}

		return languageResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest language) throws Exception {

		ProgrammingLanguage pLanguage = new ProgrammingLanguage();
		pLanguage.setName(language.getName());
		if (language.getName() == null || language.getName().length() == 0) {
			throw new Exception("Name can not be empty! Please try again");
		} else {

			if (isTheLanguageExist(pLanguage) == true) {
				throw new Exception("Sorry that name is already existed");
			} else {
				System.out.println(language.getName() + " has been add to list with the id of : " + pLanguage.getId());
				languageRepository.save(pLanguage);
			}

		}

	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteLanguage) {

		ProgrammingLanguage language =languageRepository.findById(deleteLanguage.getId()).get();

		for (ProgrammingLanguage programmingLanguage : languageRepository.findAll()) {
			if (programmingLanguage.getId() == language.getId()) {
				languageRepository.deleteById(language.getId());
				technologyRepository.deleteAll(language.getTechnologies());
			} else {
				System.out.println("There is no such programming language with that id");
			}
		}
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateLanguage) {

		ProgrammingLanguage language = languageRepository.findById(updateLanguage.getId()).get();
		language.setName(updateLanguage.getName());
		for (ProgrammingLanguage programmingLanguage : languageRepository.findAll()) {
			if (programmingLanguage.getId() == language.getId()) {
				if (programmingLanguage.getName() == language.getName()) {
					System.out.println("Sorry that programming language is already existed");
				} else {
					languageRepository.save(language);
				}
			}

		}

	}

	@Override
	public ProgrammingLanguage getById(GetProgrammingLanguagesByIdResponse pL) {
		return languageRepository.findById(pL.getId()).get();

	}

	@Override
	public boolean isTheLanguageExist(ProgrammingLanguage language) {

		return languageRepository.existsById(language.getId());

	}
}
