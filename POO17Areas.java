//Brian Osvaldo Vega Rodriguez aula: K01
public class POO17Areas{//Operaciones
   
   private float area;
   
   public void calculoAreas(){
      System.out.println("\n\nMetodo sin parámetros");
   }//Constructor por defecto
   
   public float calculoAreas(float base, float altura, int opc){
      if(opc == 1)//opc rectangulo
         area = base * altura;
      else//opc triangulo
         area = (base * altura) / 2;
      return area;
   }//Area rectanguloTriangulo
   
   public float calculoAreas(float radio){
      area = (float)Math.PI * (float)Math.pow(radio,2);
      return area;
   }//Area circulo
   
   public float calculoAreas(float base1, float base2, float altura){
      area = altura * ((base1 + base2)/2);
      return area;
   }//Area trapecio
   
}//Class