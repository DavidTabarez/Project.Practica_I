/*
 *  La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se
realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80¢ c/u, los
siguientes dos minutos, 70¢ c/u, y a partir del décimo minuto, 50¢ c/u.

Además, se carga un impuesto de 3 % cuando es domingo, y si es día hábil, en
turno matutino, 15 %, y en turno vespertino, 10 %. Realice un algoritmo para
determinar cuánto debe pagar por cada concepto una persona que realiza una
llamada. Represéntelo en un programa hecho en Java.
 * 
 * */
import java.util.Scanner;

public class chismefon {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double tiempo_linea = 0;
		double total_pagar = 0;
		double pago_tiempo = 0;
		String dia;
		double turno = 0;
		double impuesto = 0;
		
		System.out.println("Ingrese el tiempo en linea: ");
		tiempo_linea = entrada.nextDouble();
		
		if (tiempo_linea<5) {
			pago_tiempo = (tiempo_linea*1); 
			
		} else if (tiempo_linea <= 8){
			pago_tiempo = (((tiempo_linea - 5)*0.8)+5);

		} else if (tiempo_linea <= 10) {
			pago_tiempo = (((tiempo_linea - 8)*0.7)+7.4);
			
		} else {
			pago_tiempo = (((tiempo_linea - 10)*0.5)+8.8);
			
		}
		
		System.out.println("Ingresa tu dia: ");
		dia = entrada.next();
		
		if (dia=="domingo") {
			impuesto = (pago_tiempo * 0.03);
			total_pagar = (pago_tiempo + impuesto);
			
		} else {
			System.out.println("Turno: matutino (1) o vespertino (2): ");
			turno = entrada.nextDouble();
			
			if (turno == 1) {
				impuesto = (pago_tiempo * 0.15);
				total_pagar = (pago_tiempo + impuesto); 
				
			} else {
				impuesto = (pago_tiempo * 0.10);
				total_pagar = (pago_tiempo + impuesto); 
				
			}
	
		} // Fin del else 
		
		
		System.out.println("DETALLES");
		System.out.println("mimutos: " + tiempo_linea);
		System.out.println("Pago correspondiente al tiempo: " + pago_tiempo + " pesos");
		System.out.println("Impuesto: " + impuesto);
		System.out.println("total a pagar: " + total_pagar + "pesos");
		
		
	}

}
