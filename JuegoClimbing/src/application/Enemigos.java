package application;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Enemigos {
	public static double ballSpeed = 10;
	int ex, ey = 100, radioE = 20;
	public void enemigo(Stage Stage2){
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root,900,800);
		Random animacion = new Random();
		ex = (animacion.nextInt(2) * 300 + 50);
		
		Circle c3=new Circle(ex, ey, radioE);

		c3.setFill(Color.BLUE);
		
		c3.setTranslateY(ey);
		c3.setTranslateX(ex);
		root.getChildren().addAll(c3);
		Stage2.setScene(scene);
		Stage2.show();
		
	}
}
