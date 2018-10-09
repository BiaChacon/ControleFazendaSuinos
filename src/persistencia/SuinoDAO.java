package persistencia;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuinoDAO {
    private ConnectionDatabase c = new ConnectionDatabase();
    public void insertIntoSuino(String nome, Date dataNasc, Date dataAq) {
        c.dbConnection();
        String query = "INSERT INTO SUINO(nome, DataNascimento, DataAquisicao) VALUES (?, ?, ?);";
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(query);
            pst.setString(1, nome);
            pst.setDate(2, dataNasc);
            pst.setDate(3, dataAq);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
    
    public void deleteFromSuino(int id) {
        c.dbConnection();
        String query = "DELETE FROM SUINO WHERE id = ?;";
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();
    }
    
    public void readSuinos() {
        c.dbConnection();
        String query = "SELECT * FROM SUINO;";
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
