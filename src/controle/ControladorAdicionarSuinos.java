package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import persistencia.SuinoDAO;


public class ControladorAdicionarSuinos {
    private SuinoDAO suinoDAO = new SuinoDAO();
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
    
