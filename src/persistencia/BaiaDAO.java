package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Baia;

public class BaiaDAO {
    private ConnectionDatabase c = new ConnectionDatabase();
    
    private final String INSERT = "INSERT INTO BAIA(Tamanho) VALUES (?);";
    private final String DELETE = "DELETE FROM BAIA WHERE id = ?;";
    private final String LIST = "SELECT * FROM BAIA;";
    
    public void insertIntoBaia(Double Tamanho) {
        c.dbConnection();
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(INSERT);
            pst.setDouble(1, Tamanho);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
    
    public void deleteFromBaia(int id) {
        try {
            c.dbConnection();
            PreparedStatement pst = c.getConnection().prepareStatement(DELETE);
            pst.setInt(1, id);
            pst.executeUpdate(); 
            c.dbConnectionClose();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Baia> readBaias() {
        ArrayList<Baia> listaBaias = new ArrayList<>();
        try {
            c.dbConnection();
            PreparedStatement ps;
            ps = c.getConnection().prepareStatement(LIST); 
            
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) { 
                Baia b = new Baia(
                        rs.getInt("id"), 
                        rs.getDouble("Tamanho"), 
                        rs.getBoolean("Limpeza")
                );
                    listaBaias.add(b);
                }
                c.dbConnectionClose();
		} catch (SQLException e) {
                    e.printStackTrace();
		}
        return listaBaias;
    }
}

