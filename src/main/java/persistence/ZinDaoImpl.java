package persistence;



public class ZinDaoImpl extends OracleBaseDao implements ZinDao{
	
	LidwoordDao ldao = new LidwoordDaoImpl();
	WerkwoordDao wdao = new WerkwoordDaoImpl();
	
	@Override
	public boolean checkZin(String zin) {
		
		String[] woorden = zin.split(" ");
		
		String woord1 = woorden[0];
		String woord2 = woorden[1];
		String woord3 = woorden[2];
		String woord4 = woorden[3];
		String woord5 = woorden[4];
		
		if(ldao.exist(woord1) && wdao.exist(woord2)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String Representatie1(String zin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Representatie2(String zin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Representatie3(String zin) {
		// TODO Auto-generated method stub
		return null;
	}
}
