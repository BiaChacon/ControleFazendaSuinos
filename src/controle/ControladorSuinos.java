package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.sql.Date;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Suino;

public class ControladorSuinos {
  @FXML
    private  JFXButton btAdicionar, btRemover;
  
  @FXML
       private TableView<Suino> tabelaSuinos;
  @FXML
       private TableColumn<Suino, Integer > colunaID;
  
  @FXML
       private TableColumn<Suino, String> colunaNome;
  
  @FXML
       private TableColumn<Suino, Date> colunaDataNascimento;
  
  @FXML
       private TableColumn<Suino, Date> colunaDataAquisicao;
  
    @FXML
	private void adicionarSuino() {
            try {
		Parent adicionarSuino =  FXMLLoader.load(getClass().getResource("/visao/AdicionarSuinos.fxml"));
			
		} catch (IOException e) {
		}	
	} 
    @FXML
	private void removerSuino() {
            try {
		Parent Suino =  FXMLLoader.load(getClass().getResource("/visao/RemoverSuinos.fxml"));
			
		} catch (IOException e) {
		}	
	} 
}
