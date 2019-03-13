package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Lidwoord;

public class LidwoordDaoImpl extends OracleBaseDao implements LidwoordDao{
	
	private Connection conn;
	
    public LidwoordDaoImpl() {
        try{
            conn = super.getConnection();
        }
        catch(SQLException e){
            System.out.println("Error: could not connect to database.");
            e.printStackTrace();
        }
    }

	@Override
	public Lidwoord findTranslation(String nederlands) {
		try {
            String queryText =  "SELECT * " +
                    "FROM LIDWOORD " +
                    "WHERE NEDERLANDS = ?";

            PreparedStatement stmt = conn.prepareStatement(queryText);
            stmt.setString(1, nederlands);
            ResultSet result = stmt.executeQuery();

            result.next();
            String engels = result.getString("engels");

            return new Lidwoord(nederlands, engels);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
}
	}

}
