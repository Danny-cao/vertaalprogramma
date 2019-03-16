package persistence;

import model.Werkwoord;

public interface WerkwoordDao {
	
	boolean exist(String nederlands);
	String findTranslation(String nederlands);
}
