
package Dispositivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Log_Principal {
    public static String linea2;
     public static void PrincipalLog() {

        
        try {
            //este archivo no contiene nada
            Log myLog = new Log("log.html");
            
            System.out.println("");
            System.out.println("-------------------Archivo de Logs--------------------");
            System.out.println("");
            myLog.addLine(Crear.crear+" Creacion de dispositivo");
            myLog.addLine(administrar.adminis+" Administrarcion de dispositivo");
            myLog.addLine(Acciones.acciones+" Acciones con dispositivos");
            myLog.addLine(Acciones_externas.externas+" Acciones externas de dispositivos");
            myLog.addLine(Cargas.menucargas+" Cargas masivas"); 
             JOptionPane.showMessageDialog(null, "LOG HTML CREADO! se encuentra dentro de la carpeta del proyecto");
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
        
     
}
