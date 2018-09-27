package controle;

import java.sql.Date;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Jogo;

public class ControladorCalendario {
       @FXML
       private Button btAdicionarPartida, btCancelarPartida, btConcluirPartida;
       
       @FXML
       private TableView<Jogo> tabelaCalendario;
       
       @FXML
       private TableColumn<Jogo, Date> colunaDataHorario;
      
       @FXML
       private TableColumn<Jogo, String> colunaLocal;
       
       @FXML
       private TableColumn<Jogo, String> colunaTimeCasa;
       
       @FXML
       private TableColumn<Jogo, String> colunaX;
       
       @FXML
       private TableColumn<Jogo, String> colunaTimeFora;
    
       @FXML
       private TableColumn<Jogo, String> colunaCompeticao;
       
       @FXML
       private TableColumn<Jogo, String> colunaRendaPartida;
        
       /*@FXML
       private TableColumn<> colunaStatusPartida ;*/
       
       @FXML
       private void adicionarPartida(){
       
       }
       
       @FXML
       private void cancelarPartida(){
       
       }
       
       @FXML
       private void concluirPartida(){
       
       }
}
