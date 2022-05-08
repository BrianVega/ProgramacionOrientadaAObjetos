import java.util.*;
public class POO18PrincipalEvaluacion{
   
   static Scanner leer = new Scanner(System.in);
   static  int contClientes = -1, contAutos = -1;
   static POO18ClientesEvaluacion objClientes[] = new POO18ClientesEvaluacion[10]; 
   static POO18AutosEvaluacion objAutos[] = new POO18AutosEvaluacion[10];
 
   
   
   public static void main(String Args[]){
   
   String busqueda;
   int varCont = 0, auxBusquedaCliente, auxBusquedaAuto, respCase3, auxModificar;
   int opc=0, opcionConsulta, opcionTipoCliente;

   /*String nombre, direccion, ayuntamiento;
   int telefono;*/
   
   
   do{
      System.out.println("\nTaller Rayo McQueen");
      System.out.println("~~ M E N U ~~");
      System.out.println("[1] Dar de Alta Cliente o Vehículo");
      System.out.println("[2] Buscar Cliente o Vehículo");// Encontrar y mostrar los datos
      System.out.println("[3] Eliminar un Cliente o Vehículo");// Del arreglo
      System.out.println("[4] Modificar los datos del Cliente o Vehículo.");
      System.out.println("[5] Salir");
      System.out.print("Opcion: ");
         opc = leer.nextInt();
      switch (opc){
            case 1:
               opcionConsulta = consulta();//Consulta Cliente o auto
               if(opcionConsulta == 1){//Alta de cliente
                  contClientes++;
                  opcionTipoCliente = tipoCliente();//Consultar tipo de cliente, particular o Ayuntamiento
                  altaClientes(opcionTipoCliente);
               }//Alta de cliente
               else
                  if(opcionConsulta == 2){//alta de Auto
                     contAutos++;
                     altaAutos();
                  }//if - Alta de auto
            break;

            
            case 2:
               opcionConsulta = consulta();//Consulta Cliente o auto
               if(opcionConsulta == 1){
                  System.out.print("\n~~~ B U S Q U E D A ~~~");
                  System.out.print("\nIngrese el nombre del cliente: ");
                     busqueda = leer.nextLine();
                  auxBusquedaCliente = comprobacionCliente(busqueda);
                  if(auxBusquedaCliente != -1)
                     mostrarCliente(auxBusquedaCliente);
                  //auxBusquedaCliente encontrado
               }//if consulta = 1 
               else{
                  System.out.print("\n~~~ B U S Q U E D A ~~~");
                  System.out.print("\nIngrese el modelo del automovil: ");
                     busqueda = leer.nextLine();
                  auxBusquedaAuto = comprobacionAuto(busqueda);
                  if(auxBusquedaAuto != -1)
                     mostrarAuto(auxBusquedaAuto);
                  //auxBusquedaAuto encontrado
               }//else consulta = 2
            break;
            case 3:
               opcionConsulta = consulta();//Consulta Cliente o auto
               if(opcionConsulta == 1){
                  System.out.print("\n~~~ E L I M I N A C I O N ~~~");
                  System.out.print("\nIngrese el nombre del cliente que desea eliminar: ");
                     busqueda = leer.nextLine();
                  auxBusquedaCliente = comprobacionCliente(busqueda);
                  if(auxBusquedaCliente == -1)
                     System.out.println("No se ha encontrado registro del cliente");
                  //auxBusquedaCliente NO encontrado
                  else{
                     mostrarCliente(auxBusquedaCliente);
                     do{
                     System.out.println("¿Esta seguro de que desea eliminar PERMANENTEMENTE el registro del Cliente?");
                     System.out.println("[1] Si");
                     System.out.println("[2] No");
                     System.out.print("Opcion: ");
                        respCase3 = leer.nextInt();
                     leer.nextLine();
                     }while(respCase3 != 1 && respCase3 != 2);

                     if(respCase3 == 1)
                        eliminarRegistroCliente(auxBusquedaCliente);
                  }//Eliminar registro
                  //auxBusquedaCliente encontrado
               }//if consulta = 1 
               else{
                  System.out.print("\n~~~ E L I M I N A C I O N ~~~");
                  System.out.print("\nIngrese el modelo del automovil que desea eliminar: ");
                     busqueda = leer.nextLine();
                  auxBusquedaAuto = comprobacionAuto(busqueda);
                  if(auxBusquedaAuto == -1)
                     System.out.println("No se ha encontrado registro del automovil");
                  //auxBusquedaAuto NO encontrado
                  else{
                     mostrarAuto(auxBusquedaAuto);
                     System.out.println("¿Está seguro de que desea eliminar PERMANENTEMENTE el registro del auto?");
                     System.out.println("[1] Si");
                     System.out.println("[2] No");
                     System.out.print("Opcion: ");
                        respCase3 = leer.nextInt();

                     eliminarRegistroAuto(auxBusquedaAuto);  
                  }
                  //auxBusquedaAuto encontrado
               }//else consulta = 2
            
            //System.out.println("Nombre"+ objClientes[0].getNombre()); //Testeo
                     

            break;
            case 4:
               opcionConsulta = consulta();//Consulta Cliente o auto
               if(opcionConsulta == 1){
                  System.out.print("\n~~~ M O D I F I C A C I O N ~~~");
                  System.out.print("\nIngrese el nombre del cliente que desea eliminar: ");
                     busqueda = leer.nextLine();
                  auxBusquedaCliente = comprobacionCliente(busqueda);
                  if(auxBusquedaCliente == -1)
                     System.out.println("No se ha encontrado registro del cliente");
                  //auxBusquedaCliente NO encontrado
                  else{
                     auxModificar = mostrarModificarCliente(auxBusquedaCliente);
                     modificarCliente(auxModificar, auxBusquedaCliente);
                  }//else cliente encontrado
               }//if para Clientes
               else{
                  System.out.print("\n~~~ M O D I F I C A C I O N ~~~");
                  System.out.print("\nIngrese el modelo del automovil que desea eliminar: ");
                     busqueda = leer.nextLine();
                  auxBusquedaAuto = comprobacionAuto(busqueda);
                  if(auxBusquedaAuto == -1)
                     System.out.println("No se ha encontrado registro del automovil");
                     //auxBusquedaAuto NO encontrado
                  else{
                     auxModificar = mostrarModificarAuto(auxBusquedaAuto);
                     modificarAuto(auxModificar, auxBusquedaAuto);
                  }// else auxBusquedaAuto ENCONTRADO
               }//else para Autos
            break;
            
            
      }//Switch
   }while (opc >= 1 && opc <= 4);
   
   
   }//Main
   
   
   public static int consulta(){
     
   int opcionConsulta;
   
   do{
      System.out.println("\nSeleccione la opción con la que desea trabajar:");
      System.out.println("[1] Cliente");
      System.out.println("[2] Vehiculo");
      System.out.print("Opcion: ");
         opcionConsulta = leer.nextInt();
         leer.nextLine();//Limpieza de buffer
   }while(opcionConsulta != 1 && opcionConsulta != 2);

      return opcionConsulta;

   
   }//Consultar Cliente o vehículo
   
   
   public static int tipoCliente(){
   
   int opcionTipoCliente;
   
   do{    
      System.out.println("\nSeleccione el tipo de cliente");
      System.out.println("[1] Particular");
      System.out.println("[2] Ayuntamiento");
      System.out.print("Opcion: ");
         opcionTipoCliente = leer.nextInt();
         leer.nextLine();//Limpieza de buffer
   }while(opcionTipoCliente != 1 && opcionTipoCliente != 2);
   
      return opcionTipoCliente;
   }//tipoCliente


