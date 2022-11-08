package kodlamaio.programmingLanguages.business.abstracts;

import java.util.List;

import kodlamaio.programmingLanguages.business.requests.languages.CreateProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.DeleteProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.UpdateProgrammingLanguageRequest;

import kodlamaio.programmingLanguages.business.responses.languages.GetAllProgrammingLanguageResponse;
import kodlamaio.programmingLanguages.business.responses.languages.GetProgrammingLanguagesByIdResponse;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest createLanguageRequest) throws Exception;
	void delete(DeleteProgrammingLanguageRequest deleteLanguageRequest);
	void update(UpdateProgrammingLanguageRequest UpdateLanguageRequest);
	ProgrammingLanguage getById(GetProgrammingLanguagesByIdResponse pLanguageResponse);
	boolean isTheLanguageExist(ProgrammingLanguage language);
	
	
}
