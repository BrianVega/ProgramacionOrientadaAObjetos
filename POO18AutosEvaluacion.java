import java.util.*;
public class POO18AutosEvaluacion{

   private String marca;
   private String modelo;
   private String falla;
   private String placas;

   public void POO18AutosEvaluacion(){//Constructor por defecto
   
      marca = "";
      modelo = "";
      falla = "";
      placas = "";
      
   }//Constructor por defecto   
   
   public void POO18AutosEvaluacion(String m, String md, String f, String p){//Sobrecarga del metodo constructor por defecto
   
      this.marca = m;
      this.modelo = md;
      this.falla = f;
      this.placas = p;
      
   }//Sobrecarga del metodo constructor por defecto


   public void setMarca(String m){
      this.marca = m;
   }
   public String getMarca(){
      return marca;
   }
    
    
   public void setModelo(String md){
      this.modelo = md;
   }
   public String getModelo(){
      return modelo;
   }
   
   
   public void setFalla(String f){
      this.falla = f;
   }
   public String getFalla(){
      return falla;
   }
   
   
   public void setPlacas(String p){
      this.placas = p;
   }
   public String getPlacas(){
      return placas;
   }
}//class POO18AutosEvaluacion