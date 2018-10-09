package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class ControladorAdicionarBaias {
    @FXML
        private JFXTextField textTamanho;
    @FXML
        private JFXButton btCadastarBaia;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void cadastrarBaia() {
            
          ControladorPrincipal.controlador.baias();
        }
}
