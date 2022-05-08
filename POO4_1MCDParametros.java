import java.util.Scanner;
public class POO4_1MCDParametros{
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);
   int num1=0, num2=0;   
   do{
   System.out.print("Dame el primer numero: ");
      num1 = leer.nextInt();
   }while(num1 <= 0);
   do{
   System.out.print("Dame el segundo numero: ");
      num2 = leer.nextInt();
   }while(num2 <= 0);   
   System.out.println("\nEl maximo comun divisor de: " + num1 + " y " + num2 + " es: " + MCD(num1, num2));
   
   }//main
   
   public static int MCD (int num1, int num2){
      
      int max = 0, min = 0; //num1 = n1, num2 = n2;
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