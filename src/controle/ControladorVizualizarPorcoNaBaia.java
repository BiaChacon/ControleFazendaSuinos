package controle;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.PorcoBaia;
import persistencia.PorcoBaiaDAO;

public class ControladorVizualizarPorcoNaBaia implements Initializable {

    PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();

    @FXML
    private TableView<PorcoBaia> tabelaPorcoBaia;

    @FXML
    private TableColumn<PorcoBaia, Integer> colunaBaia;

    @FXML
    private TableColumn<PorcoBaia, String> colunaPorco;

    private ObservableList<PorcoBaia> listaPorcoBaia = FXCollections.observableArrayList();

    public void tabelaPorcoBaia() {

        listaPorcoBaia.clear();

        List<PorcoBaia> porcos = porcoBaiaDAO.readPorcoBaia();

        for (PorcoBaia p : porcos) {
            p.setNome(porcoBaiaDAO.pegarNome(p.getIdPorco()));

        }

        listaPorcoBaia.addAll(porcos);

        tabelaPorcoBaia.setItems(listaPorcoBaia);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colunaBaia.setCellValueFactory(new PropertyValueFactory<PorcoBaia, Integer>("idBaia"));

        colunaPorco.setCellValueFactory(new PropertyValueFactory<PorcoBaia, String>("nome"));

        tabelaPorcoBaia();
    }
}
