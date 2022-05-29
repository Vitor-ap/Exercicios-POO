package exercicio;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;






public class BotaoPressionamento extends Application {

	@Override
	public void start(Stage stage) throws Exception {


		
	stage.setTitle("Exercicio Botão");	
	BorderPane pan = new BorderPane();
	Button bn = new Button("Aperte o Botão");
	Label lb = new Label("");
	
	
	Scene scn = new Scene(pan, 300,100);
	pan.setCenter(bn);
	pan.setTop(lb);
	stage.setScene(scn);
	stage.show();
	
	bn.setOnAction(e -> lb.setText("Botão Apertado"));
	
	}
	public static void main(String[] args) {
		Application.launch(BotaoPressionamento.class, args);
	}
	
}
	
	
		
	
	
	

	
