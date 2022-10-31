package kodlamaio.programmingLanguages.business.abstracts;

import java.util.List;

import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language) throws Exception;
	void delete(int id);
	void update(int id,String newName);
	ProgrammingLanguage getById(int id);
	boolean isTheLanguageExist(ProgrammingLanguage language);
}
