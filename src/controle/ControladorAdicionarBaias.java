package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import persistencia.BaiaDAO;

public class ControladorAdicionarBaias {
    private BaiaDAO baiaDAO = new BaiaDAO();
    @FXML
        private JFXTextField textTamanho;
    @FXML
        private JFXButton btCadastarBaia;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void cadastrarBaia() {
            double tamanho = Double.parseDouble( textTamanho.getText()); ;
                    
            baiaDAO.insertIntoBaia(tamanho);
            
            ControladorPrincipal.controlador.baias();
        }
}
