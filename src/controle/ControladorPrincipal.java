package controle;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import principal.Principal;

public class ControladorPrincipal {

	@FXML
	private JFXButton btInicio, btAtleta, btCalendario, btFinanceiro, btSobre, btSair;
	
	@FXML
	private BorderPane borderPrincipal;
	
	@FXML
	private AnchorPane anchorInicial;
	
	@FXML
	private Label labelPrincipal;
        
        @FXML
	private void inicio() {
		borderPrincipal.setCenter(anchorInicial);
		labelPrincipal.setText("INÍCIO");
	}
	
	@FXML
	private void gerenciarAtleta() {
		try {
			Parent gerenciarAtleta =  FXMLLoader.load(getClass().getResource("/visao/Atleta.fxml"));
			borderPrincipal.setCenter(gerenciarAtleta);
			labelPrincipal.setText("ATLETA");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	private void gerenciarJogos() {
		try {
			Parent gerenciarJogos = FXMLLoader.load(getClass().getResource("/visao/Calendario.fxml"));
			borderPrincipal.setCenter(gerenciarJogos);
			labelPrincipal.setText("CALENDÁRIO");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	private void financeiro() {
		try {
			Parent financeiro = FXMLLoader.load(getClass().getResource("/visao/Financeiro.fxml"));
			borderPrincipal.setCenter(financeiro);
			labelPrincipal.setText("FINANCEIRO");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void ajuda() {
		try {
			Parent sobre = FXMLLoader.load(getClass().getResource("/visao/Sobre.fxml"));
			borderPrincipal.setCenter(sobre);
			labelPrincipal.setText("SOBRE");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML
	private void sair() {
            try{
                Parent sair = FXMLLoader.load(getClass().getResource("/visao/Entrar.fxml"));
                Scene scene = new Scene(entrar);
                Principal.getStagePrincipal().setScene(scene);
            }catch(IOException e){
                e.printStackTrace();
            }
	}
	
    
}
