package application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Juego {

	public static double ballSpeed = 10;
	int a=225,b=785;
	public void Escenario(Stage Stage2){
		Pane root = new Pane();
		Scene scene = new Scene(root,900,800);
		//Fondo
		Image l1=new Image("file:///C:/Users/dennys/workspace/JuegoClimbing/src/application/Tierra.jpg");
		ImageView vi=new ImageView();
		vi.setImage(l1);
		vi.setFitWidth(900);
		vi.setFitHeight(800);
		Image l2=new Image("file:///C:/Users/dennys/workspace/JuegoClimbing/src/application/Tierra1.png");
		ImageView vi1=new ImageView();
		vi1.setImage(l2);
		vi1.setFitWidth(900);
		vi1.setFitHeight(800);
		Image l3=new Image("file:///C:/Users/dennys/workspace/JuegoClimbing/src/application/Cielo.jpg");
		ImageView vi2=new ImageView();
		vi2.setImage(l3);
		vi2.setFitWidth(1010);
		vi2.setFitHeight(810);
		Image l4=new Image("file:///C:/Users/dennys/workspace/JuegoClimbing/src/application/1.png");
		ImageView vi3=new ImageView();
		vi3.setImage(l4);
		vi3.setFitWidth(1010);
		vi3.setFitHeight(810);

		//Monedas
		//Recompenzas m = new Recompenzas();
		//m.moneda(Stage2);

		//Plataformas
		//Plataformas p = new Plataformas();
		//p.grada(Stage2);
		
		//Stage2.setScene(scene);
	    //Stage2.show();
		
		Enemigos e = new Enemigos();
		e.enemigo(Stage2);

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

		//Personaje
		Personaje personaje = new Personaje();
		personaje.personaje(Stage2);
		
		//Stage2.setScene(scene);
		//Stage2.show();	
	}
}