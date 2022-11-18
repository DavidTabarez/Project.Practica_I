/*
 * El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las
cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa
acepta tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que
los clientes adquieren sólo un tipo de hamburguesa, realice un algoritmo para
determinar cuánto debe pagar una persona por N hamburguesas. Representar
Solución mediante un programa hecho en Java.
 * 
 * */
import java.util.Scanner;

public class hamburguesas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double hamburguesa;
		double cantidad_hamburguesas = 0;
		double total_pagar = 0;
		double cargo = 0;
		
		System.out.println("Ingrese su tipo de : ");
		System.out.println("Hamburguesa sencilla (1): ");
		System.out.println("Hamburguesa doble (2): ");
		System.out.println("Hamburguesa triple (3): ");
		hamburguesa = entrada.nextDouble();
		
		System.out.println("Ingrese la cantidad de hamburguesas que desea comprar: ");
		cantidad_hamburguesas = entrada.nextDouble();
		
		if (hamburguesa < 2) {
			cargo = (cantidad_hamburguesas*0.05);
			total_pagar = ((cantidad_hamburguesas*20)+cargo);
			System.out.println("Tu total a pagar es de: " + total_pagar);
			
		} else {
			if (hamburguesa < 3) {
				cargo = (cantidad_hamburguesas*0.05);
				total_pagar = ((cantidad_hamburguesas*25)+cargo);
				System.out.println("Tu total a pagar es de: " + total_pagar);
			} else {
				cargo = (cantidad_hamburguesas*0.05);
				total_pagar = ((cantidad_hamburguesas*28)+cargo);
				System.out.println("Tu total a pagar es de: " + total_pagar);
			}
		}
	

	}

}
