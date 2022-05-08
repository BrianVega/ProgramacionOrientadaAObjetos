import java.util.*;
public class POO11Tablas{
   public static void main(String args[]){
   int num, lim;
      num = numero();
      lim = limite();
   for(int x=1; x<lim+1; x++){
      int multi = num*x;
      System.out.println(num + "x" + x + " = " + multi);
   }//for
   }//Main   
   
   public static int numero(){
   Scanner leer = new Scanner(System.in);
   int num;
      System.out.print("Ingrese el numero a multiplicar: ");
      num = leer.nextInt();
   return num;
   }//numero
   
   public static int limite(){
   Scanner leer = new Scanner(System.in);
   int lim;
      System.out.print("Ingrese el limite de las multiplicaciones: ");
      lim = leer.nextInt();
   return lim; 
   }//limite
}//class