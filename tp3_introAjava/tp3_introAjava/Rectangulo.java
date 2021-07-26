package tp3_introAjava;

import java.util.ArrayList;

public class Rectangulo {
	
	private Point puntoUno;
	private Point puntoDos;
	private Point puntoTres;
	private Point puntoCuatro;

	Rectangulo(Point punto1, Point punto2, Point punto3, Point punto4) {
		this.puntoUno = punto1;
		this.puntoDos = punto2;
		this.puntoTres = punto3;
		this.puntoCuatro = punto4;
	}

	public Point getPuntoUno() {
		return puntoUno;
	}

	public void setPuntoUno(Point puntoUno) {
		this.puntoUno = puntoUno;
	}

	public Point getPuntoDos() {
		return puntoDos;
	}

	public void setPuntoDos(Point puntoDos) {
		this.puntoDos = puntoDos;
	}

	public Point getPuntoTres() {
		return puntoTres;
	}

	public void setPuntoTres(Point puntoTres) {
		this.puntoTres = puntoTres;
	}

	public Point getPuntoCuatro() {
		return puntoCuatro;
	}

	public void setPuntoCuatro(Point puntoCuatro) {
		this.puntoCuatro = puntoCuatro;
	}
	
    public ArrayList<Point> getPuntos() {
    	ArrayList<Point> puntos = new ArrayList<Point>();
    	puntos.add(puntoUno);
    	puntos.add(puntoDos);
    	puntos.add(puntoTres);
    	puntos.add(puntoCuatro);
    	return puntos;
    }
}

/** 
 * SE APLICA LA MISMA LOGICA Y METODOLOGIA PARA UN CUADRADO*/


