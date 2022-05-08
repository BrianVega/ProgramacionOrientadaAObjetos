import java.util.*;
public class SimulacionExamenU1{
   static float perifericos, accesorios, computadoras;
   public static void main(String args[]){
         
         precios();
         System.out.printf("El total de todos los articulos es de: $%.2f\n", articulos());
   }//main
   
   public static void precios(){
   Scanner leer =  new Scanner(System.in);
      System.out.println("~~~Ingrese los precios de cada categoria~~~");
      System.out.print("Perifericos: $");
         perifericos = leer.nextInt();
      System.out.print("Accesorios: $");
         accesorios = leer.nextInt();
      System.out.print("Computadoras: $");
         computadoras = leer.nextInt();
   }//precios
   
   public static float articulos(){
   Scanner leer = new Scanner(System.in);
   float p, a, c;
   float totalP, totalA, totalC;
      System.out.println("\n~~~Ingrese la cantidad de articulos por categoria~~~");
      System.out.print("Perifericos: ");
         p = leer.nextInt();
         totalP = descuentoPerifericos(p);
      System.out.print("Accesorios: ");
         a = leer.nextInt();
      System.out.print("Computadoras: ");
         c = leer.nextInt();
         totalP = descuentoPerifericos(p);
         totalA = descuentoAccesorios(a);
         totalC = descuentoComputadoras(c);
      System.out.println("\nEl total de los perifericos es de: $" + totalP);
      System.out.println("El total de los accesorios es de: $" + totalA);
      System.out.println("El total de los computadoras es de: $" + totalC);

      return total(totalP, totalA, totalC);
   }//articulos
   
   public static float descuentoPerifericos(float p){
   float totalP;
      if (p >= 3)
         totalP = perifericos - ((perifericos * p) * .05f);
      else
         totalP = (perifericos * p);
      return totalP;
   }//descuentoPerifericos
   
   public static float descuentoAccesorios(float a){
   float totalA;
      if (a >= 3)
         totalA = accesorios - ((accesorios * a) * .08f);
      else
         totalA = (accesorios * a);
      return totalA;
   }//descuentoAccesorios
   
   public static float descuentoComputadoras(float c){
   float totalC;
      if (c >= 2)
         totalC = computadoras - ((computadoras * c) * .12f);
      else
         totalC = (computadoras * c);
      return totalC;
   }//descuentoComputadoras
   
   public static float total(float totalP, float totalA, float totalC){
   float total;
   
   total =  totalP + totalA + totalC;
      return total;
   }//total
}//class