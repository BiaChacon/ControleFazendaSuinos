package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import persistencia.PorcoBaiaDAO;

public class ControladorRemoverPorcoDaBaia {

    private PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();

    @FXML
    private JFXComboBox cbPorco, cbBaia;

    @FXML
    private JFXButton btRemover;

    @FXML
    private void removerPorcoDaBaia() {
        /*Int --> cbBaia
        int idPorco = porcoBaiaDAO.pegarID();
        porcoBaiaDAO.deleteFromPorcoBaia(idPorco);*/
    }
}
