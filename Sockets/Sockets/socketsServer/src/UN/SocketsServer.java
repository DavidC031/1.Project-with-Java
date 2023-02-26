package UN;

import java.net.*;// paquete de Java que Contiene clases para soportar aplicaciones que acceden a redes TCP/IP. Permite el uso de las clases Socket, ServerSocket
import java.io.*;//Contiene clases para manejar la entrada/salida. Permite el uso de las clases DataOutputStream, BufferedReader

public class SocketsServer {

    public void createServer() {

        InetAddress ipAddress = null; //Esta clase proporciona objetos que se pueden utilizar para manipular tanto direcciones IP como nombres de dominio.
        int portNumber = 3000;//Puerto para la conexión
        int backlog = 0;//longitud máxima solicitada de la cola de conexiones entrantes
        String mensaje;

        try {
            ipAddress = InetAddress.getByName("localhost");//El método getByName() devuelve objeto InetAdress a partir del nombre
        } catch (UnknownHostException u) {
            System.out.println("No se puede obtener la dirección IP");
        }

        try {
            ServerSocket servidor = new ServerSocket(portNumber, backlog, ipAddress);// Se crea un servidor con los parametros especificados para enlazar
            System.out.println("Inicia el servidor: " + servidor);//Muestra conexión del servidor

            Socket cliente = servidor.accept();//Servidor acepta conexión del cliente
            System.out.println("Se conecta el cliente: " + cliente);//muestra datos de conexión del cliente

            DataInputStream in = new DataInputStream(cliente.getInputStream());//Se instancia Entrada de mensaje 
            do {
                mensaje = in.readUTF();//Se lee en el servidor usando su flujo de datos (servidor escucha mensaje enviado por el cliente)
                System.out.println("El cliente dijo:");
                System.out.println(mensaje);//Se muestra mensaje
            } while (!mensaje.equals("fin"));
            cliente.close();//Fin de la conexión cliente
            servidor.close();//Fin de la conexión servidor

            System.out.println("Fin del servidor");

        } catch (IOException e) {
            System.out.println("ERROR: " + e.toString());
        }
    }

    public static void main(String[] args) {
        new SocketsServer().createServer();
    }

}
