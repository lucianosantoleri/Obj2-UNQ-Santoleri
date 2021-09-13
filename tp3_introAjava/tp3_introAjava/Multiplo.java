package tp3_introAjava;

//ejercicio 3:

public class Multiplo {

	public Integer MultiploMasAltoDe(int x, int y) {
		
			int multiploMasAlto = 0;
		
			for(int i=x; i<y; i++) {
				if(x%y == 0) {
					multiploMasAlto = i;
				}
			}
		
			return multiploMasAlto;
		}	
}
