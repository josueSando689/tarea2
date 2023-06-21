package tarea_2;
import java.util.*;

public class tres_valores {
	
	public static void main (String [] args) {
	  
		Scanner mensaje = new Scanner(System.in);
		
	    System.out.println("Escribe un numero");
		int num1 = mensaje.nextInt();
		System.out.println("Escribe un segundo numero ");
		int num2 = mensaje.nextInt();
		System.out.println("Escribe un tercer numero ");
		int num3 = mensaje.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			respuesta1();
		} else if (num1>num2 && num1>num3 && num3 > num2) {
			respuesta2();
		} 	
		  else if (num2>num1 && num2>num3 && num1> num3) {
			respuesta3();
		} 
		  else if (num2>num1 && num2>num3 && num3> num1) {
			respuesta4();
			} 
		  else if (num3>num1 && num3>num2 && num1> num2) {
			respuesta5();
		}
		  else if (num3>num1 && num3>num2 && num2> num1) {
				respuesta6();
			}
		  else { respuesta7(); 
		}
     }
	
       public static void respuesta1() {
	       System.out.println("El primer numero es mayor y el ultimo el menor");
    }
       public static void respuesta2() {
	       System.out.println("El primer numero es mayor y el de enmiedio el menor");
    }
       public static void respuesta3() {
    	   System.out.println("El segudo numero es mayor y el ultimo el menor");
    	   
    }
       public static void respuesta4() {
    	   System.out.println("El segudo numero es mayor y el primero el menor");
    	   
    }
       public static void respuesta5() {
    	   System.out.println("El tercer numero es mayor y el segundo el menor");
    }
       public static void respuesta6() {
    	   System.out.println("El tercer numero es mayor y el primero el menor");
    }
       public static void respuesta7() {
    	   System.out.println(" EROOR Hay numeros iguales");
    }     
       
}
       
