import java.util.Scanner;
public class POO5MayorDeTres{
   static int num1, num2, num3;
   public static void main (String Args[]){
   
      lecturaMayor();
      System.out.println("El numero mayor de los 3 es: " + resultadoMayor());
      
   }//main
   
      public static void lecturaMayor(){
         Scanner leer = new Scanner(System.in);
         System.out.println("~~Ingrese los numeros a comparar~~");
         System.out.print("Primer numero: ");
            num1 = leer.nextInt();
         System.out.print("\nSegundo numero: ");
            num2 = leer.nextInt();
         System.out.print("\nTercer numero: ");
            num3 = leer.nextInt();    
      }//lecturaMayor 
      
      public static int resultadoMayor(){
         int mayor;
         if (num1 > num2 && num1 > num3)
            mayor = num1;
         else
            if (num2 > num1 && num2 > num3)
               mayor = num2;
            else
               mayor= num3;
         return mayor;
      }//resultadoMayor
}//Class