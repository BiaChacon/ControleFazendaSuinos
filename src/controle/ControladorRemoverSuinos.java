package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class ControladorRemoverSuinos {
    @FXML
        private JFXButton btRemoverSuino;
    @FXML
        private JFXTextField textIDSuino;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
     @FXML
	private void removerSuino() {
            
        ControladorPrincipal.controlador.suinos();
        }
}
