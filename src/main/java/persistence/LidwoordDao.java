package persistence;

import model.Lidwoord;

public interface LidwoordDao {
	
	boolean exist(String nederlands);
	Lidwoord findTranslation(String nederlands);

}
