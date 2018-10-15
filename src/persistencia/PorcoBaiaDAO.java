package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PorcoBaiaDAO {
  private ConnectionDatabase c = new ConnectionDatabase();

    private final String INSERT = "INSERT INTO PORCOBAIA(id) VALUES (?);";
    
    private final String DELETE = "DELETE FROM PORCOBAIA WHERE id = ?;";
    
    private final String LIST = "SELECT * FROM PORCOBAIA ORDER BY idBaia";
    
    
    public void insertIntoPorcoBaia(int idPorco, int idBaia) {
    c.dbConnection();
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(INSERT);
            pst.setInt(1, idBaia);
            pst.setInt(2, idPorco);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    c.dbConnectionClose();
        
    }
        
    public void deleteFromPorcoBaia(int id) {
        try {
            c.dbConnection();
            PreparedStatement pst = c.getConnection().prepareStatement(DELETE);
            pst.setInt(1, id);
            pst.execute();
            c.dbConnectionClose();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void readPorcoBaia() {
        try {
            c.dbConnection();
            PreparedStatement ps;
            ps = c.getConnection().prepareStatement(LIST); 
            
            ResultSet rs = ps.executeQuery(); 
   
            c.dbConnectionClose();
	}catch (SQLException e) {
                    e.printStackTrace();
        }
    }     
}
