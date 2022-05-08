//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.*;
public class POO14SobrecargarMetodos{
   private int numIni, numFin;
   private int rango;
   
   public POO14SobrecargarMetodos(){ //Metodo 1 Rango   
      numIni = -5;
      numFin = 5;
   }//POO14SobrecargarMetodos

   public POO14SobrecargarMetodos(int aux2){ //Metodo 2 Recibir un numero
      if(aux2 < 0)
         numIni = aux2;
      else
         numFin = aux2;
   }//POO14SobrecargarMetodos
   
   public POO14SobrecargarMetodos(int aux31, int aux32){ //Metodo 3 Rango   
      numIni = aux31;
      numFin = aux32;
   }//POO14SobrecargarMetodos
   
   public int valores(){
   int cont=0, aux=0;
      if(cont == 0){
         cont++;
         aux = numIni;
      }// Cont 0  
      else
      if(cont ==1){
         aux = numFin;
         cont--;
      }
   return aux;
   }//valores

}//Class