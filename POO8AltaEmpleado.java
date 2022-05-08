import java.util.*;
public class POO8AltaEmpleado{
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);
      float salario, horas;
      salario = alta();
      System.out.print("\nIngrese las horas trabajadas: ");
      horas = leer.nextInt();
      System.out.printf("Su pago es de: $%.2f", pago(salario, horas));
   }//Main
   
   public static float alta(){
   Scanner leer = new Scanner(System.in);
   int clave[] = new int[1];
   float salario[] = new float[1], retorno=0;
   String nombre[] = new String[1], direccion[] = new String[1];
      System.out.println("Ingresar nuevo usuario");
         for(int x=0; x<1; x++){
            System.out.print("\nIngrese su clave: ");
               clave[x] = leer.nextInt();
            System.out.print("\nIngrese su salario por hora: ");
               salario[x] = leer.nextFloat();
               leer.nextLine();//buffer
            System.out.print("\nIngrese su nombre: ");
               nombre[x] = leer.nextLine();
            System.out.print("\nIngrese su direccion ");
               direccion[x] = leer.nextLine();
            retorno = salario[x];
         }//for
   return retorno;
   }//alta
   
   public static float pago(float salario, float horas){
      return salario * horas;
   }//pago
}//Class