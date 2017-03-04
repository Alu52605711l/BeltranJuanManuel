package tarea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase para comprobar el correcto rango de los tres campos de una fecha,
 * además comprueba la corrección en años bisiestos
 * 
 * @version 1.0, 04/03/2017
 * 
 * @author Juan Manuel Beltrán Osa 
 *
 */

public class Fecha {
	
	private int dia; 
	private int mes;
	private int anio;
	
	/**
	 * Constructor
	 * @param dia el día a consultar
	 * @param mes el mes a consultar
	 * @param anio el año a consultar
	 */
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia; this.mes = mes; this.anio = anio;
	}
	
	/**
	 * Método diasMes de la clase <code>Fecha</code>
	 * @return retorna los dias que tiene determinado mes
	 */
	
	private int diasMes() {
		
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: diasMes = 31;
		break;
		case 4:
		case 6:
		case 9:
		case 11 : diasMes = 30;
		break;
		case 2 :
			if ( bisiesto() )
				diasMes = 29;
			else 
				diasMes = 28;
			break;
		}
		
		return diasMes;
		
	}
	
	/**
	 * Método bisiesto de la clase <code>Fecha</code>
	 * @return retorna booleano indicando si el año es bisiesto o no
	 */
	
	private boolean bisiesto() {
		
		if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio % 100 != 0) ) )
			return true;
			else return false;
		
	}
	
	/**
	 * Método valida de la clase <code>Fecha</code>
	 * @return retorna booleano indicando si la fecha es válida o no
	 */
	
	public boolean valida ( ) {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia > diasMes()) return false;
		else return true;
	}
	
	/**
	 * Método main de la clase <code>Fecha</code>
	 * @param args mediante la entrada del dia, mes y año comprobamos que la fecha este
	 * bien formada
	 * @throws IOException controlamos las excepciones de entrada/salida
	 */
	
	public static void main(String[] args)throws IOException {
		int dia, mes, anyo;
		
		System.out.println ("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		dia = Integer.parseInt(entrada.readLine());
		
		System.out.println ("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		
		System.out.println ("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1=new Fecha(dia,mes,anyo);
		
		if (f1.valida())
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es válida");
		else
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" NO es válida");
	}
}
