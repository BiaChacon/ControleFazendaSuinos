package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.sql.Date;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import modelo.Suino;

public class ControladorBaias {
  @FXML
    private AnchorPane anchorBaias;
  @FXML
    private BorderPane borderBaias;
  @FXML
    private  JFXButton btAdicionar, btRemover;
  
  @FXML
       private TableView<Suino> tabelaBaias;
  @FXML
       private TableColumn<Suino, Integer > colunaID;
  
  @FXML
       private TableColumn<Suino, String> colunaTamanho;
  
  @FXML
       private TableColumn<Suino, Date> colunaLimpeza;
  
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
