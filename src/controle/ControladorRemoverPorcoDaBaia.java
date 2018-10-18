package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import modelo.Suino;
import persistencia.PorcoBaiaDAO;
import persistencia.SuinoDAO;

public class ControladorRemoverPorcoDaBaia implements Initializable {

    private SuinoDAO suinoDAO = new SuinoDAO();
    private PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();

    private ObservableList<Suino> listaSuino = FXCollections.observableArrayList();

    @FXML
    private JFXComboBox<Suino> cbPorco;

    @FXML
    private JFXButton btRemover;

    @FXML
    private void removerPorcoDaBaia() {
        Suino s = cbPorco.getSelectionModel().getSelectedItem();

        porcoBaiaDAO.deleteFromPorcoBaia(s.getId());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listaSuino.addAll(suinoDAO.readSuinos());
        cbPorco.setItems(listaSuino);
    }

}
