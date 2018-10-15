package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javax.swing.JOptionPane;
import modelo.Suino;

public class ControladorColocarPorcoNaBaia {
    @FXML
        private JFXComboBox cbPorco, cbBaia;
    
    @FXML
        private JFXButton btColocar;
    
    /*public  List ComboPorco()  {
        List<Suino> listPorco = new ArrayList<Suino>();
        try{
            Connection c = Connection.getConnection();
            String sql = null;
            // sql = "select descricao,data_ocorrencia,servico,placa,nomecliente,nomeveiculo from ocorrencia where idocorrencia=? ";
                    sql = "SELECT nome FROM SUINO ";
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        while(rs.next()){   
     Suino s = new Suino();
                Suino.setId(rs.getString("id"));   }   
    pst.close();  
    rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            return listPorco;}
    JFXComboBox defaultComboBox = new JFXComboBox(strList.values());   
    cbPorco.setModel(defaultComboBoxModel);
    */
    @FXML
        private void colocarPorcoNaBaia(){
        
        }
}
