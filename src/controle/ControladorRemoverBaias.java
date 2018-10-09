package controle;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

public class ControladorRemoverBaias {
    @FXML
        private JFXButton btRemoverBaia;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void removerBaia() {
            
          ControladorPrincipal.controlador.baias();
        }  
}
