//Brian Osvaldo Vega Rodriguez Aula: K01 ISC
import java.util.*;
public class POO11Empleado{
   private String nombre;
   private float horas, pago;
   private int faltas;
   private double salario;
   Scanner leer;
   public void pedirDatos(){
         leer = new Scanner(System.in);
      System.out.print("Dame el nombre: ");
         nombre = leer.nextLine();
      System.out.print("Horas trabajadas por semana: ");
         horas = leer.nextInt();
      System.out.print("Pago por hora: ");
         pago = leer.nextInt();
      System.out.print("Faltas: ");
         faltas = leer.nextInt();
   }//pedirDatos
   
   public double calcSalario(){
      salario = (pago * horas);
      salario = salario - (salario * .10) - (faltas * (pago * 8));
      return salario;
   }//calcSalario
   
   public String obtenerNom(){
         return nombre;
   }//obtenerNom

}//class Empleado