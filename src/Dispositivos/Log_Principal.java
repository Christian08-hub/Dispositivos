
package Dispositivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class Log_Principal {
    public static String linea2;
     public static void PrincipalLog() {

        
        try {
            //este archivo no contiene nada
            Log myLog = new Log("si.txt");
            
            System.out.println("");
            System.out.println("-------------------Archivo de Logs--------------------");
            System.out.println("");
            myLog.addLine(Crear.crear+" Creacion de dispositivo");
            myLog.addLine(administrar.adminis+" Administrarcion de dispositivo");
            myLog.addLine(Acciones.acciones+" Acciones con dispositivos");
            myLog.addLine(Acciones_externas.externas+" Acciones externas de dispositivos");
            myLog.addLine(Cargas.menucargas+" Cargas masivas"); 

            String[] lines = myLog.getLines();
            
            for (String line : lines) {
         
                System.out.println(line);
                linea2 = line;
            }
         //  myLog.resetLog();

            
        } catch (IOException ex) {
            Logger.getLogger(Log_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public static void Crear(){
           try {
               
            //ruta donde se crea el log html
            String ruta = "logs.html";
            String titulo = "---------Archivo de logs---------";
            String  contenido = Log_Principal.linea2 ;
            JOptionPane.showMessageDialog(null, "LOG HTML CREADO! Buscar en la carpeta del programa");

            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido); 
            bw.write(titulo); 
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

     }
     
}
