package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.PorcoBaia;

public class PorcoBaiaDAO {

    private ConnectionDatabase c = new ConnectionDatabase();

    private final String INSERT = "INSERT INTO PORCOBAIA(idPorco, idBaia) VALUES (?, ?);";

    private final String DELETE = "DELETE FROM PORCOBAIA WHERE idPorco = ?;";

    private final String LIST = "SELECT * FROM PORCOBAIA ORDER BY idBaia";

    public String pegarNome(int id) throws SQLException {
        ResultSet rs = null;
        String nome = "";

        String query = ("SELECT nome FROM SUINO WHERE id = " + id + "");

        try {
            PreparedStatement stm = c.getConnection().prepareStatement(query);
            rs = stm.executeQuery(query);

            nome = rs.getString("nome");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nome;
    }

    public void insertIntoPorcoBaia(int idPorco, int idBaia) {
        c.dbConnection();
        try {
            PreparedStatement pst = c.getConnection().prepareStatement(INSERT);
            pst.setInt(1, idPorco);
            pst.setInt(2, idBaia);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        c.dbConnectionClose();

    }

    public void deleteFromPorcoBaia(int idPorco) {
        try {
            c.dbConnection();
            PreparedStatement pst = c.getConnection().prepareStatement(DELETE);
            pst.setInt(1, idPorco);
            pst.execute();
            c.dbConnectionClose();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PorcoBaia> readPorcoBaia() {
        ArrayList<PorcoBaia> listaPorcoBaia = new ArrayList<>();
        try {
            c.dbConnection();
            PreparedStatement ps;
            ps = c.getConnection().prepareStatement(LIST);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PorcoBaia pb = new PorcoBaia(
                        rs.getInt("idPorco"),
                        rs.getInt("idBaia")
                );
                listaPorcoBaia.add(pb);
            }
            c.dbConnectionClose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPorcoBaia;
    }
}
