package tarea;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Clase de test unitarios para la clase Fecha, comprobando
 * tanto el rango de fechas como el correcto comportamiento
 * en años bisiestos
 * 
 * @version 1.0, 04/03/2017
 * 
 * @author Juan Manuel Beltrán Osa 
 *
 */

public class FechaTest {
	
	Fecha fCorrect;
	
	Fecha fWrongDay;
	
	Fecha fWrongMonth;
	
	Fecha fCorrectBisiesto;
	
	Fecha fWrongBisiesto;
	
	Fecha fWrongYear;
	
	/**
	 * Método setUp de la clase <code>FechaTest</code>
	 * @throws Exception controlamos posibles excepciones
	 * Instanciams las variables
	 */

	@Before
	public void setUp() throws Exception {
		
		fCorrect = new Fecha(2, 3, 1976);
		
		fWrongDay = new Fecha(43, 12, 2016);
		
		fWrongMonth = new Fecha(2, -2, 2000);
		
		fWrongYear = new Fecha(2, 1, -2100);
		
		fCorrectBisiesto = new Fecha(29, 2, 2016);
		
		fWrongBisiesto = new Fecha(29, 2, 2017);
		
	}
	
	/**
	 * Métdo test de la clase <code>FechaTest</code>
	 * Comprobamos si los datos arrojados por las instancias
	 * de la clase Fecha están dentro de los datos esperados, 
	 * tant los positivos como los negativos
	 */

	@Test
	public void test() {
		
		assertEquals(true, fCorrect.valida());
		
		assertEquals(false, fWrongDay.valida());
		
		assertEquals(false, fWrongMonth.valida());
		
		assertEquals(false, fWrongYear.valida());
		
		assertEquals(true, fCorrectBisiesto.valida());
		
		assertEquals(false, fWrongBisiesto.valida());
		
	}

}
