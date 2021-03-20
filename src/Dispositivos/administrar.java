package Dispositivos;

import static Dispositivos.dispositivos.objRegistro;
import java.util.Scanner;

public class administrar {

    static String adminis;

    public static void adminis() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("----------Administrar Dispositivo----------\n\n"
                    + "1: Computadora portátil\n"
                    + "2: Tablet\n"
                    + "3: SmartWatch\n"
                    + "4: SmartPhone\n"
                    + "5: Auriculares inalámbricos\n"
                    + "6: Volver\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione el tipo de dispositivo a administrar: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------Dispositivos Creados-------------");
                    System.out.println(objRegistro.listar_dispositivos());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    dispositivos.modificar_dispositivito();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------Dispositivos Creados-------------");
                    System.out.println(objRegistro.listar_dispositivos());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    dispositivos.modificar_dispositivito();
                    break;
                case 3:

                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------Dispositivos Creados-------------");
                    System.out.println(objRegistro.listar_dispositivos());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    dispositivos.modificar_dispositivito();
                    break;
                case 4:

                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------Dispositivos Creados-------------");
                    System.out.println(objRegistro.listar_dispositivos());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    dispositivos.modificar_dispositivito();
                    break;
                case 5:

                    System.out.println("");
                    System.out.println("");
                    System.out.println("------------Dispositivos Creados-------------");
                    System.out.println(objRegistro.listar_dispositivos());
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    dispositivos.modificar_dispositivito();
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
