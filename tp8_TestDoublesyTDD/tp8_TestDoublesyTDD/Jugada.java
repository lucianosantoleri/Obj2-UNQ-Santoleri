package tp8_TestDoublesyTDD;


import java.util.List;

public class Jugada {
    String status;
    List<CartaPoquer> cartas;
    String empateCase;

    public String ganadorEntre(PokerStatus mano1,PokerStatus mano2) {
        String statusMano1 = mano1.getStatus();
        List<CartaPoquer> cartasMano1 = mano1.getCartas();
        List<CartaPoquer> cartasMano2 = mano2.getCartas();

        if (statusMano1.equals(mano2.getStatus())) {
            return compararEsEmpate(mano1, mano2);
        }else{
            switch (statusMano1) {
                case "es poquer":
                    return compararEsPoquer(mano1, mano2);
                case "es trio":
                    return compararEsTrio(mano1,mano2);
                case "es color":
                    return compararEsColor(mano1,mano2);
                case "nada":
                    return compararNada(mano1,mano2);
            }
        }
        return "Hola";
    }
    private String compararEsEmpate(PokerStatus mano1, PokerStatus mano2) {
        String statusMano1 = mano1.getStatus();
        if (statusMano1.equals("nada")) {
            return "empate";
        }else{
            switch (statusMano1) {
                case "es poquer":
                    return compararEsPoquer(mano1, mano2);
                case "es trio":
                    return compararEsTrio(mano1,mano2);
                case "es color":
                    return compararEsColorEmpate(mano1.getCartas(),mano2.getCartas());
                case "nada":
                    return compararNada(mano1,mano2);
            }
        }
        return "Hola";
    }

    private String compararEsColorEmpate(List<CartaPoquer> cartas, List<CartaPoquer> cartas1) {
        return "hola";
    }

    private String compararNada(PokerStatus mano1, PokerStatus mano2) {
        return "Hola";
    }

    private String compararEsColor(PokerStatus mano1, PokerStatus mano2) {
        return "Hola";
    }

    private String compararEsTrio(PokerStatus mano1, PokerStatus mano2) {
        return "Hola";
    }

    private String compararEsPoquer(PokerStatus mano1, PokerStatus mano2) {
            return "gola";
    }

/*
    private String desempatar(List<Carta> mano1, List<Carta> mano2,String status){
        if(status.equals("es trio")){
            comprarTrio(mano1.jugada,mano2.jugada);
        }
        return "nada";
    }
    private String comprarTrio(List<Carta> mano1, List<Carta> mano2,String){
        jugada.numero > jugada.numero2
        return "nada"
    }*/
}