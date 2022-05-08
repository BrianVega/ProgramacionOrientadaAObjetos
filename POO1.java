import java.util.Scanner;
public class POO1{
   public static void main(String args[]){
   Scanner leer = new Scanner(System.in);

   int opc=0, pA=0, pB=0, pC=0, cA=0, cB=0, cC=0, total;
   do{//principal             
   opc = menu(opc);
   
   if(opc==1)
      opcion1(pA, pB, pC);
      
   if(opc==2)
      opcion2(cA, cB, cC);
      
   if(opc==3)
      pA = pA * cA;
      pB = pB * cB;
      pC = pC * cC;
      total = pA + pB + pC;
      
      System.out.print("El ingreso total obtenido es de: $" + total);
      System.out.print("\n");
   }while(opc != 4);
 
   
   } //main

   static int menu(int opc){
   Scanner leer = new Scanner(System.in);
   
   System.out.println("Seleccione una opcion");
   System.out.println("---------------------------");
   System.out.println("1) Capturar precio de las casas");
   System.out.println("2) Calcular venta por cada tipo de casa");
   System.out.println("3) Calcular venta total de todas las casas");
   System.out.println("4) Salir\n");
   opc = leer.nextInt();
   return opc;
   }//fin menu
   
   static void opcion1(int pA, int pB, int pC){
   Scanner leer = new Scanner(System.in);
   char aux = 'n';
   
   System.out.println("Seleccione el tipo de casa de la cual desea registrar el precio");
   System.out.println("a) Casa con 2 recamaras");
   System.out.println("b) Casa con 3 recamaras");
   System.out.println("c) Casa de lujo");
   aux = leer.next().charAt(0);
      if (aux == 'a' || aux == 'A'){
         System.out.print("Ingrese el precio de la casa: $");
         pA = leer.nextInt();
      }
      else
         if (aux == 'b' || aux == 'B'){
         System.out.print("Ingrese el precio de la casa: $");
         pB = leer.nextInt();
         }
         else
            if (aux == 'c' || aux == 'C'){
               System.out.print("Ingrese el precio de la casa: $");
               pC = leer.nextInt();
            }
      
   }//fin opcion1
   
   static void opcion2(int cA, int cB, int cC){
   Scanner leer = new Scanner(System.in);
   
   
      System.out.println("Ingrese la cantidad de casas vendidas de cada tipo\n");
      System.out.print("Casas con 2 recamaras: ");
      cA = leer.nextInt();
      System.out.print("\nCasas con 3 recamaras: ");
      cB =  leer.nextInt();
      System.out.print("\nCasas de lujo: ");
      System.out.print("\n");
      cC = leer.nextInt();
      
   }//fin opcion 2
   
   
   }//class