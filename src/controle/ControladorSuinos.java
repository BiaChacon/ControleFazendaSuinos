package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import modelo.Suino;
import persistencia.SuinoDAO;

public class ControladorSuinos implements Initializable {
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
    
     private ObservableList<Suino> listaSuino = FXCollections.observableArrayList();
     
        public void tabelaSuino(){
            
            listaSuino.clear();
            listaSuino.addAll(suinoDAO.readSuinos());
            tabelaSuinos.setItems(listaSuino);
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            colunaID.setCellValueFactory(new PropertyValueFactory<Suino, Integer>("id"));
            
           colunaNome.setCellValueFactory(new PropertyValueFactory<Suino, String>("nome"));
            
          colunaDataNascimento.setCellValueFactory(new PropertyValueFactory<Suino, Date>("datanas"));
            
           colunaDataAquisicao.setCellValueFactory(new PropertyValueFactory<Suino, Date>("dataaqui"));
            
            tabelaSuino();
    }
}
