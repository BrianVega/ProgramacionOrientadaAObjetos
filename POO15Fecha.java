//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.*;
public class POO15Fecha{
   
   private int mes;
   private int dia;
   private int a�o;

   public void POO15Fecha(){
   
   }//Constructor por defecto
   
   public void POO15Fecha(int d, int m, int a){
      dia = d;
      mes = m;
      a�o = a;
      }//Constructor con 3 par�metros
   
   public void reiniciar(){
      dia = 0;
      mes = 0;
      a�o = 0;  
   }//M�todo reiniciar
   
   public void adelantar(int d, int m, int a){
      dia = d;
      mes = m;
      a�o = a;
   }//Metodo adelantar
   
   public void imprimir(){
      System.out.printf("La fecha es: %d / %d / %d \n", dia, mes, a�o);
   }//Metodo imprimir
   
}//Class