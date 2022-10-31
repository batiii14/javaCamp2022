package kodlamaio.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.programmingLanguages.business.abstracts.ProgrammingLanguageService;
import kodlamaio.programmingLanguages.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();
	}
	@PostMapping("/add")
	void add(ProgrammingLanguage language) throws Exception {
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	void delete(int id) {
		languageService.delete(id);
	}
	@PutMapping("/update")
	void update(int id, String newName) {
		languageService.update(id, newName);
	}
	@GetMapping("/getbyid")
	ProgrammingLanguage getById(int id) {
		return languageService.getById(id);
	}
}
