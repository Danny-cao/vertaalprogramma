package persistence;

import model.ZelfstandigNaamwoord;

public interface ZelfstandigNaamwoordDao {

	boolean exist(String nederlands);
	String findTranslation(String nederlands);

}
