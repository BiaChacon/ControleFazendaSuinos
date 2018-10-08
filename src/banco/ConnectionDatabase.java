/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ConnectionDatabase {
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/ControleFazendaSuinos";
    private String user = "postgres";
    private String password = "postgre";
    
    public void dbConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("not connected");
        }
    }
    
    public void dbConnectionClose() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertIntoSuino(String nome, Date dataNasc, Date dataAq) {
        dbConnection();
        String query = "INSERT INTO SUINO(nome, DataNascimento, DataAquisicao) VALUES (?, ?, ?);";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, nome);
            pst.setDate(2, dataNasc);
            pst.setDate(3, dataAq);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbConnectionClose();
    }
    
    public void deleteFromPorco(int id) {
        dbConnection();
        String query = "DELETE FROM PORCO WHERE id = ?;";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbConnectionClose();
    }
    
    public void readSuinos() {
        dbConnection();
        String query = "SELECT * FROM SUINOS;";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ": " + rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbConnectionClose();
    }
}
