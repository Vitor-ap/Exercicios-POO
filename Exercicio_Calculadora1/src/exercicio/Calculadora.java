package exercicio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Calculadora extends Application {
    private String[] nomesBotoes = {    "1", "2", "3", "+",
                                        "4", "5", "6", "-",
                                        "7", "8", "9", "*",
                                        ".", "0", "=", "/"    };
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane panPrincipal = new BorderPane();
        TilePane teclasPainel = new TilePane();
        teclasPainel.setPrefColumns(4);
        teclasPainel.setPrefWidth(Double.MAX_VALUE);
        GridPane botaoCEeVisor = new GridPane();

        panPrincipal.setCenter(teclasPainel);
        panPrincipal.setTop(botaoCEeVisor);

        


        Button btnCE = new Button("CE");
        btnCE.prefHeight(50);
        TextField visor = new TextField();
        visor.setPrefHeight(50);
        visor.setPrefWidth(280);
        
        botaoCEeVisor.add(visor, 0, 0, 8, 1 );
        botaoCEeVisor.add(btnCE, 10, 0);
        botaoCEeVisor.setHgap(3);


        Scene scn = new Scene(panPrincipal, 320, 410);

        for (int i = 0; i < 16; i++) {
            String nome = nomesBotoes[i];
            Button btn = new Button(nome);
            btn.setPrefWidth(80);
            btn.setPrefHeight(90);
            btn.setFont(Font.font(20));
            btn.setMaxHeight(Double.MAX_VALUE);
            btn.setMaxWidth(Double.MAX_VALUE);


            teclasPainel.getChildren().add(btn);
        }

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}