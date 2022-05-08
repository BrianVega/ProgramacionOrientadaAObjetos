//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
/*Hola Maestra, la verdad no me quedó muy claro el planteamiento del problema, pero bueno, a lo que entendí
de acuerdo a los videos de la unidad, y el ejercicio, debería ser algo así; sin embargo, no logré solucionar ése error que genera el objeto: */
import java.util.*;
public class POO14PrincipalSobrecargarMetodos{
   public static void main(String args[]){
   int aux2, aux31, aux32;
   POO14SobrecargarMetodos obj1 = new POO14SobrecargarMetodos();
   POO14SobrecargarMetodos obj2 = new POO14SobrecargarMetodos(aux2);
   POO14SobrecargarMetodos obj3 = new POO14SobrecargarMetodos(aux31, aux32);
   POO14SobrecargarMetodos acceso = new POO14SobrecargarMetodos();
   
   Scanner leer = new Scanner(System.in);
   
   //Metodo 1:
      System.out.println("Metodo 1: ");
      System.out.println("Primer rango: A: " + acceso.valores() + "B: " + acceso.valores()); 
      obj1.POO14SobrecargarMetodos();
    
   //Metodo 2:
      System.out.println("Metodo 2: ");
      System.out.print("Ingrese un numero: ");
      aux2 = leer.nextInt (); 
      obj2.POO14SobrecargarMetodos(aux2);
      System.out.println("Segundo rango: A: " + acceso.valores() + "B: " + acceso.valores()); 
      
   //Metodo 3:
      System.out.println("Metodo 3: ");
      System.out.print("Ingrese los dos numeros del rango: [a - b]");
      System.out.print("a) Primer numero: ");
         aux31 = leer.nextInt();
      System.out.print("b) Segundo numero: ");
         aux32 = leer.nextInt();
      obj3.POO14SobrecargarMetodos();
      System.out.println("Tercer rango: A: " + acceso.valores() + "B: " + acceso.valores()); 
      
   //Impresion
      System.out.println("El rango: A: " + acceso.valores() + " B: " + acceso.valores() + " contiene " + acceso.valores() + " positivos " + (acceso.valores()-1) + " Negativos"); 

   }//Main
}//Class