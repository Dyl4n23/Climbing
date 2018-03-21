package application;

public class Aleatorio {
	double px,py;
	public Aleatorio(){
		
	}
	public double PosicionX(){
		px=(Math.random()*700);
		Math.round(px);
		return px;
	}
	public double PosicionY(){
		py=(Math.random()*550);
		Math.round(py);
		return py;
	}
}