   public static void altaClientes(int opcionTipoCliente){
   
      String nombre = "";
      String direccion = ""; 
      String trabajo = "";
      String telefono = "";
      
      objClientes[contClientes] = new POO18ClientesEvaluacion();
         
         System.out.print("\n~~~ A L T A ~~~");
         System.out.print("\nIngrese su nombre:");
            nombre = leer.nextLine();
         System.out.print("\nIngrese su direccion");
            direccion = leer.nextLine();
         System.out.print("\nIngrese su telefono: ");
            telefono = leer.nextLine();

         if(opcionTipoCliente == 2){
            System.out.print("Ingrese su trabajo del Ayuntamiento: ");
               trabajo = leer.nextLine();
            objClientes[contClientes].POO18ClientesEvaluacion();
            objClientes[contClientes].POO18ClientesEvaluacion(nombre, direccion, telefono, trabajo);
         }//Cliente ayuntamiento
         else
            objClientes[contClientes].POO18ClientesEvaluacion(nombre, direccion, telefono);
            
   }//altaClientes
   
   
   public static void altaAutos(){
   
      String marca = "";
      String modelo = "";
      String falla = "";
      String placas = "";
   
      objAutos[contAutos] = new POO18AutosEvaluacion();
      System.out.print("\n~~~ A L T A ~~~");
      System.out.print("\nIngrese la marca del auto: ");
         marca = leer.nextLine();
      System.out.print("\nIngrese el modelo del auto: ");
         modelo = leer.nextLine();
      System.out.print("\nIngrese la falla del auto: ");
         falla = leer.nextLine();
      System.out.print("\nIngrese las placas del auto: ");
         placas = leer.nextLine();
      objAutos[contAutos].POO18AutosEvaluacion(marca, modelo, falla, placas);
   
   }//altaAutos
   
   
   public static int comprobacionCliente(String busqueda){
      
      int auxBusquedaCliente = -1;
      
      if(contClientes<0)
         System.out.println("Aun no hay registros");
         else{
      for(int x=0; x<objClientes.length; x++){
      if(busqueda.equals(objClientes[x].getNombre().toLowerCase())){
            auxBusquedaCliente = x;
       break;
       }//if busqueda = true
       else{
         System.out.println("\nNo se ha encontrado registro del cliente");
         break;//test      
      }//else usuario no encontrado      
      }//for x
      }//else
      
      //auxBusquedaCliente NO encontrado     
      return auxBusquedaCliente;
   
   }//comprobacionCliente 
   
      
   public static void mostrarCliente(int auxBusquedaCliente){

      System.out.println("Nombre: " + objClientes[auxBusquedaCliente].getNombre());
      System.out.println("Direccion: " + objClientes[auxBusquedaCliente].getDireccion());
      System.out.println("Telefono: " + objClientes[auxBusquedaCliente].getTelefono());
      System.out.println("Trabajo: " + objClientes[auxBusquedaCliente].getTrabajo());   
  
   }//mostrarCliente
   
