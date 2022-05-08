import java.util.*;
public class Algoritmia1{
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);
   int cantidad=0, target;
   //int array[] = new int[cantidad];
      
   System.out.print("¿Cuantos numeros ingresara: ");
      cantidad = leer.nextInt();      
   
   int array[] = new int[cantidad];

   System.out.println("\nIngrese los numeros: ");
   for(int i=0; i<cantidad; i++){
      System.out.print("Numero " + i +")");
      array[i] = leer.nextInt();
   }
   System.out.print("Ingrese el target: ");
      target = leer.nextInt();
      
      for(int x=0; x<cantidad; x++){
         for(int i=0; i<cantidad; i++){
            if(array[x] + array[i] == target);
               System.out.print(x + ", " + i);
               break;
         }//for i
         break;
      }//for x
         
   }//main
}//class