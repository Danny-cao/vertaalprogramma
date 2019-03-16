package persistence;

import model.ZelfstandigNaamwoord;

public interface ZelfstandigNaamwoordDao {

	boolean exist(String nederlands);
	ZelfstandigNaamwoord findTranslation(String nederlands);

}
