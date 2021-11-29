package tp8_TestDoublesyTDD;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {
    private List<CartaPoquer> cartas;
    private String status;
    private List<CartaPoquer> cartasJugada;

    public PokerStatus(){
        this.cartas = new ArrayList<CartaPoquer>();
        this.status = "nada";
        this.setCartasJugada(new ArrayList<CartaPoquer>());
    }
    /*
    PALO
    P = picas
    C = corazones
    D = diamantes
    T = treboles
    numeracion = 1-10 ,J ,Q ,K
    ejemplo:
    2 de picas = 2P
    reina de diamantes = QD
    diez de dimantes = 10D
    Poquer: 4 cartas poseen el mismo numero
    Color: 5 cartas tienen el mismo palo
    Trio: 3 cartas poseen el mismo numero
    nada: no encontr ningun valor
     */
    public String getStatus(){
        return this.status;
    }

    public List<CartaPoquer> getCartas(){
        return this.cartas;
    }
    public String verificar(CartaPoquer carta1, CartaPoquer carta2, CartaPoquer carta3, CartaPoquer carta4, CartaPoquer carta5){
        this.cartas = List.of(carta1,carta2,carta3,carta4,carta5);
        if(esColorParaCartas(cartas)){
            return setStatusAndReturn("es color");
        }else if( valoresIgualesParaCartas(cartas,4)){
            return setStatusAndReturn("es poquer");
        }else if (valoresIgualesParaCartas(cartas,3)){
            return setStatusAndReturn("es trio");
        }else {
            return setStatusAndReturn("nada");
        }
    }
    private String setStatusAndReturn(String status){
        this.status = status;
        return status;
    }

    private boolean valoresIgualesParaCartas(List<CartaPoquer> cartas, int i) {
        return i == cartas.stream().map( carta -> cantidadDeCartasConValoresIgualesParaCartas(carta,cartas))
                .max(Integer::max).get();
    }

    private int cantidadDeCartasConValoresIgualesParaCartas(CartaPoquer cartaBuscada, List<CartaPoquer> cartas) {
        //Buscamos las cartas que tengan igual valor a la carta buscada
        return (int) cartas.stream().filter(carta -> carta.tieneValorIgualA(cartaBuscada)).count();
    }

    private boolean esColorParaCartas(List<CartaPoquer> cartas) {
    	CartaPoquer cartaAComparar = cartas.get(0);
        //Verificamos que el PALO de la carta actual sea igual al PALO de la carta buscada
        return 5 == cartas.stream().filter( carta -> carta.tieneMismoPalo(cartaAComparar)).count();
    }

    public String verificar(String carta1,String carta2,String carta3,String carta4, String carta5){
        List<String> cartas = List.of(carta1,carta2,carta3,carta4,carta5);
        if(esColor(cartas)){
            return "es color";
        }else if( valoresIguales(cartas,4)){
            return "es poquer";
        }else if (valoresIguales(cartas,3)){
            return "es trio";
        }else{
            return "nada";
        }
    }

    private boolean valoresIguales(List<String> cartas, int i) {
        return i == cartas.stream().map( carta -> cantidadDeCartasConValoresIguales(carta,cartas))
                .max(Integer::max).get();
    }

    private int cantidadDeCartasConValoresIguales(String cartaBuscada,List<String> cartas){
        return (int) cartas.stream().filter(carta ->
                //Verificamos que el VALOR de la carta actual sea igual al VALOR de la carta buscada
                valorIgualDeCartas(carta,cartaBuscada)).count();
    }

    private boolean valorIgualDeCartas(String cartaActual,String cartaBuscada){
        String valorBuscado = cartaBuscada.substring(0,cartaBuscada.length()-1);
        String valorActual = cartaActual.substring(0,cartaActual.length()-1);
        return valorBuscado.equals(valorActual);
    }

    private boolean esColor(List<String> cartas) {
        String cartaAComparar = cartas.get(0);
        return 5 == cartas.stream().filter( carta ->
                //Verificamos que el PALO de la carta actual sea igual al PALO de la carta buscada
                carta.endsWith(cartaAComparar.substring(cartaAComparar.length()-1))).count();
    }
	public List<CartaPoquer> getCartasJugada() {
		return cartasJugada;
	}
	public void setCartasJugada(List<CartaPoquer> cartasJugada) {
		this.cartasJugada = cartasJugada;
	}

}