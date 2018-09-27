package principal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Principal extends Application {
    private Stage stage1;
    public Stage getStagePrincipal(){
        return stage1;
    }
    public Stage getStageEntrar(){
        return stage1;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/visao/Entrar.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        stage1 = stage;
        stage.setTitle("Pobol");
    }
    public static void main(String[] args) {
        launch(args);
    }
}

