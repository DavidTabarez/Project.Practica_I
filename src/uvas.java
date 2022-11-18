/*
 *  La asociación de vinicultores tiene como política fijar un precio inicial al kilo de
uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se
realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere
determinar cuánto recibirá un productor por la uva que entrega en un embarque,
considerando lo siguiente: si es de tipo A, se le cargan 20¢ al precio inicial cuando
es de tamaño 1; y 30¢ si es de tamaño 2. Si es de tipo B, se rebajan 30¢ cuando es
de tamaño 1, y 50¢ cuando es de tamaño 2. Realice un Programa en java para
determinar la ganancia obtenida.
 *
 * 
 * 
 * */



import java.util.Scanner;

public class uvas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double tipo_uva = 0 ;
		double tamano_uva = 0; 
		double kilo_uva = 0;
		double total_pagar = 0;
		double precio_uva = 20.00;
		
		System.out.println("Ingrse el tipo de uva: " + "\n" + "Uva tipo A (1): " + "\n" + "Uva tipo B (2): ");
		tipo_uva = entrada.nextDouble();
		
		System.out.println("Seleccione tamaño de uva: " + "\n" + "Tamaño 1 (1): " + "\n" + "Tamaño 2 (2): ");
		tamano_uva = entrada.nextDouble();
		
		System.out.println("Cuantos kilos a comprar: ");
		kilo_uva = entrada.nextDouble();
		
	
		if (tipo_uva == 1) {
			
			if (tamano_uva == 1) {
				precio_uva = precio_uva + 0.20;
			} else {
				precio_uva = precio_uva + 0.30;
				
			}
		
		
		} else {
			System.out.println("uva tipo b");
			
			if (tamano_uva == 1) {
				precio_uva = precio_uva + 0.30;
			} else {
				precio_uva = precio_uva + 0.50;
				
			}
		}
			
		
		total_pagar = (precio_uva * kilo_uva); 
		System.out.println(total_pagar);
		
	}

}
