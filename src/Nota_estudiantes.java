import java.util.Scanner;

public class Nota_estudiantes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte matematicas = 0;
		byte espanol = 0;
		byte quimica = 0;
		byte nota = 0;
		char resultado = 0 ;
		
		System.out.println("Ingrese nota de matematicas: ");
		matematicas = entrada.nextByte();
		System.out.println("Ingrese nota de español: ");
		espanol = entrada.nextByte();
		System.out.println("Ingrese nota de quimica: ");
		quimica = entrada.nextByte();
		
		nota = (byte) ((matematicas + espanol + quimica)/3);
		
		if (nota > 100 || nota <= 0) {
			System.out.println("nota mayor que 100 o numero negativo: ");
			
		} else if (nota >= 90 && nota <= 100) {
			resultado = 'A';
			
		} else if (nota >= 80 && nota < 90) {
			resultado = 'B';
			
		} else if (nota >= 70 && nota < 80) {
			resultado = 'C'; 
			
		} else if (nota >= 60 && nota < 70) {
			resultado = 'D';
			
		} else {
			resultado = 'E';
		} // fin else if
		
		System.out.println("Tu nota es de: " + resultado);
		

	}

}
