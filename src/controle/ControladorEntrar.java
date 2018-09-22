package controle;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ControladorEntrar {
    @FXML
    private void entar() {
        Parent Principal;
        try {
            Principal = FXMLLoader.load(getClass().getResource("/visao/Principal.fxml"));
        } catch (NullPointerException | IOException ex) {
            return;
        }
            Scene scene = new Scene(Principal);
            Principal.getStagePrincipal().setScene(scene);
        
    }

}
