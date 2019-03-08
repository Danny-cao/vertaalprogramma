package persistence;

import model.ZelfstandigNaamwoord;

public interface ZelfstandigNaamwoordDao {
	
	ZelfstandigNaamwoord findTranslation(String nederlands);

}