   public static int comprobacionAuto(String busqueda){
      
      int auxBusquedaAuto = -1;
      
      if(contAutos<0)
         System.out.println("Aun no hay registros");
      
      else{
         for(int x=0; x<objAutos.length; x++){
         if(busqueda.equals(objAutos[x].getModelo().toLowerCase())){
            auxBusquedaAuto = x;
       break;
         }//if busqueda = true
         else{
         System.out.println("\nNo se ha encontrado registro del Automovil");
         break;//test      
      }//else usuario no encontrado 
      }//for x
      }//else 
                 
      return auxBusquedaAuto;
   
   }//comprobacionCliente 
   
   
   public static void mostrarAuto(int auxBusquedaAuto){

      System.out.println("Marca: " + objAutos[auxBusquedaAuto].getMarca());
      System.out.println("Modelo: " + objAutos[auxBusquedaAuto].getModelo());
      System.out.println("Falla: " + objAutos[auxBusquedaAuto].getFalla());
      System.out.println("Placas: " + objAutos[auxBusquedaAuto].getPlacas());   
  
   }//mostrarAuto
   
   
   public static void eliminarRegistroCliente(int auxBusquedaCliente){
   
      String nombre = "-";
      String direccion = "-"; 
      String trabajo = "-";
      String telefono = "-";
      
      objClientes[auxBusquedaCliente].POO18ClientesEvaluacion(nombre, direccion, telefono, trabajo);      
      
   }//eliminarRegistroCliente 
   
   public static void eliminarRegistroAuto(int auxBusquedaAuto){
    
      String marca = "";
      String modelo = "";
      String falla = "";
      String placas = "";
    
      objAutos[auxBusquedaAuto].POO18AutosEvaluacion(marca, modelo, falla, placas);      

   }//eliminarRegistroCliente 

