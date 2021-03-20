package Dispositivos;

import static Dispositivos.dispositivos.objRegistro;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Acciones {

    public static String foto;
    public static String texto;
    public static String documento;
    public static String acep;
    public static int compartir;
    public static String music;
    public static String cancion;
    public static int mus;
    static String acciones;
    
    public static void acciones() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("----------Acciones con Dispositivos----------\n"
                    + "1: Computadora portátil\n"
                    + "2: Tablet\n"
                    + "3: SmartWatch\n"
                    + "4: SmartPhone\n"
                    + "5: Auriculares inalámbricos\n"
                    + "6: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione el tipo de dispositivo: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Acciones.listar();
                    break;
                case 2:
                    Acciones.listar();
                    break;
                case 3:
                    Acciones.listar();
                    break;
                case 4:
                    Acciones.listar();
                    break;
                case 5:
                    Acciones.acciones();
                    break;
                case 6:
                    Principal.menu();
                    break;

                default:
                    System.out.println("Solo opciones del 1 al 6");
            }

        }
    }

    public static void listar() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("----------Acciones con Dispositivos-----------");
            System.out.println("------------Tipos de dispositivos-------------");
            System.out.println(objRegistro.listar_nombre());
            System.out.println("");
            System.out.println("Seleccione el tipo de acción a realizar: ");
            System.out.println(
                    "1: Tomar fotografía\n"
                    + "2: Copiar texto\n"
                    + "3: Pegar texto\n"
                    + "4: Compartir documentos\n"
                    + "5: Reproducir música\n"
                    + "6: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la acción a realizar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Acciones.tomafoto();
                    break;
                case 2:
                    Acciones.copiar();
                    break;
                case 3:
                    Acciones.pegar();
                    break;
                case 4:
                    Acciones.compartir();
                    break;
                case 5:
                    Acciones.musica();
                    break;
                case 6:
                    Principal.menu();
                    break;

                default:
                    System.out.println("Solo opciones del 1 al 6");
            }

        }

    }

    public static void tomafoto() {
        JOptionPane.showMessageDialog(null, "Fotografía tomada!");
        foto = JOptionPane.showInputDialog("Ingrese un nombre para la fotografía: ");
        listar();
    }

    public static void copiar() {
        texto = JOptionPane.showInputDialog("Ingrese un texto a copiar: ");
        listar();

    }

    public static void pegar() {
      JOptionPane.showMessageDialog(null, "El texto copiado fue: "+texto);
        listar();
    }

    public static void compartir() {
        Scanner entrada = new Scanner(System.in);
        documento = JOptionPane.showInputDialog("Ingrese el nombre del documento a compartir: ");
        System.out.println("");
        System.out.println("------------Dispositivos Visibles-------------");
        System.out.println(objRegistro.listar_dispositivos());
        System.out.println("");
        System.out.print("Seleccione el dispositivo al cual desea compartir: ");
        compartir = entrada.nextInt();

        if (compartir > 0) {
            acep = JOptionPane.showInputDialog("Desea aceptar el documento: (si/no)");
            if ("si".equals(acep)) {
                JOptionPane.showMessageDialog(null, "Documento compartido con éxito!");
                listar();
                if ("no".equals(acep)) {
                JOptionPane.showMessageDialog(null, "Documento no compartido!");
                listar();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dispositivo no encontrado!");
            compartir();
        }

    }
    
    
    public static void musica(){
    Scanner ent = new Scanner(System.in);    
        System.out.println("");
        System.out.println("------------Dispositivos Visibles-------------");
        System.out.println(objRegistro.listar_dispositivos());
        System.out.println("");
        System.out.print("Seleccione el dispositivo en el cual desea reproducir musica: ");
        mus= ent.nextInt();   
        
         if (mus > 0) {
            music = JOptionPane.showInputDialog("Desea que la musica se reproduzca en los auriculares: (si/no)");
          if ("si".equals(music)) {
            cancion = JOptionPane.showInputDialog("Ingrese el nombre de la cancion a reproducir: ");
            JOptionPane.showMessageDialog(null, "Reproduciendo..."+cancion);
            listar();   
            if ("no".equals(music)) {
                JOptionPane.showMessageDialog(null, "Musica no reproducida!");
                listar();
                }
        } }else {
            JOptionPane.showMessageDialog(null, "Dispositivo no encontrado!");
            compartir();
        }

    }

}
