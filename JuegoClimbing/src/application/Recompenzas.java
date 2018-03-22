package application;

import java.util.Random;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Recompenzas {
	int x, y= 300;
	Random r = new Random();
	public void moneda(Stage Stage2){
		Pane root = new Pane();
		Scene scene = new Scene(root,900,800);
		x = ((r.nextInt(2)*300)+150);
		Circle c2=new Circle(x, y, 10);
		c2.setFill(Color.YELLOW);
		root.getChildren().addAll(c2);
		Stage2.setScene(scene);
		Stage2.show();
	}
}
