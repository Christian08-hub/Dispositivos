package Dispositivos;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class dispositivos {

    public String correo;
    public String nombre;
    public String visible;
    public int numero;
    public String subir = Cargas.guardar;

    //creacion de correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //creacion de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //creacion de visibilidad de dispositivo
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSubir() {
        return subir;
    }

    public void setSubir(String subir) {
        this.subir = subir;
    }

    
    
    static Registro_dispositivos objRegistro = new Registro_dispositivos(10);

    public static void ingreso() {
        String nombre;
        String correo;
        String visible;
        boolean retornotexto;
        int retorno;
        int numero = 0;

        //Ingreso de correo de dispositivo    
        do {
            correo = JOptionPane.showInputDialog("Ingrese El Correo del Dispositivo: ");
            if (correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                retornotexto = true;

            } else {
                JOptionPane.showMessageDialog(null, "Correo no Válido, Terminar en @gmail.com");
                retornotexto = false;
            }
        } while (!retornotexto);

        //Ingresar de nombre de dispositivo
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Dispositivo: ");
            if (nombre.matches("[A-za-z ]*$")) {
                retornotexto = true;

            } else {

                JOptionPane.showMessageDialog(null, "Nombre no Válido");
                retornotexto = false;
            }
        } while ((!retornotexto) || (nombre.equals("")));

        //Ingresar visibilidad
        do {
            visible = JOptionPane.showInputDialog("El Dispositivo Será Visible: (si/no) ");
            if (visible.matches("[A-za-z ]*$")) {
                retornotexto = true;

            } else {

                JOptionPane.showMessageDialog(null, "Su respuesta no es válida");
                retornotexto = false;
            }
        } while ((!retornotexto) || (visible.equals("")));

        JOptionPane.showMessageDialog(null, "Encendido Por Defecto");

        //Ingreso del numero 
        do {
            try {
                retorno = 0;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Número Del Dispositivo: " + "(Si El Dispositivo No Tiene Numero, Agregue 0)"));

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Número No Válido");
                retorno = 1;
            }
        } while (retorno != 0);

        objRegistro.crear_dispositivo(nombre, correo, visible, numero);

        System.out.println("");
        System.out.println("");
        System.out.println("------------Dispositivos Creados-------------");
        System.out.println(objRegistro.listar_dispositivos());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------Dispositivos Cargados-------------");
        System.out.println(objRegistro.listar_cargados());
        System.out.println("");
        System.out.println("");
    }

    //modificar dispositivo
    public static void modificar_dispositivito() {
        boolean retornotexto;
        int retorno;
        int numero = 0;
        int opmodi = 0;
        String parc;
        String desv;
        String dec;
        String apa;
        Scanner br = new Scanner(System.in);

        opmodi = Integer.parseInt(JOptionPane.showInputDialog(
                "------------Administración de Dispositivos-------------\n\n"
                + "1: Editar correo electrónico\n"
                + "2: Editar nombre del dispositivo\n"
                + "3: Apagar visibilidad del dispositivo\n"
                + "4: Apagar dispositivo\n\n"
                + "Seleccione la propiedad a editar: "));

        switch (opmodi) {
            case 1:
                do {
                    parc = JOptionPane.showInputDialog("Ingrese El Nuevo Correo del Dispositivo: ");
                    if (parc.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
                        retornotexto = true;

                    } else {
                        JOptionPane.showMessageDialog(null, "Correo no Válido, Terminar en @gmail.com");
                        retornotexto = false;
                    }
                } while (!retornotexto);
              
                objRegistro.modificar_dispositivo(parc);
                System.out.println("");
                System.out.println("------------Listado de Dispositivos-------------");
                System.out.println(objRegistro.listar_dispositivos());
                System.out.println("");
                
                Principal.menu();
                break;

            case 2:
                do {
                    desv = JOptionPane.showInputDialog("Ingrese el Nuevo Nombre del Dispositivo: ");
                    if (desv.matches("[A-za-z ]*$")) {
                        retornotexto = true;

                    } else {

                        JOptionPane.showMessageDialog(null, "Nombre no Válido");
                        retornotexto = false;
                    }
                } while ((!retornotexto) || (desv.equals("")));
            
                objRegistro.modificar_dispositivo1(desv);
                System.out.println("");
                System.out.println("------------Listado de Dispositivos-------------");
                System.out.println(objRegistro.listar_dispositivos());
                System.out.println("");
                Principal.menu();
                break;

            case 3:
                do {
                    dec = JOptionPane.showInputDialog("El Dispositivo Será Visible: (si/no) ");
                    if (dec.matches("[A-za-z ]*$")) {
                        retornotexto = true;

                    } else {

                        JOptionPane.showMessageDialog(null, "Su respuesta no es válida");
                        retornotexto = false;
                    }
                } while ((!retornotexto) || (dec.equals("")));

            
                objRegistro.modificar_dispositivo2(dec);
                System.out.println("");
                System.out.println("------------Listado de Dispositivos-------------");
                System.out.println(objRegistro.listar_dispositivos());
                System.out.println("");
           
                break;

            case 4:
                apa = JOptionPane.showInputDialog("Apagar dispositivo: (si/no) ");
                System.out.println("");
                System.out.println("------------Listado de Dispositivos-------------");
                System.out.println(objRegistro.listar_dispositivos());
                System.out.println("");
                
                Principal.menu();
                break;

            case 5:
                System.exit(0);
                break;
        }

    }

    public static void encendido() {
        System.out.println("");
        System.out.println("------------Dispositivos Encendidos-------------");
        System.out.println(objRegistro.listar_dispositivos());
        System.out.println("");

    }

    
    
        public static void subir (){
        JOptionPane.showMessageDialog(null, "Seleccione el Archivo CVS a cargar");
        Cargas leer =new Cargas();
        System.out.println("");
        System.out.println("------------Listado Cargados-------------");
        System.out.println("");
        System.out.println(leer.leer());
        System.out.println("");
        JOptionPane.showMessageDialog(null, "Carga Exitosa!");
        objRegistro.subir_pro(Cargas.guardar);
    }
}
