package persistence;



public class ZinDaoImpl extends OracleBaseDao implements ZinDao{
	
	LidwoordDao ldao = new LidwoordDaoImpl();
	WerkwoordDao wdao = new WerkwoordDaoImpl();
	ZelfstandigNaamwoordDao zdao = new ZelfstandigNaamwoordDaoImpl();
	
	@Override
	public boolean checkZin(String zin) {
		
		String[] woorden = zin.split(" ");
		
		String woord1 = woorden[0];
		String woord2 = woorden[1];
		String woord3 = woorden[2];
		String woord4 = woorden[3];
		String woord5 = woorden[4];
		
		if(ldao.exist(woord1) && wdao.exist(woord2) && zdao.exist(woord3) && ldao.exist(woord4) && wdao.exist(woord5)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String Representatie1(String zin) {
		if(checkZin(zin) == true) {
			// structuur
			return zin;
		} else {
			return "zin klopt niet";
		}
	}

	@Override
	public String Representatie2(String zin) {
		if(checkZin(zin) == true) {
			
			String[] woorden = zin.split(" ");
			
			String woord1 = ldao.findTranslation(woorden[0]);
			String woord2 = wdao.findTranslation(woorden[1]);
			String woord3 = zdao.findTranslation(woorden[2]);
			String woord4 = ldao.findTranslation(woorden[3]);
			String woord5 = wdao.findTranslation(woorden[4]);
			
			String vertaling = woord1 + " " + woord2 + " " + woord3 + " " + woord4 + " " + woord5;
			
			return vertaling;
		} else {
			return "Zin klopt niet";
		}
	}

	@Override
	public String Representatie3(String zin) {
		if(checkZin(zin) == true) {
			String[] woorden = zin.split(" ");
			
			String woord1 = wdao.findTranslation(woorden[1]);
			String woord2 = zdao.findTranslation(woorden[2]);
			String woord3 = wdao.findTranslation(woorden[4]);
			
			// switch return https image
			
			
			return zin;
		} else {
			return "zin klopt niet";
		}
	}
}
