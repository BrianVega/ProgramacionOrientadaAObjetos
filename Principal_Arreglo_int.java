import java.util.*;
public class Principal_Arreglo_int{
   public static void main(String args[]){
      Arreglo_int arre = new Arreglo_int();
      int opc=0;
      do{
         Scanner leer = new Scanner(System.in);
         System.out.println("\nM E N U");
         System.out.println("[1] Pedir datos");
         System.out.println("[2] Mostrar arreglo");
         System.out.println("[3] Mostrar pares");
         System.out.println("[4] Salir");
         System.out.print("Opcion: ");
            opc = leer.nextInt();
         switch(opc){
         case 1:
            arre.llenar();
            break;
         case 2:
            int vector[] = arre.mostrar();
            System.out.println("Elementos del arreglo");
            for(int x=0; x<vector.length; x++)
               System.out.println("Elemento [" + (x+1) + "]: " + vector[x]);
            break;
         case 3:
            for(int x=0; x<arre.mostrar().length; x++)
               if(arre.par(x))
                  System.out.println("El elemento: " + arre.mostrar()[x] + " es par y se encuentra en la casilla " + x);
            break;
         case 4:
            System.out.println("A D I O S");
            System.exit(0);
            break;
         default: System.out.println("Elige una opcion valida");

         }//switch
      }while(opc != 4);
   }//main   
}//class