//Brian Osvaldo Vega Rodriguez aula: K01
public class POO16Areas{//Operaciones
   
   private float area;
   
   public POO16Areas (){
   }//Constructor por defecto
   
   public float POO16Areas(float base, float altura, int opc){
      if(opc == 1)//opc rectangulo
         area = base * altura;
      else//opc triangulo
         area = (base * altura) / 2;
      return area;
   }//Area rectanguloTriangulo
   
   public float POO16Areas(float radio){
      area = (float)Math.PI * (float)Math.pow(radio,2);
      return area;
   }//Area circulo
   
   public float POO16Areas(float base1, float base2, float altura){
      area = altura * ((base1 + base2)/2);
      return area;
   }//Area trapecio
   
}//Class