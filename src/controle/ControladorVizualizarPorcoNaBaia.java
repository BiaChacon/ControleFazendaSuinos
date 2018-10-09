package controle;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import modelo.Baia;
import modelo.Suino;

public class ControladorVizualizarPorcoNaBaia {
  @FXML
       private TableView<Suino> tabelaPorcoBaia;
  @FXML
       private TableColumn<Baia, Integer > colunaBaia;
  
  @FXML
       private TableColumn<Suino, String> colunaPorco;
}
