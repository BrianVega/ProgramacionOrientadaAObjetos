//Entrada 15, AnitaLavaLaTina - Salida A13a

import java.util.*;
public class Algoritmia3{
   public static void main(String [] args){
   Scanner leer = new Scanner(System.in);
   int n;
   System.out.print("Caracteres: ");
   n = leer.nextInt();
   leer.nextLine();
   String palabra;
   System.out.print("\nPalabra: ");
   palabra = leer.nextLine();
   
   if(n > 10){
      System.out.print(palabra.charAt(0) + (n-2) + palabra.charAt(n-1));
   }//if
   else{
      System.out.print(palabra);
   }//else
   
   
   }//Main
}//Class