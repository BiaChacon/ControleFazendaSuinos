package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaiaDAO {
    private ConnectionDatabase c = new ConnectionDatabase();
    public void insertIntoBaia(Double Tamanho) {
        c.dbConnection();
        String query = "INSERT INTO BAIA(Tamanho) VALUES (?);";
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(query);
            pst.setDouble(1, Tamanho);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
    
    public void deleteFromBaia(int id) {
        c.dbConnection();
        String query = "DELETE FROM BAIA WHERE id = ?;";
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
    
    public void readBaias() {
        c.dbConnection();
        String query = "SELECT * FROM BAIA;";
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ": " + rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
}
