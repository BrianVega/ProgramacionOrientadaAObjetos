import java.util.Scanner;
public class POO4MCD{
   static int num1=0, num2=0;
   public static void main(String args[]){
   
   capturar();
   System.out.println("\nEl maximo comun divisor de: " + num1 + " y " + num2 + " es: " + MCD());
   
   }//main
   
   public static void capturar(){
      Scanner leer = new Scanner(System.in);
      
      do{
         System.out.print("Dame el primer numero: ");
         num1 = leer.nextInt();
      }while(num1 <= 0);
      do{
         System.out.print("Dame el segundo numero: ");
         num2 = leer.nextInt();
      }while(num2 <= 0);
   }//fin capturar
   
   public static int MCD (){
      int max = 0, min = 0;
      if(num1 < num2)
         min = num1;
      else
         min = num2;
      for(int i = 1; i<min; i++)
         if(num1 %i == 0 && num2 %i == 0)
            max = i;
      return max;
   }//fin MCD
   
}//Class