import java.util.*;
public class Vega_Rodriguez_Sillas{
   static float niños, oficina, terrazas;
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);
   int opc=0;
   float totalNiños=0, totalOficina=0, totalTerraza=0;
   
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
      System.out.print("\nIngrese la cantidad de sillas para niños vendida: ");
         totalNiños = ventaSillas(niños);
      System.out.print("Ingrese la cantidad de sillas para oficina vendida: ");
         totalOficina = ventaSillas(oficina);
      System.out.print("Ingrese la cantidad de sillas para terrazas vendida: ");
         totalTerraza = ventaSillas(terrazas);
      System.out.println("\nEl total de las sillas para niños es de: $" + totalNiños);
      System.out.println("El total de las sillas para niños es de: $" + totalOficina);
      System.out.println("El total de las sillas para niños es de: $" + totalTerraza);
      break;
   case 3:
      System.out.println("\nEl total de la compra de sillas es de: $" + ventaTotal(totalNiños, totalOficina, totalTerraza));
      break;
   }//switch
   }while(opc != 4);   
   }//main
   
   public static void captura(){
   Scanner leer = new Scanner(System.in);

   System.out.println("\nIngrese el precio de las sillas segun su categoria");
   System.out.print("Sillas para niños: $");
      niños = leer.nextFloat();
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
   
   public static float ventaTotal(float totalNiños, float totalOficina, float totalTerraza){
   float totalFinal;
   totalFinal = totalNiños + totalOficina + totalTerraza;
   return totalFinal;
   }//ventaTotal
}//class