//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO13PrincipalArrayCopy{
   public static void main(String args[]){
   POO13ArrayCopy acceso = new POO13ArrayCopy();
   Scanner leer = new Scanner(System.in);
   int opc=0;
   do{   
      System.out.println("M E N U");   
      System.out.println("[1] Llenar arreglos");   
      System.out.println("[2] Imprimir arreglos");   
      System.out.println("[3] Salir");
      System.out.print("Opcion: ");
         opc = leer.nextInt();
      switch (opc){
         case 1: 
            acceso.llenar();
            break;
         case 2:
            acceso.copiar();
            int cont=-1;
               for(int x=0; x<acceso.array15().length; x++){
                  cont++;
                  if(cont <= acceso.array15().length)
                     System.out.println(acceso.array15()[x] + " -- " + acceso.array20()[x]);
               }//for Array15       
                  for(int i=cont+1; i<acceso.array20().length; i++)
                     System.out.println(acceso.array20()[i]);
            break;
         case 3:
            System.out.println("A D I O S");
            System.exit(0);
            break;
         default: System.out.println("Elige una opcion valida");
      }//Switch-
   }while(opc > 0 && opc < 3);
 
   
   }//Main
}//Class