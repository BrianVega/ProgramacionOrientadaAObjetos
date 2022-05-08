//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.*;
public class POO15ValidarFecha{
   
   public boolean fechaCorrecta(int dia, int mes, int a�o){
      boolean aux = false;
      if((a�o >= 1) && (mes >= 1 && mes <= 12))
         if(diasMes(dia, mes, a�o) == true)
            aux = true; //diasMes = True 
       /*else
            aux = false; //diasMes = False*/
      return aux;
   }//fechaCorrecta
   
   public boolean diasMes(int dia, int mes, int a�o){
   boolean flag = false; 
      switch(mes){
  /*31 d*/case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            if(dia >= 1 && dia <= 31)
               flag = true;
         break;    
  /*30 d*/case 4:
         case 6:
         case 9:
         case 11:
            if(dia >= 1 && dia <= 30)
               flag = true;
         break;
/*28-29d*/case 2:
            if((a�o%400 == 0) || (a�o%4 == 0 && a�o%100 != 0)){
               if(dia >= 1 && dia <= 29)
                  flag = true;
            }//Febrero A�o bisiesto
            else{
               if(dia >= 1 && dia <= 28)
                  flag = true; 
            }//Febrero A�o NO bisiesto     
         break;
      }//Switch Mes  
      return flag;
   }//diasMes
}//Class