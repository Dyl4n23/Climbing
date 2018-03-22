package application;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Juego {

	public static double ballSpeed = 100;
	int a=225,b=785,radio=5;
	public void Escenario(Stage Stage2){
		Pane root = new Pane();
		Scene scene = new Scene(root,900,800);
		//Fondo
		Image l1=new Image("file:///C:/Users/dennys/Desktop/Climbing/JuegoClimbing/src/application/hjk.png");
		ImageView vi=new ImageView();
		vi.setImage(l1);
		vi.setFitWidth(900);
		vi.setFitHeight(800);
		root.getChildren().addAll(vi);
		Stage2.setScene(scene);
	    Stage2.show();
	    
		//Monedas
		Recompenzas m = new Recompenzas();
		//m.moneda(Stage2);

		//Plataformas
		Plataformas p = new Plataformas();
		//p.grada(Stage2);
		
		//Stage2.setScene(scene);
	    //Stage2.show();
		
		Enemigos e = new Enemigos();
		//e.enemigo(Stage2);

		//Personaje
		Circle c1=new Circle(a,b,radio);

		c1.setFill(Color.RED);

		c1.setTranslateX(a);

		scene.setOnKeyPressed(event ->{
			if (event.getCode() == KeyCode.RIGHT){
				a=a+180;
				c1.setTranslateX(a);
			}
			if (event.getCode() == KeyCode.LEFT){
				a=a-180;
				c1.setTranslateX(a);
			}
		});
		root.getChildren().addAll(c1);
		Stage2.setScene(scene);
		Stage2.show();
		
		//animacion del personaje
		AnimationTimer animationTimer = new AnimationTimer() {
			public void handle(long now) {
				
				if(c1.getTranslateY() < 500 || c1.getTranslateY() > 700) {
				ballSpeed *= -1;
				} 
				c1.setTranslateY(c1.getTranslateY() + ballSpeed);
			}
		};
		animationTimer.start();
		
		root.getChildren().addAll();
		
		//Boton Volver
		System.out.println("Funciona");
		Button botonVolver=new Button("VOLVER");
		botonVolver.setLayoutX(800);
		botonVolver.setLayoutY(10);
		botonVolver.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
		{

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				Main pp=new Main();
				pp.start(Stage2);
			}
		}
				);	
		//Stage2.setScene(scene);
		//Stage2.show();	
	}	
}