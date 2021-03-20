package Dispositivos;
import java.util.Scanner;
public class Principal {

    public static void menu (){
    Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("");
            System.out.println("----------Ecosistema de Dispositivos----------\n\n"
                    + "1: Crear dispositivo\n"
                    + "2: Administrar dispositivo\n"
                    + "3: Acciones con dispositivo\n"
                    + "4: Acciones externas de dispositivos\n"
                    + "5: Cargas Masivas\n"
                    + "6: logs\n"
                    + "7: Salir\n");
            System.out.println("----------------------------------------------");
            System.out.print("Seleccione la opción a ejecutar: ");
            opcion = sn.nextInt();


            switch (opcion) {
                case 1:
                    Crear.crear();
                    break;
                case 2:
                    administrar.adminis();
                    break;
                case 3:
                   Acciones.acciones();
                    break;
                case 4:
                    Acciones_externas.externas();
                    break;

                case 5:
                    Cargas.menucargas();
                    break;

                case 6:
                    Log_Principal.PrincipalLog();
                 
                    break;

                case 7:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Solo opciones del 1 al 7");
            }

        }
    }
    public static void main(String[] args) {
       Principal.menu();

        
    }
}
