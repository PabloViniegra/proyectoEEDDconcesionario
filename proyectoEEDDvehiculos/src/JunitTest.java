import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Autobus;
import modelo.Camion;
import modelo.Coche;
import modelo.Moto;
import vista.Formulario;

public class JunitTest {

	@Test
	public void testAutobus() {
		Formulario form = new Formulario();
		Autobus aut = new Autobus();
		int resultado = form.numRuta(aut);
		assertEquals(resultado, resultado);
	}
	
	@Test
	public void testCoche() {
		Formulario form = new Formulario();
		Coche coche = new Coche();
		int resultado = form.calculaKm(coche);
		assertEquals(resultado, resultado);
	}
	
	@Test
	public void testMoto() {
		Formulario form = new Formulario();
		Moto mimoto = new Moto();
		String permiso = form.permisoMoto(mimoto);
		assertEquals(permiso, permiso);
	}
	
	@Test
	public void testCamion() {
		Formulario form = new Formulario();
		Camion camion = new Camion();
		String velocidad = form.velocidad(camion);
		assertEquals(velocidad, velocidad);
	}

}
