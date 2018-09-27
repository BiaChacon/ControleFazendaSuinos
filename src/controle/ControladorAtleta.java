package controle;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Atleta;

public class ControladorAtleta {
       @FXML
       private JFXButton btCadastrar, btAtualizar, btRemover;
       
       @FXML
       private TableView<Atleta> tabelaAtleta;
       
       @FXML
       private TableColumn<Atleta, String > colunaNomeAtleta;
       
       @FXML
       private TableColumn<Atleta, Integer> colunaIdadeAtleta;
       
       @FXML
       private TableColumn<Atleta, Double> colunaSalarioAtleta;
       
       @FXML
       private TableColumn<Atleta, String> colunaCPFAtleta;
       
       @FXML
       private TableColumn<Atleta, Integer> colunaTelefoneAtleta;
       
       @FXML
       private TableColumn<Atleta, String> colunaEnderecoAtleta;
       
       @FXML
       private TableColumn<Atleta, Integer> colunaEmailAtleta;
       
       @FXML
       private void cadastrarAtleta(){
       
       }
       
       @FXML
       private void removerAtleta(){
       
       }
       
       @FXML
       private void atualizarAtleta(){
       
       }
       
        
}
