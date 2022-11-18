/*La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus
tarifas son las siguientes: el costo de platillo por persona es de $95.00, pero si el
número de personas es mayor a 200 pero menor o igual a 300, el costo es de
$85.00. Para más de 300 personas el costo por platillo es de $75.00. Se requiere
un algoritmo que ayude a determinar el presupuesto que se debe presentar a los
clientes que deseen realizar un evento. Mediante un programa en java representa
la solució
*
*/
import java.util.Scanner;

public class Langonsta_ahumada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		double personas_banquete = 0;
		double total_pagar = 0;
		
		System.out.println("Ingrese el numero de personas: ");
		personas_banquete = entrada.nextDouble();
		 
		if (personas_banquete<200) {
			total_pagar = (personas_banquete *95);
			
		} else {
			if (personas_banquete <= 300) {
				total_pagar = (personas_banquete*85.00);
				
			} else {
				total_pagar = (personas_banquete*75.00);
				
			}
			
			
			
		}
		System.out.println("Total a pagar es de: " + total_pagar);
		
	}

}
