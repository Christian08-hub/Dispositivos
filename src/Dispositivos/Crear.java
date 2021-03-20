package Dispositivos;
import java.util.Scanner;

public class Crear {
    static String crear;
    public static void crear() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 

        while (!salir) {
            System.out.println("");
            System.out.println("----------Crear Dispositivo----------\n\n"
                    + "1: Computadora portátil\n"
                    + "2: Tablet\n"
                    + "3: SmartWatch\n"
                    + "4: SmartPhone\n"
                    + "5: Auriculares inalámbricos\n"
                    + "6: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione el tipo de dispositivo a crear: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    dispositivos.ingreso();
                    break;
                case 2:
                     dispositivos.ingreso();
                    break;
                case 3:
                    dispositivos.ingreso();
                    break;
                case 4:
                    dispositivos.ingreso();
                    
                    break;
                case 5:
                    dispositivos.ingreso();
                    dispositivos.encendido();
                    break;
                 case 6:
                     Principal.menu();
                    break;      
                    
                default:
                    System.out.println("Solo opciones del 1 al 6");
            }

        }
    }

}
