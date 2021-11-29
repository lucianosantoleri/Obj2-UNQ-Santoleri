package tp8_TDD;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import tp8_TestDoublesyTDD.CartaPoquer;
import tp8_TestDoublesyTDD.PokerStatus;

public class PoquerStatusTestCase {

    PokerStatus pokerStatus;

    CartaPoquer carta1;
    CartaPoquer carta2;
    CartaPoquer carta3;
    CartaPoquer carta4;
    CartaPoquer carta5;
    CartaPoquer carta6;
    CartaPoquer carta7;
    CartaPoquer carta8;
    CartaPoquer carta9;
    CartaPoquer carta10;
    CartaPoquer carta11;
    CartaPoquer carta12;

    CartaPoquer cartaMockito1;
    CartaPoquer cartaMockito2;
    CartaPoquer cartaMockito3;
    CartaPoquer cartaMockito4;
    CartaPoquer cartaMockito5;

    @BeforeEach
    private void setUp(){

        pokerStatus = new PokerStatus();

        cartaMockito1 = mock(CartaPoquer.class);
        cartaMockito2 = mock(CartaPoquer.class);
        cartaMockito3 = mock(CartaPoquer.class);
        cartaMockito4 = mock(CartaPoquer.class);
        cartaMockito5 = mock(CartaPoquer.class);

    }

    @Test
    void verificarCartasDeTipoString() {
        assertEquals("es poquer",pokerStatus.verificar("10P","10C","10D","10T","1D"));
        assertEquals("es color",pokerStatus.verificar("10P","1P","5P","6P","2P"));
        assertEquals("es trio",pokerStatus.verificar("QP","QC","QD","10D","1D"));
        assertEquals("nada",pokerStatus.verificar("1D","10C","5P","10D","QD"));
    }
    @Test
    void verificarCartasDeTipoCartas(){
        carta1 = new CartaPoquer("10","P");
        carta2 = new CartaPoquer("10","C");
        carta3 = new CartaPoquer("10","D");
        carta4 = new CartaPoquer("10","T");
        carta5 = new CartaPoquer("1","D");
        carta6 = new CartaPoquer("1","P");
        carta7 = new CartaPoquer("5","P");
        carta8 = new CartaPoquer("6","P");
        carta9 = new CartaPoquer("2","P");
        carta10 = new CartaPoquer("Q","P");
        carta11 = new CartaPoquer("Q","C");
        carta12 = new CartaPoquer("Q","D");

        assertEquals("es poquer",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
        assertEquals("es color",pokerStatus.verificar(carta1,carta6,carta7,carta8,carta9));
        assertEquals("es trio",pokerStatus.verificar(carta10,carta11,carta12,carta3,carta5));
        assertEquals("nada",pokerStatus.verificar(carta5,carta2,carta7,carta3,carta12));
    }
    @Test
    void verificarColorEnCartaMOCK(){
        when(cartaMockito1.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito2.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito3.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito4.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito5.tieneMismoPalo(any())).thenReturn(true);

        assertEquals("es color", pokerStatus.verificar(cartaMockito1,cartaMockito2
                ,cartaMockito3,cartaMockito4,cartaMockito5));
    }
    @Test
    void verificarPoquerEnCartaMOCK(){
        when(cartaMockito1.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito2.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito4.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito3.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito5.tieneValorIgualA(any())).thenReturn(false);

        assertEquals("es poquer", pokerStatus.verificar(cartaMockito1,cartaMockito2
                ,cartaMockito3,cartaMockito4,cartaMockito5));
    }
    @Test
    void verificarTrioEnCartaMOCK(){
        when(cartaMockito1.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito2.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito4.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito3.tieneValorIgualA(any())).thenReturn(false);
        when(cartaMockito5.tieneValorIgualA(any())).thenReturn(false);

        assertEquals("es trio", pokerStatus.verificar(cartaMockito1,cartaMockito2
                ,cartaMockito3,cartaMockito4,cartaMockito5));
    }
    @Test
    void verificarNADAEnCartaMOCK(){
        when(cartaMockito1.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito2.tieneValorIgualA(any())).thenReturn(true);
        when(cartaMockito4.tieneValorIgualA(any())).thenReturn(false);
        when(cartaMockito3.tieneValorIgualA(any())).thenReturn(false);
        when(cartaMockito5.tieneValorIgualA(any())).thenReturn(false);

        assertEquals("nada", pokerStatus.verificar(cartaMockito1,cartaMockito2
                ,cartaMockito3,cartaMockito4,cartaMockito5));

        when(cartaMockito1.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito2.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito3.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito4.tieneMismoPalo(any())).thenReturn(true);
        when(cartaMockito5.tieneMismoPalo(any())).thenReturn(false);

        assertEquals("nada", pokerStatus.verificar(cartaMockito1,cartaMockito2
                ,cartaMockito3,cartaMockito4,cartaMockito5));
    }
}
