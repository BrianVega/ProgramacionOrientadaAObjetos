import java.util.*;
public class Arreglo_int{
   private int vec[] = new int[10];
   private int cas;
   Scanner leer;
   public void llenar(){
      leer = new Scanner(System.in);
      for(int i=0; i<10; i++){
         System.out.print("Dame el dato [" + (i+1) +"] : ");
         vec[i] = leer.nextInt();
      }//for
   }//llenar
   public int[] mostrar(){
      return vec;
   }//mostrar
   public boolean par(int cas){
      boolean par = false;
      if(vec[cas]%2==0)
         par = true;
      return par;
   }//par
}//Class Arreglo_int