import java.util.Scanner;
   public class POO3ConversionDivisas{
      static float pesos, resultado;
      public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int opc;
      System.out.print("Ingrese la cantidad de pesos para convertir: $");
         pesos = leer.nextFloat();
      do{
      System.out.println("\n~~~~~ M E N U ~~~~~");
      System.out.println("[1] Euros");
      System.out.println("[2] Libras esterlinas");
      System.out.println("[3] Yenes");
      System.out.println("[4] Dolares");
      System.out.println("[5] Salir");
      System.out.println("\n(Seleccione a que moneda desea convertir sus pesos)");
      opc = leer.nextInt(); 
      switch (opc){
         case 1:
            euros();
         break;
         case 2:
            libras();
         break;
         case 3:
            yenes();
         break;
         case 4:
            dolares();
         break;    
      }//Fin switch
      }while(opc <= 0 && opc >=5);
      }//fin main
      
      public static void euros(){
      resultado = pesos * 0.049f;
      System.out.print("El resultado es: "+ resultado);
      }//fin euros
      
      public static void libras(){
      resultado = pesos * 0.041f;
      System.out.print("El resultado es: "+ resultado);
      }//fin libras
      
      public static void yenes(){
      resultado = pesos * 5.86f;
      System.out.print("El resultado es: "+ resultado);
      }//fin yenes
      
      public static void dolares(){
      resultado = pesos * 0.053f;
      System.out.print("El resultado es: "+ resultado);
      }//fin dolares
         
   }//Fin class