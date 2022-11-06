package kodalama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodalama.io.Devs.business.abstracts.LanguageService;
import kodalama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodalama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	private boolean languageIsEmpty(String language) {
		if(language.isEmpty() || language.trim().isEmpty()) {
			return true;
		}
		return false;
	}
	
	private boolean languageIsExcist(String language) {
		for (Language lang: languageRepository.getAll()) {
			if(lang.getName().equals(language))
				return true;
		}
		return false;
	}


	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}


	@Override
	public void add(Language language) throws Exception {
		if(languageIsExcist(language.getName())) {
			throw new Exception("Bu dil zaten kayıtlı");
		}
		else if(languageIsEmpty(language.getName())) {
			throw new Exception("Dil ismi boş olamaz.");
		}
		languageRepository.add(language);
	}


	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
	}


	@Override
	public Language getByID(int id) {
		return languageRepository.getByID(id);
		
	}


	@Override
	public void update(String language, String newLanguage) throws Exception {
		if(languageIsExcist(language)) {
			throw new Exception("Bu dil zaten kayıtlı");
		}
		else if(languageIsEmpty(language)) {
			throw new Exception("Dil ismi boş olamaz.");
		}
		languageRepository.update(language, newLanguage);
	}

}
