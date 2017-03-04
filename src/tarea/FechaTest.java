package tarea;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FechaTest {
	
	Fecha fCorrect;
	
	Fecha fWrongDay;
	
	Fecha fWrongMonth;
	
	Fecha fCorrectBisiesto;
	
	Fecha fWrongBisiesto;
	
	Fecha fWrongYear;

	@Before
	public void setUp() throws Exception {
		
		fCorrect = new Fecha(2, 3, 1976);
		
		fWrongDay = new Fecha(43, 12, 2016);
		
		fWrongMonth = new Fecha(2, -2, 2000);
		
		fWrongYear = new Fecha(2, 1, -2100);
		
		fCorrectBisiesto = new Fecha(29, 2, 2016);
		
		fWrongBisiesto = new Fecha(29, 2, 2017);
		
	}

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
