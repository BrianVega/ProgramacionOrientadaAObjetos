//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO12ArreglosPrimos{
   private int nums[] = new int[10];
   Scanner leer;
   public void llenar(){
   leer = new Scanner(System.in);
      System.out.println("Ingrese los numeros: ");
      for(int x=0; x<nums.length; x++){
         System.out.print("Numero "+ (x+1) + "): ");
      }//for
   }//Llenar      
         
    public boolean primos(int var){
    leer = new Scanner(System.in);
    boolean flag=true;
      int cont=0;
         for(int x = 1; x <= nums[var]; x++){
            if((nums[var] % x) == 0)
               cont++;
            else
               cont = cont;
         }//for X
         
      if(cont == 2)
        flag=true;
      else
        flag=false;      
      return flag;
    }//Primos
       public int[] arreglo(){
      return nums;
   }//arreglo

}//class