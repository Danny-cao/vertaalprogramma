package persistence;

import model.Lidwoord;

public interface LidwoordDao {
	
	Lidwoord findTranslation(String nederlands);

}
