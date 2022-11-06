package kodalama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodalama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodalama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguage implements LanguageRepository{

	List<Language> languages;
	
	
	public InMemoryLanguage() {
		languages = new ArrayList<>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"Python"));
	}



	@Override
	public List<Language> getAll() {
		return languages;
	}
	
	@Override
	public void add(Language language) {
		languages.add(language);
	}



	@Override
	public void delete(Language language) {
		for (Language lang : languages) {
			if(lang.getName().equals(language.getName())) {
				languages.remove(lang);
			}
		}
	}

	@Override
	public void update(String language, String newLanguage) {
		for (Language lang : languages) {
			if(lang.getName().equals(language)) {
				lang.setName(newLanguage);
			}
		}
		
	}

	@Override
	public Language getByID(int id) {
		for (Language language : languages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
	}

}
