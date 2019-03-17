package persistence;

import model.Zin;

public class ZinDaoImpl extends OracleBaseDao implements ZinDao{
	
	LidwoordDao ldao = new LidwoordDaoImpl();
	WerkwoordDao wdao = new WerkwoordDaoImpl();
	ZelfstandigNaamwoordDao zdao = new ZelfstandigNaamwoordDaoImpl();
	
	@Override
	public boolean checkZin(String zin) {
		
		try {
			String[] woorden = zin.split(" ");
			
			String woord1 = woorden[0];
			String woord2 = woorden[1];
			String woord3 = woorden[2];
			String woord4 = woorden[3];
			String woord5 = woorden[4];
			
			System.out.println(woord1 + "-" + woord2 + "-" + woord3 + "-" + woord4 +"-" + woord5);
			System.out.println(ldao.exist(woord1));
			System.out.println(zdao.exist(woord2));
			System.out.println(wdao.exist(woord3));
			System.out.println(ldao.exist(woord4));
			System.out.println(zdao.exist(woord5));
			if(ldao.exist(woord1) && zdao.exist(woord2) && wdao.exist(woord3) && ldao.exist(woord4) && zdao.exist(woord5)) {
				return true;
			}
			
			return false;
		}catch(Exception e) {
			return false;
		}

		

	}

	@Override
	public String Representatie1(String zin) {
		if(checkZin(zin) == true) {
			return zin;
		} else {
			return "zin klopt niet";
		}
	}

	@Override
	public Zin Representatie2(String zin) {
		if(checkZin(zin) == true) {
			
			String[] woorden = zin.split(" ");
			
			String woord1 = ldao.findTranslation(woorden[0]);
			String woord2 = zdao.findTranslation(woorden[1]);
			String woord3 = wdao.findTranslation(woorden[2]);
			String woord4 = ldao.findTranslation(woorden[3]);
			String woord5 = zdao.findTranslation(woorden[4]);
			
			String vertaling = woord1 + " " + woord2 + " " + woord3 + " " + woord4 + " " + woord5;
			
			return new Zin(zin, vertaling);
		} else {
			return null;
		}
	}

	@Override
	public String Representatie3(String zin) {
		if(checkZin(zin) == true) {
			String[] woorden = zin.split(" ");
			
			String woord1 = zdao.findTranslation(woorden[1]);
			String woord2 = wdao.findTranslation(woorden[2]);
			String woord3 = zdao.findTranslation(woorden[4]);
			
			if(woord1.equals("brood") && woord2.equals("laat") && woord3.equals("brood")) {
				
			}else if(woord1.equals("brood") && woord2.equals("laat") && woord3.equals("man")){
				
			}else if(woord1.equals("brood") && woord2.equals("laat") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("brood") && woord2.equals("eet") && woord3.equals("brood")){
				
			}else if(woord1.equals("brood") && woord2.equals("eet") && woord3.equals("man")){
				
			}else if(woord1.equals("brood") && woord2.equals("eet") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("brood") && woord2.equals("koopt") && woord3.equals("brood")){
				
			}else if(woord1.equals("brood") && woord2.equals("koopt") && woord3.equals("man")){
				
			}else if(woord1.equals("brood") && woord2.equals("koopt") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("brood") && woord2.equals("snijdt") && woord3.equals("brood")){
				
			}else if(woord1.equals("brood") && woord2.equals("snijdt") && woord3.equals("man")){
				
			}else if(woord1.equals("brood") && woord2.equals("snijdt") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("man") && woord2.equals("laat") && woord3.equals("brood")){
				
			}else if(woord1.equals("man") && woord2.equals("laat") && woord3.equals("man")){
				
			}else if(woord1.equals("man") && woord2.equals("laat") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("man") && woord2.equals("eet") && woord3.equals("brood")){
				
			}else if(woord1.equals("man") && woord2.equals("eet") && woord3.equals("man")){
				
			}else if(woord1.equals("man") && woord2.equals("eet") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("man") && woord2.equals("koopt") && woord3.equals("brood")){
				
			}else if(woord1.equals("man") && woord2.equals("koopt") && woord3.equals("man")){
				
			}else if(woord1.equals("man") && woord2.equals("koopt") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("man") && woord2.equals("snijdt") && woord3.equals("brood")){
				
			}else if(woord1.equals("man") && woord2.equals("snijdt") && woord3.equals("man")){
				
			}else if(woord1.equals("man") && woord2.equals("snijdt") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("boer") && woord2.equals("laat") && woord3.equals("brood")){
				
			}else if(woord1.equals("boer") && woord2.equals("laat") && woord3.equals("man")){
				
			}else if(woord1.equals("boer") && woord2.equals("laat") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("boer") && woord2.equals("eet") && woord3.equals("brood")){
				
			}else if(woord1.equals("boer") && woord2.equals("eet") && woord3.equals("man")){
				
			}else if(woord1.equals("boer") && woord2.equals("eet") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("boer") && woord2.equals("koopt") && woord3.equals("brood")){
				
			}else if(woord1.equals("boer") && woord2.equals("koopt") && woord3.equals("man")){
				
			}else if(woord1.equals("boer") && woord2.equals("koopt") && woord3.equals("boer")){
				
			}
			
			else if(woord1.equals("boer") && woord2.equals("snijdt") && woord3.equals("brood")){
				
			}else if(woord1.equals("boer") && woord2.equals("snijdt") && woord3.equals("man")){
				
			}else if(woord1.equals("boer") && woord2.equals("snijdt") && woord3.equals("boer")){
				
			}
			
			return zin;
		} else {
			return "zin klopt niet";
		}
	}
}
