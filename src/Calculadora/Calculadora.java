package Calculadora;

import java.util.Scanner;

public class Calculadora {

	
        public static void main(String [] args) {
		Integer a;            
		Integer b;            
		Integer opcion;            
		Integer resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese su operacion /n1 para restar/n2 para sumar "
					+ "/n3 para multiplicar /n4 para dividir:");
			
			opcion= teclado.nextInt();
		
		}while(opcion < 1 && opcion > 4);
		
		System.out.println("Ingrese el primer numero");
		a= teclado.nextInt();
		System.out.println("Ingrse el segundo numero");
		b= teclado.nextInt();

		switch(opcion) {
		
		case 1: 
			resultado= a-b;
			break;
		
		case 2: 
			resultado= a + b;
			break;		
				
		case 3:
			resultado= a * b;
			break;
		
		case 4:
			resultado= a / b;
			break;
		}
			
	        System.out.println("El resultado es " + resultado.toString());
		
		}
	   	
    }