   public static int mostrarModificarCliente(int auxBusquedaCliente){
   
   int auxModificarCliente;  
   do{
      System.out.println("Seleccione la opcion que desea modificar:");
      System.out.println("[1] Nombre: " + objClientes[auxBusquedaCliente].getNombre());
      System.out.println("[2] Direccion: " + objClientes[auxBusquedaCliente].getDireccion());
      System.out.println("[3] Telefono: " + objClientes[auxBusquedaCliente].getTelefono());
      System.out.println("[4] Trabajo: " + objClientes[auxBusquedaCliente].getTrabajo());   
      System.out.print("opcion: ");
      auxModificarCliente = leer.nextInt();
      leer.nextLine();//Limpiando Buffer
   }while(auxModificarCliente < 1 && auxModificarCliente > 4);   
      return auxModificarCliente;
   }//mostrarModificarCliente
   
   
 public static void modificarCliente(int auxModificar, int auxBusquedaCliente){
 
 String nuevoNombre, nuevaDireccion, nuevoTelefono, nuevoTrabajo;
 
 if(auxModificar == 1){
   System.out.print("Ingrese el nuevo nombre: ");
   nuevoNombre = leer.nextLine();
   objClientes[auxBusquedaCliente].setNombre(nuevoNombre);
 }//Modificar nombre
 else
   if(auxModificar == 2){
      System.out.print("Ingrese la nueva direccion: ");
      nuevaDireccion = leer.nextLine();
      objClientes[auxBusquedaCliente].setDireccion(nuevaDireccion);
   }//Modificar direccion
   else
      if(auxModificar == 3){
         System.out.print("Ingrese el nuevo telefono: ");
         nuevoTelefono = leer.nextLine();
         objClientes[auxBusquedaCliente].setTelefono(nuevoTelefono);
      }//Modificar telefono
      else
         if(auxModificar == 4){
            System.out.print("Ingrese el nuevo trabajo: ");
            nuevoTrabajo = leer.nextLine();
            objClientes[auxBusquedaCliente].setTrabajo(nuevoTrabajo);
         }//Modificar trabajo
 }//modificarCliente
 
 public static int mostrarModificarAuto(int auxBusquedaAuto){
    
    int auxModificarAuto;  
    
   do{
      System.out.println("Seleccione la opcion que desea modificar:"); 
      System.out.println("[1] Marca: " + objAutos[auxBusquedaAuto].getMarca());
      System.out.println("[2] Modelo: " + objAutos[auxBusquedaAuto].getModelo());
      System.out.println("[3] Falla: " + objAutos[auxBusquedaAuto].getFalla());
      System.out.println("[4] placas: " + objAutos[auxBusquedaAuto].getPlacas());   
      System.out.print("opcion: ");
      auxModificarAuto = leer.nextInt();
      leer.nextLine();//Limpiando Buffer
   }while(auxModificarAuto < 1 && auxModificarAuto > 4);   
      return auxModificarAuto;
 }//mostrarModificarAuto
   
   
public static void modificarAuto(int auxModificar, int auxBusquedaAuto){

String nuevaMarca, nuevoModelo, nuevaFalla, nuevaPlaca;
 
 if(auxModificar == 1){
   System.out.print("Ingrese la nueva Marca: ");
   nuevaMarca = leer.nextLine();
   objAutos[auxBusquedaAuto].setMarca(nuevaMarca);
 }//Modificar Marca
 else
   if(auxModificar == 2){
      System.out.print("Ingrese el nuevo modelo: ");
      nuevoModelo = leer.nextLine();
      objAutos[auxBusquedaAuto].setModelo(nuevoModelo);
   }//Modificar Modelo
   else
      if(auxModificar == 3){
         System.out.print("Ingrese la nueva falla: ");
         nuevaFalla = leer.nextLine();
         objAutos[auxBusquedaAuto].setFalla(nuevaFalla);
      }//Modificar falla
      else
         if(auxModificar == 4){
            System.out.print("Ingrese las nuevas placas: ");
            nuevaPlaca = leer.nextLine();
            objAutos[auxBusquedaAuto].setPlacas(nuevaPlaca);
         }//Modificar placas

}//modificarAuto
   
}//Class

/* Se genera un error al buscar un registro justo desoués de haber eliminado
dicho registro, esto en el apartado de clientes. tambien, falta crear el 
case 3 para eliminar los registros del automovil.*/