package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class ControladorRemoverPorcoDaBaia {
    @FXML
        private JFXTextField textIDBaia;
    @FXML
        private JFXButton btRemoverBaia;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void removerBaia() {
            
          ControladorPrincipal.controlador.baias();
        }   
}
