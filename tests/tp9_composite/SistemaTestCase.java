package tp9_composite;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTestCase {
	
	private Sistema sistema;
	private ParcelaPura parcelaTrigo;
	private ParcelaPura parcelaSoja;
	private ParcelaMixta pm1;
	private ParcelaMixta pm2;

	@BeforeEach
	public void setUp() throws Exception {
		parcelaTrigo = new ParcelaPura(new Trigo());
		parcelaSoja = new ParcelaPura(new Soja());
		pm1 = new ParcelaMixta();
		pm1.agregarParcela(parcelaSoja);
		pm1.agregarParcela(parcelaSoja);
		pm1.agregarParcela(parcelaTrigo);
		pm1.agregarParcela(parcelaTrigo);
		pm2 = new ParcelaMixta();
		pm2.agregarParcela(parcelaSoja);
		pm2.agregarParcela(parcelaSoja);
		pm2.agregarParcela(parcelaSoja);
		pm2.agregarParcela(pm1);
	}

	@Test
	public void testUnaParcelaDeSojaTieneUnaGananciaAnualDe500() {
		assertEquals(500, parcelaSoja.getGananciaAnual());
	}
	
	@Test
	public void testUnaParcelaDeTrigoTieneUnaGananciaAnualDe300() {
		assertEquals(300, parcelaTrigo.getGananciaAnual());
	}
	
	@Test
	public void testUnaParcelaMixtaCon2ParcelasDeSojaY2DeTrigoTieneUnaGananciaAnualDe400() {
		assertEquals(400, pm1.getGananciaAnual());
	}
	
	@Test
	public void testUnaParcelaMixtaCon3ParcelasDeSojaY1MixtaCon2DeSojasY2DeTrigosTieneUnaGananciaAnualDe475() {
		assertEquals(475, pm2.getGananciaAnual());
	}
	
	@Test
	public void testUnaPorcinDeTierraCon4ParcelasDeSojaTieneUnaGananciaAnualDe2000() {
		sistema = new Sistema(Arrays.asList(parcelaSoja, parcelaSoja, parcelaSoja, parcelaSoja));
		assertEquals(2000, sistema.getGananciaAnualTotal());
	}
	
	@Test
	public void testUnaPorcinDeTierraCon4ParcelasDeTrigoTieneUnaGananciaTotalDe1200() {
		sistema = new Sistema(Arrays.asList(parcelaTrigo, parcelaTrigo, parcelaTrigo, parcelaTrigo));
		assertEquals(1200, sistema.getGananciaAnualTotal());
	}
	
	@Test
	public void testUnaPorcinDeTierraCon2ParcelasDeSoja1DeTrigoY1MixtaCon2DeSojaY2DeTrigoTieneUnaGananciaTotalDe1700() {
		sistema = new Sistema(Arrays.asList(parcelaSoja, parcelaTrigo, pm1, parcelaSoja));
	}
	
	@Test
	public void testUnaPorcinDeTierraCon3ParcelasDeTrigoY1MixtaCon3DeSojaY1MixtaCon2DeSojaY2DeTrigoTieneUnaGananciaTotalDe1375() {
		sistema = new Sistema(Arrays.asList(parcelaTrigo, parcelaTrigo, parcelaTrigo, pm2));
		assertEquals(1375, sistema.getGananciaAnualTotal());
	}

}
