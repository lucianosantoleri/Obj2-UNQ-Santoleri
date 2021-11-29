package tp8_TestDoublesyTDD;

public class CartaPoquer {
    private String valor;
    private String palo;

    public CartaPoquer(String valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    public boolean tieneMismoPalo(CartaPoquer carta){
        return getPalo().equals(carta.getPalo());
    }

    public boolean esMayorA(CartaPoquer carta){
        return getValor() > carta.getValor();
    }

    public int getValor() {
        switch (this.valor) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(this.valor);
        }
    }
    public String getPalo() {
        return this.palo;
    }

    public boolean tieneValorIgualA(CartaPoquer cartaBuscada) {
        return getValor() == cartaBuscada.getValor();
    }
}