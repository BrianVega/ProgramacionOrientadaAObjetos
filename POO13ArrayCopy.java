//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO13ArrayCopy{
   private double arreglo15[] = new double[15];
   private double arreglo20[] = new double[20];
   Scanner leer;
   public void llenar(){
   double aux;
   leer = new Scanner(System.in);
      System.out.println("Ingrese los numeros:");
      for(int x=0; x<arreglo15.length; x++){
         System.out.print("Numero " + x + "): ");
            aux = leer.nextDouble();
            arreglo15[x] = Math.pow(aux,2);
      }//for x
   }//Llenar  
   public void copiar(){
      System.arraycopy(arreglo15, 5, arreglo20, 10, 10);
   }//Copiar
   
   public double[] array15(){
      return arreglo15;
   }//array15
   
      public double[] array20(){
      return arreglo20;
   }//array20
}//Class