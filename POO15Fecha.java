//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.*;
public class POO15Fecha{
   
   private int mes;
   private int dia;
   private int año;

   public void POO15Fecha(){
   
   }//Constructor por defecto
   
   public void POO15Fecha(int d, int m, int a){
      dia = d;
      mes = m;
      año = a;
      }//Constructor con 3 parámetros
   
   public void reiniciar(){
      dia = 0;
      mes = 0;
      año = 0;  
   }//Método reiniciar
   
   public void adelantar(int d, int m, int a){
      dia = d;
      mes = m;
      año = a;
   }//Metodo adelantar
   
   public void imprimir(){
      System.out.printf("La fecha es: %d / %d / %d \n", dia, mes, año);
   }//Metodo imprimir
   
}//Class