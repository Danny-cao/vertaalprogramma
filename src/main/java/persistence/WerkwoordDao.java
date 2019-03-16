package persistence;

import model.Werkwoord;

public interface WerkwoordDao {
	
	boolean exist(String nederlands);
	Werkwoord findTranslation(String nederlands);
}
