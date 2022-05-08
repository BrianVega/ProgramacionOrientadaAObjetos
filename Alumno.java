import java.util.*;
public class Alumno{
   private String Nombre;
   private int calif1, calif2, calif3, calif4;
   private double prom;
   Scanner leer;
   public void pedirDatos(){
      leer = new Scanner(System.in);
      System.out.print("Dame el nombre: ");
         Nombre = leer.nextLine();
      System.out.print("Dame la calificacion 1: ");
         calif1 = leer.nextInt();
      System.out.print("Dame la calificacion 2: ");
         calif2 = leer.nextInt();
      System.out.print("Dame la calificacion 3: ");
         calif3 = leer.nextInt();
      System.out.print("Dame la calificacion 4: ");
         calif4 = leer.nextInt();
   }//pedirDatos
   
   public double calcProm(){
         prom = (calif1 + calif2 + calif3 + calif4)/4;
      return prom;
   }//calcProm   
   
   public String obtenerNom(){
         return Nombre;
   }//obtenerNom
}//class