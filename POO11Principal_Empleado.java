//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO11Principal_Empleado{
   public static void main(String args[]){
   POO11Empleado emp = new POO11Empleado();
   Scanner leer = new Scanner(System.in);
   int opc=0;
   do{
      System.out.println("~~~~~Ingrese una opcion~~~~~");
      System.out.println("[1] Registrar datos");
      System.out.println("[2] Consultar salario");
      System.out.println("[3] Salir");
      System.out.print("Opcion: ");
      opc = leer.nextInt();
   switch (opc){
      case 1:
         emp.pedirDatos();
         break;
      case 2:
         System.out.println("El empleado: " + emp.obtenerNom() + " tiene un salario neto de: $" + emp.calcSalario());
         break;
      case 3:
         System.out.println(" A D I O S ");
         System.exit(0);
         break;
   default: System.out.println("Elige una opcion correcta: ");   
   }//Switch
   }while(opc >= 1 && opc <= 3);
   }//Main
}//Class principal