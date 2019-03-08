package persistence;

import model.Werkwoord;

public interface WerkwoordDao {
	
	Werkwoord findTranslation(String nederlands);
}
