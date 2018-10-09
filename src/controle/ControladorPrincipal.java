package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ControladorPrincipal implements Initializable{
        static ControladorPrincipal controlador;
        
	@FXML
	private JFXButton btInicio, btSuinos, btBaias, btColocarPorcoNaBaia, btRemoverPorcoDaBaia, btVizualizarPorcoNaBaia;
	
	@FXML
	private BorderPane borderPrincipal;
	
	@FXML
	private AnchorPane anchorInicial;
	
	@FXML
	private Label labelPrincipal;
        
        @FXML
	private void inicio() {
		borderPrincipal.setCenter(anchorInicial);
		labelPrincipal.setText("CONTROLE FAZENDA DE SUÍNOS");
	}
	
	@FXML
	 void suinos() {
		try {
			Parent suinos =  FXMLLoader.load(getClass().getResource("/visao/Suinos.fxml"));
			borderPrincipal.setCenter(suinos);
			labelPrincipal.setText("SUÍNOS");
		} catch (IOException e) {
		}	
	}
	
	@FXML
	void baias() {
		try {
			Parent baias = FXMLLoader.load(getClass().getResource("/visao/Baias.fxml"));
			borderPrincipal.setCenter(baias);
			labelPrincipal.setText("BAIAS");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	private void colocarPorcoNaBaia() {
		try {
			Parent colocarPorcoNaBaia = FXMLLoader.load(getClass().getResource("/visao/ColocarPorcoNaBaia.fxml"));
			borderPrincipal.setCenter(colocarPorcoNaBaia);
			labelPrincipal.setText("COLOCAR PORCO NA BAIA");
		} catch (IOException e) {
		}
	}
        
        @FXML
	private void removerPorcoDaBaia() {
		try {
			Parent removerPorcoDaBaia = FXMLLoader.load(getClass().getResource("/visao/RemoverPorcoDaBaia.fxml"));
			borderPrincipal.setCenter(removerPorcoDaBaia);
			labelPrincipal.setText("REMOVER PORCO DA BAIA");
		} catch (IOException e) {
		}
	}
       
    @FXML
	private void  vizualizarPorcoNaBaia() {
		try {
			Parent  vizualizarPorcoNaBaia = FXMLLoader.load(getClass().getResource("/visao/VizualizarPorcoNaBaia.fxml"));
			borderPrincipal.setCenter(vizualizarPorcoNaBaia);
			labelPrincipal.setText("VIZUALIZAR PORCO DA BAIA");
		} catch (IOException e) {
		}
	}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        controlador = this;
    }
}
