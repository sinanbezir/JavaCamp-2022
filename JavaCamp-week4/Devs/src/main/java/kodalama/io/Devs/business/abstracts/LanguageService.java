package kodalama.io.Devs.business.abstracts;

import java.util.List;

import kodalama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language) throws Exception;
	void delete(Language language);
	Language getByID(int id);
	void update(String language,String newLanguage) throws Exception;
}
