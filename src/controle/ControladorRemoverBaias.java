package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import persistencia.BaiaDAO;

public class ControladorRemoverBaias {
    private BaiaDAO baiaDAO = new BaiaDAO();
    @FXML
    private JFXButton btRemoverBaia;
    
    @FXML
    private JFXTextField textIDBaia;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void removerBaia() {
            int id = Integer.parseInt(textIDBaia.getText());
        
            baiaDAO.deleteFromBaia(id);
         
            ControladorPrincipal.controlador.baias();
        }  
}
