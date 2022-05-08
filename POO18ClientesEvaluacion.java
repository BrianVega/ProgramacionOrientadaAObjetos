import java.util.*;
public class POO18ClientesEvaluacion{

   private String nombre = ""; 
   private String direccion = "";
   private String trabajo = "" ;
   private String telefono = "";

   public void POO18ClientesEvaluacion(){//Constructor por defecto
      
      nombre = "";
      direccion = "";
      telefono = "";
      trabajo = "";
   
   }//Constructor por defecto POO18ClientesEvaluacion
   
   public void POO18ClientesEvaluacion(String n, String d, String t){//Metodo alta

       this.nombre = n;
       this.direccion = d;
       this.telefono = t;
       
   }//Metodo POO18ClientesEvaluacion
   
   public void POO18ClientesEvaluacion(String n, String d, String t, String w){//Sobrecarga de metodos alta
   
        this.nombre = n;
        this.direccion = d;
        this.telefono = t;
        this.trabajo  = w;
   
   }//Sobrecarga de metodos POO18ClientesEvaluacion
     
   
   public void setNombre(String n){
         this.nombre = n;
   }
   public String getNombre(){
         return nombre;
   }
   
   
   public void setDireccion(String d){
         this.direccion = d;
   }
   public String getDireccion(){
         return direccion;
   }
   
   
   public void setTelefono(String t){
         this.telefono = t;
   }
   public String getTelefono(){
         return telefono;
   }
   
   
   public void setTrabajo(String w){
         this.trabajo = w;  
   }
   public String getTrabajo(){
         return trabajo;
   }
   

}//Class