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
import kodlamaio.programmingLanguages.business.requests.languages.CreateProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.DeleteProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.requests.languages.UpdateProgrammingLanguageRequest;
import kodlamaio.programmingLanguages.business.responses.languages.GetAllProgrammingLanguageResponse;
import kodlamaio.programmingLanguages.business.responses.languages.GetProgrammingLanguagesByIdResponse;
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
	public List<GetAllProgrammingLanguageResponse> getAll() {
		return languageService.getAll();
	}
	@PostMapping("/add")
	void add(CreateProgrammingLanguageRequest language) throws Exception {
		languageService.add(language);
	}
	@DeleteMapping("/delete")
	void delete(DeleteProgrammingLanguageRequest language) {
		languageService.delete(language);
	}
	@PutMapping("/update")
	void update(UpdateProgrammingLanguageRequest language) {
		languageService.update(language);
	}
	@GetMapping("/getbyid")
	ProgrammingLanguage getById(GetProgrammingLanguagesByIdResponse language) {
		return languageService.getById(language);
	}
}
