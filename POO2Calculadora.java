import java.util.Scanner;
public class POO2Calculadora{
   static int num1=0, num2=0, opc=0;
   static double resp;
   
   public static void main(String args[]){
   int opc;
   Scanner leer = new Scanner(System.in);
   do{
   System.out.println("\n~~~~~ M E N U ~~~~~");
   System.out.println("[1] Sumar");
   System.out.println("[2] Restar");
   System.out.println("[3] Multiplicar");
   System.out.println("[4] Dividir");
   System.out.println("[5] Salir");
   System.out.println("\n(Elige una opcion)");
   opc = leer.nextInt(); 
   switch (opc){
      case 1:
         sumar();
         break;
      case 2:
         resta();
         break;
      case 3: 
         multi();
         break;
      case 4: 
         divi();
         
   }//fin switch
   }while (opc >= 1 && opc <= 4);
   
   }//main
   
   public static void sumar(){
      validacion();
      System.out.printf("El resultado de la suma es: %d", num1 + num2);
   }//fin metodo sumar
   
   public static void resta(){
      validacion();
      System.out.printf("El resultado de la resta es: %d", num1 - num2);
   }//fin metodo resta
   
   public static void multi(){
      validacion();
      System.out.printf("El resultado de la multiplicacion es: %d", num1 * num2);
   }//fin metodo multiplicacion

   public static void divi(){
      validacion();
      System.out.printf("El resultado de la division es: %d", num1 / num2);
   }//fin metodo division

      static void validacion(){
      Scanner leer = new Scanner(System.in);
      do{
         System.out.print("\nIngrese el primer numero: ");
         num1 = leer.nextInt();
      }while (num1 <=0 );
      do{
         System.out.print("\nIngrese el segundo numero: ");
         num2 = leer.nextInt();
      }while (num2 <= 0);

      }//fin validacion
      
     }//class
