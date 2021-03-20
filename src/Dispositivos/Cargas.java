package Dispositivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cargas {

    public static String auxiliar;
    public static String lectura;
    public static String guardar;
    static String menucargas;

    public String leer() {

        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();

        j.showOpenDialog(j);

        try {
            String path = j.getSelectedFile().getAbsolutePath();

            lectura = " ";

            f = new File(path);

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                while ((auxiliar = br.readLine()) != null) {
                    lectura = lectura + auxiliar + "\n";

                }
            } catch (IOException e) {
            }

            guardar = lectura;
            return lectura;

        } catch (NullPointerException e) {

            javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar, Saliendo..");
            System.exit(0);
        }
        return null;

    }

    public static void menucargas() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("------------Cargas Masivas-------------");
            System.out.println("");
            System.out.println("Seleccione el tipo de carga a realizar: ");
            System.out.println(
                      "1: Cargar dispositivos\n"
                    + "2: Administrar dispositivos\n"
                    + "3: Cargar acciones con dispositivos\n"
                    + "4: Cargar acciones externas de dispositivos\n"
                    + "5: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la acción a realizar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                     dispositivos.subir();
                    break;
                case 2:
                     dispositivos.subir();
                    break;
                case 3:
                     dispositivos.subir();
                    break;
                case 4:
                     dispositivos.subir();
                    break;
                case 5:
                   Principal.menu(); 
                    break;
                  default:
                    System.out.println("Solo opciones del 1 al 5");
            }

        }

    }

}
