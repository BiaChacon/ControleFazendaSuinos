package principal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Principal extends Application {

	
	public static void main(String[] args) {
		launch(args);
	
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/visao/Principal.fxml"));
                Scene scene = new Scene(root);

                stage.centerOnScreen();
                stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
                stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());

                stage.setScene(scene);
                stage.setTitle("Pobol");
                stage.show();
	}

}

