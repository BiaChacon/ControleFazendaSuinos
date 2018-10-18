package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelo.Baia;
import modelo.Suino;
import persistencia.BaiaDAO;
import persistencia.PorcoBaiaDAO;
import persistencia.SuinoDAO;

public class ControladorColocarPorcoNaBaia implements Initializable {

    private PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();

    private SuinoDAO suinoDAO = new SuinoDAO();

    private BaiaDAO baiaDAO = new BaiaDAO();

    private ObservableList<Suino> listaSuino = FXCollections.observableArrayList();

    private ObservableList<Baia> listaBaia = FXCollections.observableArrayList();

    @FXML
    private JFXComboBox<Suino> cbPorco;

    @FXML
    private JFXComboBox<Baia> cbBaia;

    @FXML
    private JFXButton btColocar;

    @FXML
    private void colocarPorcoNaBaia() {
        Suino s = cbPorco.getSelectionModel().getSelectedItem();
        Baia b = cbBaia.getSelectionModel().getSelectedItem();
        porcoBaiaDAO.insertIntoPorcoBaia(s.getId(), b.getId());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listaSuino.addAll(suinoDAO.readSuinos());
        cbPorco.setItems(listaSuino);
        listaBaia.addAll(baiaDAO.readBaias());
        cbBaia.setItems(listaBaia);

    }
}
