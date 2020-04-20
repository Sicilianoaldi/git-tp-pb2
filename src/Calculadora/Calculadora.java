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
			System.out.println("Ingrese su operacion /n1 para sumar /n2 para restar"
					+ "/n3 para multiplicar /n4 para dividir:");
			
			opcion= teclado.nextInt();
		
		}while(opcion < 1 && opcion > 4);
		
		System.out.println("Ingrese el primer numero");
		a= teclado.nextInt();
		System.out.println("Ingrse el segundo numero");
		b= teclado.nextInt();

		If(opcion.equals(1)){
		    resultado= a + b;
		}else 
		if(opcion.equals(2)){
		    resultado= a - b; 
		}else
		if(opcion.equals(3)){
		    resultado= a * b;
		}else 
		if(opcion.equals(4)){
		    resultado= a / b;
		}
			
	        System.out.println("El resultado es " + resultado.toString());
		
		}
	   	
    }

