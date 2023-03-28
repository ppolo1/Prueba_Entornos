package calcularPeso;
import java.util.Scanner;
/**
 * 
 * @author Pablo Polo Palacio
 *
 */

public class Peso {
	/**
	 * 
	 * @param 
	 */

	public static void main(String[] args) {
		/**
	    * Realizar un programa para calcular cuánto tiene que pagar un usuario de factura de gas, pidiéndole cuantos metros cúbicos de gas ha consumido y cuál es el precio del consumo con un factor de conversión de 11,70 kWh
	    * Entrada: Metros cúbicos consumidos y precio del gas
	    * Salida: Pago según los datos proporcionados por teclado
	    */
	    //Se crea una variable fija
		Scanner teclado = new Scanner(System.in);    
		final double conversion=11.70;
	    double cúbico, precio, factura;

	    //Se piden los datos para calcular después la factura
	    System.out.print("Cuánto has consumido (en metros cúbicos): ");
	    cúbico=teclado.nextDouble();
	    System.out.print("Cuánto ha sido el precio de consumo(euros/kWh): ");
	    precio=teclado.nextDouble();

	    //Se calcula la factura según los datos introducidos
	    factura=(cúbico*conversion)*precio;
	    System.out.println("Tienes que pagar "+factura+" euros");
	}

}

