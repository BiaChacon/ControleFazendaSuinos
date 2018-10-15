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
import persistencia.BaiaDAO;


public class ControladorBaias {
    BaiaDAO baiaDAO = new BaiaDAO();
    @FXML
        private AnchorPane anchorBaias;
    @FXML
        private BorderPane borderBaias;
    @FXML
        private  JFXButton btAdicionar, btRemover;
  
    @FXML
        private TableView<Baia> tabelaBaias;
    @FXML
        private TableColumn<Baia, Integer > colunaID;
  
    @FXML
        private TableColumn<Baia, String> colunaTamanho;
  
    @FXML
        private TableColumn<Baia, Date> colunaLimpeza;
    
    @FXML
        public void tabelaBaia(){
            colunaID.setCellValueFactory(new PropertyValueFactory<>("id"));
            
            colunaTamanho.setCellValueFactory(new PropertyValueFactory<>("Tamanho"));
            
            colunaLimpeza.setCellValueFactory(new PropertyValueFactory<>("Limpeza"));

            tabelaBaias.setItems((ObservableList<Baia>) baiaDAO.readBaias());
        }
  
    @FXML
	private void adicionarBaia() {
            try {
		Parent adicionarBaia =  FXMLLoader.load(getClass().getResource("/visao/AdicionarBaias.fxml"));
		borderBaias.setCenter(adicionarBaia);	
		} catch (IOException e) {
		}	
	} 
    @FXML
	private void removerBaia() {
            try {
		Parent removerBaia =  FXMLLoader.load(getClass().getResource("/visao/RemoverBaias.fxml"));
		borderBaias.setCenter(removerBaia);	
		} catch (IOException e) {
		}	
	} 
}
