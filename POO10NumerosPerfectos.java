import java.util.*;
public class POO10NumerosPerfectos{
   public static void main(String args[]){
   int num; 
   boolean perfecto;
   num = captura();
   perfecto = perfecto(num);
   if(perfecto == true)
      System.out.println("El numero SI es perfecto");
   else
      System.out.println("EL numero NO es perfecto");
   }//Main
   
   public static int captura(){
   int num;
   Scanner leer = new Scanner(System.in);
      System.out.print("Ingrese el numero a analizar: ");
      num = leer.nextInt();
   return num;
   }//captura
   
   public static boolean perfecto(int num){
   boolean flag = false;
   int suma=0, numeros[] = new int[num];
      for(int x=1; x<num; x++){
         if (num % x == 0){
            numeros[x] = x;
         }//if               
      }//for X
      for(int i=0; i<numeros.length; i++){
         suma = suma + numeros[i];
      }//for I
      if(suma == num)  
         flag = true;
      else
         flag = false;
   return flag;
   }//perfecto
}//class