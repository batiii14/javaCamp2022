package kodlamaio.programmingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C++"));
		languages.add(new ProgrammingLanguage(2, "C"));
		languages.add(new ProgrammingLanguage(3, "JAVA"));
		languages.add(new ProgrammingLanguage(4, "PHYTON"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public void add(ProgrammingLanguage language) {

		languages.add(language);

	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage programmingLanguage : languages) {
			if (programmingLanguage.getId() == id) {
				languages.remove(programmingLanguage);
			}
		}
		
	}

	@Override
	public void update(int id,String newName) {
		for (ProgrammingLanguage programmingLanguage : languages) {
			if (programmingLanguage.getId() == id) {
				programmingLanguage.setName(newName);
				
			}
		}

	}

	@Override
	public ProgrammingLanguage getById(int id) {

		for (ProgrammingLanguage programmingLanguage : languages) {

			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}

		}
		return null;

	}

}
