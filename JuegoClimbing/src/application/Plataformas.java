package application;

import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Plataformas {

	int px, py = 200;
	Random r = new Random();

	public void grada(Stage Stage2){

		Pane root = new Pane();
		Scene scene = new Scene(root, 900, 800);
		px = ((r.nextInt(2)*300)+25);
		Rectangle r1=new Rectangle(px, py, 250, 50);
		r1.setFill(Color.GREEN);
		Recompenzas recompenzas = new Recompenzas();
		recompenzas.moneda(Stage2);
		root.getChildren().addAll(r1);
		Stage2.setScene(scene);
		Stage2.show();
	}

}

