import java.util.*;
public class Principal_Alumno{
   public static void main(String args[]){
   Alumno alum = new Alumno();
   int opc = 0;
      do{
      Scanner leer = new Scanner(System.in);
         System.out.println("MENU");
         System.out.println("[1] Pedir datos");
         System.out.println("[2] Calcular promedio");
         System.out.println("[3] Salir");
         System.out.print("Elige una opcion: ");
         opc = leer.nextInt();
      switch(opc){
      case 1: 
         alum/*pedir objeto*/.pedirDatos();/*Metodo*/
         break;
      case 2: 
         System.out.println("El alumno: " + alum.obtenerNom() + "tiene un  promedio de: " + alum.calcProm());
         break;
      case 3: 
         System.out.println(" A D I O S ");
         System.exit(0);
         break;
      default: System.out.println("Elige una opcion correcta: ");
      }//Switch
      }while(opc != 3);
   }//Main
}//class