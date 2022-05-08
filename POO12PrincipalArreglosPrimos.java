//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO12PrincipalArreglosPrimos{
   public static void main(String args[]){
   POO12ArreglosPrimos acceso = new POO12ArreglosPrimos();
   Scanner leer = new Scanner(System.in);
   int opc=0;
   do{   
      System.out.println("M E N U");   
      System.out.println("[1] Ingresar datos");   
      System.out.println("[2] Numeros primos y no primos");   
      System.out.println("[3] Salir");
      System.out.print("Opcion: ");
         opc = leer.nextInt();
      switch (opc){
         case 1:
            acceso.llenar();
            break;
         case 2:
            for(int x=0; x<10;/*acceso.arreglo().length;*/ x++)
               if(acceso.primos(x))
                  System.out.println("El numero: " + acceso.arreglo()[x] + " SI es primo y se encuentra en la casilla: " + x);
               else
                  System.out.println("El numero: " + acceso.arreglo()[x] + " NO es primo y se encuentra en la casilla: " + x);
         break;
         case 3:
            System.out.println("A D I O S");
            System.exit(0);
            break;
         default: System.out.println("Elige una opcion valida");
      }//Switch      
    }while (opc > 0 && opc < 3);
   }//Main   
}//Class