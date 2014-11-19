package org.institutoserpis.ed;
import java.util.Scanner;
import java.math.BigDecimal;

public class Suma {
	
public static void main (String[]args ){
	
	System.out.println("Programa para sumar dos numeros");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce el primero ");

	String primerDato = scanner.nextLine();
	BigDecimal primerNumero = new BigDecimal(primerDato);
	System.out.println("Primer número " + primerNumero);
	
	System.out.println("Introduce el segundo ");
	String segundoDato = scanner.nextLine();
	BigDecimal segundoNumero = new BigDecimal(segundoDato);
	System.out.println("Segundo número " + segundoNumero);
	BigDecimal suma= primerNumero.add(segundoNumero);
	System.out.println("La suma es " + suma);
	
//	System.out.println("Programa para sumar dos numeros");
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Introduce el primero ");
//
//	String primerDato = scanner.nextLine();
//	float primerNumero = Float.parseFloat(primerDato);
//	System.out.println("Primer número " + primerNumero);
//	
//	System.out.println("Introduce el segundo ");
//	String segundoDato = scanner.nextLine();
//	float segundoNumero = Float.parseFloat(segundoDato);
//	System.out.println("Segundo número " + segundoNumero);
//	float suma= primerNumero+segundoNumero;
//	System.out.println("La suma es " + suma);
//	}
	
	}
	}

