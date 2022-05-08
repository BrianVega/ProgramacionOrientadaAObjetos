import java.util.Scanner;
public class POO7MediaVarianza{
   public static void main(String args[]){
   int cantidad, suma=0;
   float media, varianza=0;
      cantidad = lectura();
   int numeros[] = new int [cantidad]; // Arreglo
      for(int x=0; x<numeros.length; x++)
         numeros[x] = registro();
      for(int x=0; x<numeros.length; x++)
         suma = suma + numeros[x];
      media = media(suma, cantidad);
      for(int x=0; x<numeros.length; x++)
         varianza = varianza + varianza(numeros[x], media);
      varianza = varianza/(cantidad-1);
      System.out.printf("\nEl valor de la media es: %.2f", media);
      System.out.printf("\nEl valor de la varianza es: %.2f", varianza);
      System.out.printf("\nEl valor de la variacion estandar es: %.2f", variacion(varianza));
   }//Main
   
   public static int lectura(){
      Scanner leer = new Scanner(System.in);
      int aux;
         System.out.print("Ingrese la cantidad de numeros que ingresara: ");
         aux = leer.nextInt();  
      return aux;
   }//lectura
   
   public static int registro(){
   Scanner leer = new Scanner(System.in);
   int aux;
      System.out.print("Ingrese el numero: ");
      aux =  leer.nextInt();
   return aux;   
   }//Registro
   
   public static float media(int suma, int cantidad){
      float media;
      media =  (float)suma/(float)cantidad;
      return media;   
   }//media
   
   public static float varianza(float x, float media){
      float varianza = (float)Math.pow(((float)x - media),2);
      return varianza;    
   }//varianza
   
   public static float variacion(float varianza){
      varianza = (float)Math.sqrt(varianza);
   return varianza;
   }//Variacion
}//Class

