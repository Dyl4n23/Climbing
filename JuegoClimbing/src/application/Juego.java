package application;

import java.util.Random;

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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Juego {

	public static double ballSpeed1 = 10;
	int a=225,b=391,radio=10;
	int x, y;
	int px, py;
	int ex, ey = 100, radioE = 20;
	
	public static final double BALL_RADIUS = 10;
	public static double ballSpeed2 = 10;
	
	//int level
	Random r = new Random();

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
		for(int j = 0; j <= 1; j++){
			x = ((r.nextInt(5)*180) + 90);
			y = ((r.nextInt(8)*100 - 10));
			Circle c2=new Circle(x, y, 9);
			c2.setFill(Color.YELLOW);

			root.getChildren().addAll(c2);
		}

		//Plataformas
		for(int i = 0; i <= 2; i++){

			for(int j = 100; j <= 700; j += 100){
				px = ((r.nextInt(5)*180) + 40);
				py = j;
				Rectangle r1=new Rectangle(px, py, 100, 25);
				r1.setFill(Color.DARKRED);
				root.getChildren().addAll(r1);
			}

		}
		Stage2.setScene(scene);
		Stage2.show();
		
		//Enemigos
		Circle ball = new Circle(BALL_RADIUS);
		ball.setTranslateX(900 * 0.5);
		ball.setTranslateY(290);
		ball.setFill(Color.BLUE);
		root.getChildren().addAll(ball);
		
		Circle ball1 = new Circle(BALL_RADIUS);
		ball1.setTranslateX(900 * 0.5);
		ball1.setTranslateY(490);
		ball1.setFill(Color.BLUE);
		root.getChildren().addAll(ball1);
		
		AnimationTimer animationTimer = new AnimationTimer() {
			public void handle(long now) {
				
				if(ball.getTranslateX() < 0 || ball.getTranslateX() > 450) {
					ballSpeed2 *= -1;
				} 
				ball.setTranslateX(ball.getTranslateX() + ballSpeed2);
				
				if(ball1.getTranslateX() < 450 || ball1.getTranslateX() > 900) {
					ballSpeed1 *= -1;
				} 
				ball1.setTranslateX(ball1.getTranslateX() + ballSpeed1);
			}
		};
		animationTimer.start();
		//Circle c3=new Circle(ex, ey, radioE);

		//c3.setFill(Color.BLUE);

		//c3.setTranslateY(ey);
		//c3.setTranslateX(ex);

		//Personaje
		Circle c1=new Circle(a,b,radio);

		c1.setFill(Color.RED);

		c1.setTranslateX(a);
		c1.setTranslateY(b);
		scene.setOnKeyPressed(event ->{
				if (event.getCode() == KeyCode.RIGHT){
					a += 180;
					c1.setTranslateX(a);
					b -= 100;
					c1.setTranslateY(b);
				}
				if (event.getCode() == KeyCode.LEFT){
					a -= 180;
					c1.setTranslateX(a);
					b -= 100;
					c1.setTranslateY(b);
				}
				if (event.getCode() == KeyCode.UP){
					b -= 100;
					c1.setTranslateY(b);
				}
		});
		root.getChildren().addAll(c1);
		Stage2.setScene(scene);
		Stage2.show();

		//Personaje p = new Personaje();
		//p.personaje(Stage2);

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