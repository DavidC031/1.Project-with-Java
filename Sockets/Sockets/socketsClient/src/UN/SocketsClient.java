
package UN;

import java.net.*; // paquete de Java que Contiene clases para soportar aplicaciones que acceden a redes TCP/IP. Permite el uso de las clases Socket, ServerSocket
import java.io.*; //Contiene clases para manejar la entrada/salida. Permite el uso de las clases DataOutputStream, BufferedReader

public class SocketsClient {
    
   public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//Instanciando clase BufferReader para la entrada del mensaje
 
         Socket cliente;//Establece un camino virtual entre servidor y cliente. Socket para el cliente

         String mensaje="";

         try {
             
            cliente = new Socket("127.0.0.1",3000);//Socket para el cliente en localhost en puerto 3000
            
            System.out.println("Cliente conectado..."+cliente);//Muestra conexión del cliente
            
            DataOutputStream out = new DataOutputStream(cliente.getOutputStream());// Instanciando salida de mensaje

            do {
               System.out.println("Escribe un mensaje, o fin para terminar: ");
               mensaje = in.readLine();
               out.writeUTF(mensaje);//Se escribe en el servidor usando su flujo de datos (cliente habla)
            } while (!mensaje.equals("fin"));
            cliente.close();//Fin de la conexión cliente
            System.out.println("Fin del cliente");
                    
         }catch (IOException e) {
             System.out.println("ERROR: "+e.toString());
         }
    }
    
}
