/*Calcular la suma de 15 elementos de un arreglo de tipo double*/
import java.util.*;
public class Arreglo_double{
   private double vec[] = new double[15];
   Scanner leer;
   public void llenar(){
      leer = new Scanner(System.in);
      for(int i=0; i<15; i++){
         System.out.print("Dame el dato [" + (i+1) +"] : ");
         vec[i] = leer.nextInt();
      }//for
   }//llenar
   public double[] mostrar(){
      return vec;
   }//mostrar
   public double suma(){
      double suma=0;
      for(int x=0; x<vec.length; x++)
         suma = suma + vec[x];
      return suma;
   }//par
}//Class Arreglo_int