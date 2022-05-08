import java.util.*;
public class Vega_Rodriguez_Sillas{
   static float ni�os, oficina, terrazas;
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);
   int opc=0;
   float totalNi�os=0, totalOficina=0, totalTerraza=0;
   
   do{
   System.out.println("\n~~~~~~Menu~~~~~~");
   System.out.println("[1] Capturar el precio de las sillas");
   System.out.println("[2] Calcular la venta por tipo de sillas");
   System.out.println("[3] Calcular la venta total de todas las sillas");
   System.out.println("[4] Salir");
   System.out.print("Opcion: ");
   opc = leer.nextInt();
   //}while(opc != 4);   
   switch (opc){
   case 1:
      captura();
      break;
   case 2:
      System.out.print("\nIngrese la cantidad de sillas para ni�os vendida: ");
         totalNi�os = ventaSillas(ni�os);
      System.out.print("Ingrese la cantidad de sillas para oficina vendida: ");
         totalOficina = ventaSillas(oficina);
      System.out.print("Ingrese la cantidad de sillas para terrazas vendida: ");
         totalTerraza = ventaSillas(terrazas);
      System.out.println("\nEl total de las sillas para ni�os es de: $" + totalNi�os);
      System.out.println("El total de las sillas para ni�os es de: $" + totalOficina);
      System.out.println("El total de las sillas para ni�os es de: $" + totalTerraza);
      break;
   case 3:
      System.out.println("\nEl total de la compra de sillas es de: $" + ventaTotal(totalNi�os, totalOficina, totalTerraza));
      break;
   }//switch
   }while(opc != 4);   
   }//main
   
   public static void captura(){
   Scanner leer = new Scanner(System.in);

   System.out.println("\nIngrese el precio de las sillas segun su categoria");
   System.out.print("Sillas para ni�os: $");
      ni�os = leer.nextFloat();
   System.out.print("Sillas para oficina: $");
      oficina = leer.nextFloat();
   System.out.print("Sillas para terrazas: $");
      terrazas = leer.nextFloat();
   }//captura
   
   public static float ventaSillas(float aux){
   Scanner leer = new Scanner(System.in);
   int cantidad;
   float total;
   cantidad = leer.nextInt();
   total = (float)cantidad * aux;
   return total;
   }//ventaSillas
   
   public static float ventaTotal(float totalNi�os, float totalOficina, float totalTerraza){
   float totalFinal;
   totalFinal = totalNi�os + totalOficina + totalTerraza;
   return totalFinal;
   }//ventaTotal
}//class