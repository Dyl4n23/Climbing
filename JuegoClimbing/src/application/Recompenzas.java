package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Recompenzas {
	Aleatorio al=new Aleatorio();
	double px=al.PosicionX();
	double py=al.PosicionY();
	public void MostrarMonedas(){
		for(int i=0;i>=10;i++){
			Circle monedas=new Circle(px,py,5);
			monedas.setFill(Color.YELLOW);
		}
		
	}
}
