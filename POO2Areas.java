import java.util.Scanner;
   public class POO2Areas{
      static double resultado;
      public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int opc;
      do{
      System.out.println("\n~~~~~ M E N U ~~~~~");
      System.out.println("[1] Triangulo");
      System.out.println("[2] Cuadrado");
      System.out.println("[3] Rectangulo");
      System.out.println("[4] Circulo");
      System.out.println("[5] Salir");
      System.out.println("\n(Elija el area de la figura a calcular)");
      opc = leer.nextInt(); 
      switch (opc){
      case 1:
         areaTriangulo();
         System.out.printf("\nEl area del triangulo es de: %.2f\n", (resultado/2), "m^2"); 
         break;
      case 2:
         areaCuadrado();
         System.out.printf("\nEl area del cuadrado es de: %.2f\n", (resultado), "m^2");
         break;
      case 3:
         areaTriangulo();
         System.out.printf("\nEl area del rectangulo es de: %.2f\n", (resultado), "m^2");
         break;
      case 4:
         areaCirculo();
         System.out.printf("\nEl area del circulo es de: %.2f\n", (resultado), "m^2");
         break;      
      }//Fin switch
      
      }while(opc <= 0 && opc >=5);
      
      }//Fin main
      
      public static void areaTriangulo(){
         float base, altura;
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese la base de la figura: ");
               base = leer.nextFloat();
            System.out.print("Ingrese la altura de la figura: ");
               altura = leer.nextFloat();
            resultado = base * altura;
         }//fin areaTriangulo
         
      public static void areaCuadrado(){
         Scanner leer = new Scanner(System.in);
         float lado;
         System.out.print("Ingrese la medida de un lado del cuadrado: ");
            lado = leer.nextInt();
         resultado = lado*lado;
      }//fin area cuadrado
      
      public static void areaCirculo(){
         Scanner leer = new Scanner(System.in);
         float pi = 3.1416f, radio;
         System.out.print("Ingrese el radio del circulo: ");
            radio = leer.nextFloat();
         resultado = pi * Math.pow(radio, 2);
      }//Fin area circulo
   }//Fin clase