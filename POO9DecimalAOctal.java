import java.util.*;
public class POO9DecimalAOctal{
   public static void main(String args[]){
   int numero;
   
   numero = numero();    
   System.out.println("El numero " + numero + " convertido a binario es: " + binario(numero));
   System.out.println("El numero " + numero + " convertido a hexadecimal es: " + hexadecimal(numero));
   System.out.println("El numero " + numero + " convertido a octal es: " + octal(numero));
   }//main
   
   public static int numero(){
   Scanner leer = new Scanner(System.in);
   int numero;
      System.out.print("Ingrese el numero a convertir: ");
      numero = leer.nextInt();
   return numero; 
   }//numero
   
   public static String binario(int numero){
   String bin;
      bin = Integer.toBinaryString(numero);
   return bin;
   }//binario
   
   public static String hexadecimal(int numero){
   String hexa;
      hexa = Integer.toHexString(numero);
   return hexa;
   }//binario
   
   public static String octal(int numero){
   String oct;
      oct = Integer.toOctalString(numero);
   return oct;
   }//binario
   
   
}//class