//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.*;
public class POO15PrincipalFecha{
   public static void main(String args[]){
   
      POO15Fecha obj1 = new POO15Fecha();
      POO15ValidarFecha obj2 = new POO15ValidarFecha();
      Scanner leer = new Scanner(System.in); 
      int opc=0, d=0, m=0, a=0;
      do{
      System.out.println("\n~ M E N U ~");
      System.out.println("[1] Insertar fecha");
      System.out.println("[2] Reiniciar");
      System.out.println("[3] Adelantar");
      System.out.println("[4] Imprimir");
      System.out.println("[5] Salir");
      System.out.print("Opción: ");
         opc = leer.nextInt();
      switch(opc){
         case 1:
            obj1.reiniciar();
            System.out.print("\nDía: ");
               d = leer.nextInt();
            System.out.print("\nMes: ");
               m = leer.nextInt();
            System.out.print("\nAño: ");
               a = leer.nextInt();
            obj1.POO15Fecha(d, m, a);
            if(obj2.fechaCorrecta(d, m, a) == true)
               System.out.println("La fecha ingresada es correcta");
            else{
               System.out.println("La fecha ingresada NO es correcta");   
               obj1.reiniciar();
               }         
         break;
         
         case 2:
            obj1.reiniciar();
         break;
         
         case 3:
            System.out.print("Ingrese el nuevo día: ");
               d = leer.nextInt();
            System.out.print("\nIngrese el nuevo mes: ");
               m = leer.nextInt();
            System.out.print("\nIngrese el nuevo año: ");
               a = leer.nextInt();
            if(obj2.fechaCorrecta(d, m, a) == true){
               System.out.println("La fecha ingresada es correcta");
               obj1.adelantar(d, m, a);
            }
            else
               System.out.println("La fecha ingresada NO es correcta");   
         break;
         
         case 4:
            obj1.imprimir();
         break;
            
      }//Swtich opc
      }while(opc >= 1 && opc <= 4);
   }//Main
}//Class