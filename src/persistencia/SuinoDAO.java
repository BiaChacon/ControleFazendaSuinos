package persistencia;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Suino;

public class SuinoDAO {
    private ConnectionDatabase c = new ConnectionDatabase();

    private final String INSERT = "INSERT INTO SUINO(nome, DataNascimento, DataAquisicao) VALUES (?, ?, ?);";
    
    private final String DELETE = "DELETE FROM SUINO WHERE id = ?;";
    
    private final String LIST = "SELECT * FROM SUINO ORDER BY id";
    
    
    public void insertIntoSuino(String nome, Date dataNasc, Date dataAq) {
    c.dbConnection();
        System.err.println("Data "+dataNasc.getTime());
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(INSERT);
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
     public List<Suino> readSuinos() {
        ArrayList<Suino> listaSuinos = new ArrayList<>();
        try {
            c.dbConnection();
            PreparedStatement ps;
            ps = c.getConnection().prepareStatement(LIST); 
            
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) { 
                Suino s = new Suino(
                        rs.getInt("id"), 
                        rs.getString("nome"), 
                        rs.getDate("DataNascimento"),
                        rs.getDate("DataAquisicao")
                );
                    listaSuinos.add(s);
                }
                c.dbConnectionClose();
		} catch (SQLException e) {
                    e.printStackTrace();
		}
        return listaSuinos;
    }
}
