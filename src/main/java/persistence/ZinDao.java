package persistence;

import model.Zin;

public interface ZinDao {

	boolean checkZin(String zin);
	String Representatie1(String zin);
	Zin Representatie2(String zin);
	String Representatie3(String zin);
}
