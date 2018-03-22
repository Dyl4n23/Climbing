package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root,1000,800);
			 
			Image i1=new Image("file:///C:/Users/dennys/Desktop/Climbing/JuegoClimbing/src/application/1.png");
			ImageView vi=new ImageView();
			vi.setImage(i1);
			vi.setFitWidth(1010);
			vi.setFitHeight(810);
			
			Button Ingresar=new Button(" JUGAR ");
			//botonIngresar.setFont();
			Ingresar.setLayoutX(485);
			Ingresar.setLayoutY(350);
			Ingresar.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{
						@Override
						public void handle(MouseEvent arg0) {
							// TODO Auto-generated method stub
							Juego j1=new Juego();
							j1.Escenario(primaryStage);
						}
					});
			Button Informacion=new Button(" INFORMACION ");
			//botonInformacion.setFont();
			Informacion.setLayoutX(460);
			Informacion.setLayoutY(400);
			Informacion.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{
						@Override
						public void handle(MouseEvent arg0) {
							// TODO Auto-generated method stub
							Informacion inf=new Informacion();
							inf.MostrarInformacion();
						}
					});
			Button Salir=new Button(" SALIR ");
			//botonIngresar.setFont();
			Salir.setLayoutX(485);
			Salir.setLayoutY(450);
			Salir.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{
						@Override
						public void handle(MouseEvent arg0) {
							// TODO Auto-generated method stub
							System.exit(0);
						}
					}
					);
			root.getChildren().addAll(vi,Ingresar,Informacion,Salir);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}
}