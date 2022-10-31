package kodlamaio.programmingLanguages.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.programmingLanguages.business.abstracts.ProgrammingLanguageService;
import kodlamaio.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	boolean isItExist=false;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage language) throws Exception {

		if (language.getName() == null||language.getName().length()==0) {
			throw new Exception("Name can not be empty! Please try again");
		} else {
			for (ProgrammingLanguage programmingLanguage : languageRepository.getAll()) {
				if (isTheLanguageExist(language)==true) {
					throw new Exception("Sorry that name is already existed");
				} else {
					System.out.println(language.getName()+" has been add to list with the id of : "+language.getId());
					languageRepository.add(language);
				}
			}
		}

	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage programmingLanguage : languageRepository.getAll()) {
			if(programmingLanguage.getId()==id) {
				languageRepository.delete(id);
			}else {
				System.out.println("There is no such programming language with that id");
			}
		}
	}

	@Override
	public void update(int id, String newName) {
		for (ProgrammingLanguage programmingLanguage : languageRepository.getAll()) {
			if(programmingLanguage.getId()==id) {
				if(programmingLanguage.getName()==newName) {
					System.out.println("Sorry that programming language is already existed");
				}else {
					languageRepository.update(id, newName);
				}
			}
			
		}

	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);

	}

	@Override
	public boolean isTheLanguageExist(ProgrammingLanguage language) {
		
		for (ProgrammingLanguage pLanguage : languageRepository.getAll()) {
			if(pLanguage.getName().toUpperCase()==language.getName().toUpperCase()||pLanguage.getId()==language.getId()) {
				 isItExist=true;
			}
			
			
		}
		
		return isItExist;
	}

}
