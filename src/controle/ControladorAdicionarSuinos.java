package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class ControladorAdicionarSuinos {
    @FXML
        private JFXTextField textNome, textDataAquisicao, textDataNascimento;
    @FXML
        private JFXButton btCadastarSuino;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void cadastrarSuino() {
            
          ControladorPrincipal.controlador.suinos();
        }
}
    
