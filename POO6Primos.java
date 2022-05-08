import java.util.Scanner;
public class POO6Primos{
   public static void main(String args[]){
   int aux;
   
   aux = leerNumero();
   //clasificarNumero(aux);
   if (clasificarNumero(aux) == true)
      System.out.println("\nEl numero es primo");
   else
      System.out.println("\nEl numero no es primo");
   }//main
   
   public static int leerNumero(){
      Scanner leer = new Scanner(System.in);
      int num;
      
      System.out.print("Ingrese el numero: ");
      num = leer.nextInt();
      return num;
   }//leerNumero
   
   public static boolean clasificarNumero(int aux){
      int auxNum;
      boolean flag;
         auxNum = aux-1;
         while (aux % auxNum != 0){
            auxNum--;
         }//While
         if(auxNum == 1)
            flag = true;
         else
            flag = false;
            
         return flag;
   }//clasificarNumero
}//class