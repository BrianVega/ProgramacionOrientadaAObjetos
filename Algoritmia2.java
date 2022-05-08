import java.util.*;
public class Algoritmia2{
   public static void main(String args[]){
   int num1, num2, suma=0;
   Scanner leer = new Scanner(System.in);
   
   System.out.print("Primer numero: ");
      num1 = leer.nextInt();
   System.out.print("Segundo numero: ");
      num2 = leer.nextInt();
      

      suma = (num1 + num2) / 2;
      
   System.out.print("Resultado " + suma);   
   }//main
}//class