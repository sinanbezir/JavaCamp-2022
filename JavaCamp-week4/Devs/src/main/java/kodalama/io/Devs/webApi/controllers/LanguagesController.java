package kodalama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodalama.io.Devs.business.abstracts.LanguageService;
import kodalama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguagesController {

	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}
	
	@GetMapping("/getid")
	public Language getById(int id) {
		return languageService.getByID(id);
	}
	
	@PostMapping("/update")
	public void update(String language, String newLanguage) throws Exception {
		languageService.update(language, newLanguage);
	}
}
