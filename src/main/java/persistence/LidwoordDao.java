package persistence;

import model.Lidwoord;

public interface LidwoordDao {
	
	boolean exist(String nederlands);
	String findTranslation(String nederlands);

}
