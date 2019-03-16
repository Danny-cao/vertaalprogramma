package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.ZelfstandigNaamwoord;

public class ZelfstandigNaamwoordDaoImpl extends OracleBaseDao implements ZelfstandigNaamwoordDao{

	
	private Connection conn;
	
	public ZelfstandigNaamwoordDaoImpl() {
        try{
            conn = super.getConnection();
        }
        catch(SQLException e){
            System.out.println("Error: could not connect to database.");
            e.printStackTrace();
        }
    }
	
	@Override
	public boolean exist(String nederlands) {
		
		try {
            String queryText =  "SELECT COUNT(*) as counter " +
                    "FROM ZELFSTANDIGNAAMWOORD " +
                    "WHERE NEDERLANDS = ?";

            PreparedStatement stmt = conn.prepareStatement(queryText);
            stmt.setString(1, nederlands);
            ResultSet result = stmt.executeQuery();
            
            result.next();
            int count = result.getInt("counter");
            
            if(count > 0) {
            	return true;
            }
            
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        	}
	}

	@Override
	public String findTranslation(String nederlands) {
		try {
            String queryText =  "SELECT engels " +
                    "FROM ZELFSTANDIGNAAMWOORD " +
                    "WHERE NEDERLANDS = ?";

            PreparedStatement stmt = conn.prepareStatement(queryText);
            stmt.setString(1, nederlands);
            ResultSet result = stmt.executeQuery();

            result.next();
            String engels = result.getString("engels");

            return engels;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        	}
	}

}
