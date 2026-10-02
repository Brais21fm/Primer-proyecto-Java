package Practica;

import java.util.Scanner;

public class CalculadoraIVA {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
	
	double precioSinIva = 0, Iva = 0, PrecioFinal = 0;
	
	System.out.println("Dime el precio del producto: "+ precioSinIva);
	precioSinIva = teclado.nextDouble();
	
	Iva = precioSinIva * 0.21;
	PrecioFinal = precioSinIva + Iva;
			System.out.printf("El IVA es: %.2f\n", Iva);
	       System.out.printf("El precio final es: %.2f\n", PrecioFinal);
	       teclado.close();
	       
	}
}