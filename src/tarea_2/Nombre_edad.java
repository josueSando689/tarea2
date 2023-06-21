package tarea_2;
import java.util.Scanner;
public class Nombre_edad {
	String nombre;
	int edad;
   public static void main (String []args) {
	   
	   Scanner input = new Scanner(System.in);
		
	    System.out.println("¡Hola!¿Cual es tu nombre?");
		String nombre = input.next();
		System.out.println("¿Cual es tu edad? ");
		int edad = input.nextInt();
		
	System.out.println ("Mucho gusto "+ nombre + " tu edad es " + edad);
   }
}
