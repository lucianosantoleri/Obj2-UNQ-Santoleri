package tp9_composite;

public class Punto {

	private int X;
	private int Y;
	
	public Punto(int x, int y) {
		X = x;
		Y = y;
	}
	
	public Punto() {
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
