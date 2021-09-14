package tp3_introAjava;

//EJERCICIO 8

public class Point {

	private int X;
	private int Y;
	
	public Point(int x, int y) {
		X = x;
		Y = y;
	}
	
	public Point() {
		X = 0;
		Y = 0;
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public void newPointSetXY(int Xnew, int Ynew) {
		X = X + Xnew;
		Y = Y + Ynew;
	}
}
