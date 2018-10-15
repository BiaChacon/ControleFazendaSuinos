package controle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Baia;
import modelo.Suino;
import persistencia.PorcoBaiaDAO;

public class ControladorVizualizarPorcoNaBaia {
    PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();
    @FXML
       private TableView<Suino> tabelaPorcoBaia;
    @FXML
       private TableColumn<Baia, Integer > colunaBaia;
  
    @FXML
       private TableColumn<Suino, Integer> colunaPorco;
  
    @FXML
        public void tabelaBaia(){
            colunaBaia.setCellValueFactory(new PropertyValueFactory<>("BAIA_id"));
            
            colunaPorco.setCellValueFactory(new PropertyValueFactory<>("PORCO_id"));

            //tabelaPorcoBaia.setItems((ObservableList<PorcoBaia>) porcoBaiaDAO.readPorcoBaia());
        }
}
