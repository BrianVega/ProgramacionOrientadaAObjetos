//Brian Osvaldo Vega Rodriguez aula: K01
import java.util.Scanner;
public class POO16PrincipalAreas{
   static Scanner leer = new Scanner(System.in);
   public static void main(String args[]){
      
      POO16Areas obj1 = new POO16Areas();
      
      int opc;
      do{
         System.out.println("  \n\nCALCULO DE AREAS  ");
         System.out.println("~~ M E N U ~~");
         System.out.println("[1] Rectangulo");
         System.out.println("[2] Circulo");
         System.out.println("[3] Triangulo");
         System.out.println("[4] Trapecio");
         System.out.println("[5] Salir");
         System.out.print("Opción: ");
         
         opc = leer.nextInt();
         switch (opc){
            case 1:
               System.out.printf("El area del rectangulo es: %.2f cm^2", obj1.POO16Areas(base(), altura(), opc));
            break;
            case 2:
               System.out.printf("El area del circulo es: %.2f cm^2", obj1.POO16Areas(radio()));
            break;
            case 3:
               System.out.printf("El area del triangulo es: %.2f cm^2", obj1.POO16Areas(base(), altura(), opc));
            break;
            case 4:
               System.out.printf("El area del trapecio es: %.2f cm^2", obj1.POO16Areas(base(), baseT(), altura()));
            break;
         }//Switch
      }while(opc > 0 && opc < 5);  
   }//Main 
      
      static float base(){
      float base;
         System.out.print("\nIngrese la base: ");
          base = leer.nextFloat();
         return base;
      }//base
      
      static float altura(){
      float altura;
         System.out.print("\nIngrese la altura: ");
          altura = leer.nextFloat();
         return altura;
      }//altura
     
      static float radio(){
      float radio;
         System.out.print("\nIngrese el radio: ");
          radio = leer.nextFloat();
         return radio;
      }//Radio - Circulo
      
      static float baseT(){
      float baseT;
         System.out.print("\nIngrese la segunda base: ");
          baseT = leer.nextFloat();
         return baseT;
      }//Segunda base - Trapecio
}//Class