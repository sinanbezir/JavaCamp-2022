package kodalama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodalama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language);
	void delete(Language language);
	void update(String language, String newLanguage);
	Language getByID(int id);
	
}
