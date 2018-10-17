package controle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import persistencia.PorcoBaiaDAO;



public class ControladorColocarPorcoNaBaia {
        private PorcoBaiaDAO porcoBaiaDAO = new PorcoBaiaDAO();
    
    //private ObservableList<Suino> listaSuino = FXCollections.observableArrayList();
    
    //Suino s = new Suino();
    @FXML
        private JFXComboBox cbPorco, cbBaia;
    
    @FXML
        private JFXButton btColocar;
    
    @FXML
        private void colocarPorcoNaBaia(){
          /*String --> cbPorco
            Int --> cbBaia
            int idPorco = porcoBaiaDAO.pegarID();
            int idBaia =  = Integer.parseInt(cbBaia);
        porcoBaiaDAO.insertIntoPorcoBaia(idPorco, idBaia);
            */
        }

    /*@Override
    public void initialize(URL location, ResourceBundle resources) {
        listaSuino.addAll(suinoDAO.readSuinos());
	cbPorco.setItems(listaSuino);
	new ComboBox<Suino>((ObservableList<Suino>) cbPorco);
    }*/
}