package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.sql.Date;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import modelo.Baia;
import modelo.Suino;
import persistencia.SuinoDAO;

public class ControladorSuinos {
    SuinoDAO suinoDAO = new SuinoDAO();
    @FXML
    private AnchorPane anchorSuinos;
    @FXML
    private BorderPane borderSuinos;
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
        public void tabelaBaia(){
            colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
            
            colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            
            colunaDataNascimento.setCellValueFactory(new PropertyValueFactory<>("DataNascimento"));
            
            colunaDataAquisicao.setCellValueFactory(new PropertyValueFactory<>("DtaAquisicao"));
            
            tabelaSuinos.setItems((ObservableList<Suino>) suinoDAO.readSuinos());
        }

    @FXML
	private void adicionarSuino() {
            try {
		Parent adicionarSuino =  FXMLLoader.load(getClass().getResource("/visao/AdicionarSuinos.fxml"));
		borderSuinos.setCenter(adicionarSuino);	
		} catch (IOException e) {
		}	
	} 
    @FXML
	private void removerSuino() {
            try {
		Parent removerSuino =  FXMLLoader.load(getClass().getResource("/visao/RemoverSuinos.fxml"));
		borderSuinos.setCenter(removerSuino);	
		} catch (IOException e) {
		}	
	} 
}
