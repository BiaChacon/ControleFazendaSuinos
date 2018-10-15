package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import persistencia.SuinoDAO;

public class ControladorRemoverSuinos {
    private SuinoDAO suinoDAO = new SuinoDAO();
    @FXML
        private JFXButton btRemoverSuino;
    @FXML
        private JFXTextField textIDSuino;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
     @FXML
	private void removerSuino() {
        
        int id = Integer.parseInt(textIDSuino.getText());
        
        suinoDAO.deleteFromSuino(id);
        
        ControladorPrincipal.controlador.suinos();
        }
}
