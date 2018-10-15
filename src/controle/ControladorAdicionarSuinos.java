package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.util.Date;
import javafx.fxml.FXML;
import persistencia.SuinoDAO;
import java.time.ZoneId;


public class ControladorAdicionarSuinos {
    private SuinoDAO suinoDAO = new SuinoDAO();
    @FXML
        private JFXTextField textNome; 
    @FXML
        private JFXDatePicker dateAquisicao, dateNascimento;
    @FXML
        private JFXButton btCadastarSuino;
    
    ControladorPrincipal controlador = new ControladorPrincipal();
    
    @FXML
	private void cadastrarSuino() {
            Date da = Date.from(dateAquisicao.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            Date dn = Date.from(dateNascimento.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            java.sql.Date dnSql = new java.sql.Date(dn.getTime());
            java.sql.Date daSql = new java.sql.Date(da.getTime());
            
            suinoDAO.insertIntoSuino(textNome.getText(), dnSql , daSql);
            
            ControladorPrincipal.controlador.suinos();
        }
}
    
