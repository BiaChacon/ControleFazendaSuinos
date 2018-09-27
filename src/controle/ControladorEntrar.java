package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import principal.Principal;

public class ControladorEntrar {
    Principal p = new Principal();
    @FXML
    private JFXButton btEntrar;
    @FXML
    private void entrar() {
        Parent Principal;
        try {
            Principal = FXMLLoader.load(getClass().getResource("/visao/Principal.fxml"));
        } catch (NullPointerException | IOException ex) {
            return;
        }
            Scene scene = new Scene(Principal);
            p.getStagePrincipal().setScene(scene);
            Stage s = new Stage();
            s.setScene(scene);
            
            
        
    }

}
