package Dispositivos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Acciones_externas {

    public static int llamada;
    public static String nombre;
    public static String mensajetexto;
    public static String mensajered, nombrered;
    public static String textomensaje, aplicacion, nombreenvio;
    public static String textovideo,aplicavideo, nombrevideo;
    public static String notificacion;   
    public static String correo;
    public static String fecha, hora, evento;
    static String externas;
    
    public static void externas() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("----------Acciones Externas de Dispositivos----------\n"
                    + "1: Llamada telefónica\n"
                    + "2: Mensaje\n"
                    + "3: Notificación\n"
                    + "4: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la acción a realizar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Acciones_externas.llamada();
                    break;
                case 2:
                    Acciones_externas.mensaje();
                    break;
                case 3:
                    Acciones_externas.notificacion();
                    break;
                case 4:
                    Principal.menu();
                    break;

                default:
                    System.out.println("Solo opciones del 1 al 4");
            }
        }
    }

    public static void llamada() {
        llamada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Numero a llamar"));
        JOptionPane.showMessageDialog(null, "Llamando a..." + llamada);
        externas();
    }

    public static void mensaje() {
        nombre = JOptionPane.showInputDialog("Escriba el nombre del dispositivo al cual enviar el mensaje: ");
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println(
                      "1: Mensaje de texto\n"
                    + "2: Mensaje de red social\n"
                    + "3: Mensajeria instantánea\n"
                    + "4: Mensaje de videoconferencia\n"
                    + "5: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la acción a realizar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                  mensajetexto();
                    break;
                case 2:
                  mensajered();
                    break;
                case 3:
                  mensajería();
                    break;
                case 4:
                  videoconferencia();
                    break;
                case 5:
                    Acciones_externas.externas();
                    break;
                default:
                    System.out.println("Solo opciones del 1 al 5");
            }
        }

    }

    
    
   //opciones de mensajes
    public static void mensajetexto(){
    mensajetexto = JOptionPane.showInputDialog("Ingrese el mensaje de texto que desea enviar: ");
    JOptionPane.showMessageDialog(null, "El mensaje fue enviado a: " + nombre);
    externas();
    }

    public static void mensajered(){
    mensajered = JOptionPane.showInputDialog("Ingrese el mensaje de red social que desea enviar: ");    
    nombrered = JOptionPane.showInputDialog("Ingrese el nombre de la red social a donde desea enviar: ");     
    JOptionPane.showMessageDialog(null, "El mensaje enviado fue: " + mensajered);
    JOptionPane.showMessageDialog(null, "Se recibió el mensaje en: " + nombrered);
    externas();
    }
    
    public static void mensajería(){
    textomensaje = JOptionPane.showInputDialog("Ingrese  el texto que desea enviar: ");    
    aplicacion = JOptionPane.showInputDialog("Ingrese el nombre de la aplicacion de mensajeria: ");
    nombreenvio = JOptionPane.showInputDialog("Ingrese el nombre a quien envía el mensaje: ");  
    JOptionPane.showMessageDialog(null, "El mensaje fue enviado a: " + nombreenvio);
    JOptionPane.showMessageDialog(null, "El mensaje enviado fue: " + textomensaje);    
    externas();
    }
    
    
    public static void videoconferencia(){
    textovideo = JOptionPane.showInputDialog("Ingrese  el texto que desea enviar: ");    
    aplicavideo = JOptionPane.showInputDialog("Ingrese el nombre de la aplicacion de videoconferencia: ");   
    nombrevideo = JOptionPane.showInputDialog("Ingrese el nombre a quien envía el mensaje: ");  
    JOptionPane.showMessageDialog(null, "El mensaje fue enviado a través de la aplicacion: " + aplicavideo);
    JOptionPane.showMessageDialog(null, "El fue enviado a: " + nombrevideo); 
    externas();
    }
    
    
    
    
    
    public static void notificacion(){
     notificacion = JOptionPane.showInputDialog("Escriba el nombre del dispositivo al cual enviar la notificacion: ");
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println(
                      "1: Correo electrónico\n"
                    + "2: Evento de calendario\n"
                    + "3: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la acción a realizar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    correoElectronico();
                    break;
                case 2:
                    evento();
                    break;
                case 3:
                    Acciones_externas.externas();
                    break;
                default:
                    System.out.println("Solo opciones del 1 al 3");
            }
        }
    }
   
    public static void correoElectronico(){
        correo = JOptionPane.showInputDialog("Escriba el asunto del correo electrónico: ");
        JOptionPane.showMessageDialog(null, "Notificación exitosa!"); 
        externas();
    }
    
    public static void evento(){
        fecha = JOptionPane.showInputDialog("Escriba la fecha del evento: (0/0/0)");
        hora = JOptionPane.showInputDialog("Escriba la fecha del evento: (0:0:0)");
        evento = JOptionPane.showInputDialog("Escriba el nombre del evento: ");  
        JOptionPane.showMessageDialog(null, "Notificacion exitosa!"); 
        externas();
    }
    
}
