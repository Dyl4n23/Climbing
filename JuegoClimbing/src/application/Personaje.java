package application;

import com.sun.javafx.perf.PerformanceTracker;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Personaje {
	public static double ballSpeed = 500;
	int a=225,b=700, radio=5;
	public void personaje(Stage Stage2){
		Pane root = new Pane();
		Scene scene = new Scene(root, 900, 800);
		Circle c1=new Circle(a,b,radio);

		c1.setFill(Color.RED);

		c1.setTranslateX(a);

		scene.setOnKeyPressed(event ->{
			if (event.getCode() == KeyCode.RIGHT){
				a=a+300;
				c1.setTranslateX(a);
			}
			if (event.getCode() == KeyCode.LEFT){
				a=a-300;
				c1.setTranslateX(a);
			}

		});
		root.getChildren().addAll(c1);
		Stage2.setScene(scene);
		Stage2.show();
		//animacion del personaje
		AnimationTimer animationTimer = new AnimationTimer() {
			public void handle(long now) {
				// Mostrar la frecuencia de refresco FPS
				//PerformanceTracker perfTracker = PerformanceTracker.getSceneTracker(scene);
				//label.setText("FPS (AnimationTimer) = " + perfTracker.getInstantFPS());
				//Cambiar la dirección de la bola si llega a los extremos
				if(c1.getTranslateY() < 200 || c1.getTranslateY() > 700) {
					ballSpeed *= -1;
				} 
				c1.setTranslateY(c1.getTranslateY() + ballSpeed);
			}
		};
		animationTimer.start();
	}
}
