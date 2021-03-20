package Dispositivos;


public class Registro_dispositivos {

    private final dispositivos objdispositivos[];
    private final dispositivos objsubir[];
    private int contador;
    private int contador2; 

    public Registro_dispositivos(int n) {
        objdispositivos = new dispositivos[n];
        objsubir = new dispositivos[n];
        contador = 0;
        contador2 = 0;

    }

    public void crear_dispositivo(String correo, String nombre, String visible, int numero) {
        int au = 0;

        if (au == 0) {
            if (contador < objdispositivos.length) {
                objdispositivos[contador] = new dispositivos();
                objdispositivos[contador].setCorreo(correo);
                objdispositivos[contador].setNombre(nombre);
                objdispositivos[contador].setVisible(visible);
                objdispositivos[contador].setNumero(numero);
                contador++;

            }

        }
    }

    
    
    public void subir_pro( String subir ){
    int au=0;
        for (int i = 0; i < contador2; i++) {
            
        }
        if (au==0) {
            if (contador2<objsubir.length) {
                objsubir[contador2]=new dispositivos();
                objsubir[contador2].setSubir(Cargas.guardar);
                contador2++;
            }
        }
    }  
    
    
    
    
    public String listar_cargados(){
        String listarcargados1="\nLista de Dispositivos Cargados:\n\n";
        for (int i = 0; i < contador2; i++) {
            listarcargados1+=(i+1)+".-"+"\t"+objsubir[i].getSubir();
        }
        return listarcargados1;
    }
   
    
    
    
    
  
    public String listar_dispositivos() {
        String listadispositivos = "\nLista de Dispositivos:\n\n";
        for (int i = 0; i < contador; i++) {
            listadispositivos += (i + 1) + ".-" + "\t" + "Correo electrónico: " + objdispositivos[i].getNombre() + "\t" + "Nombre del dispositivo: "
                    + objdispositivos[i].getCorreo() + "\t" + "Visibilidad para conexión: " + objdispositivos[i].getVisible() + "\t\t" + "Numero telefónico: "
                    + objdispositivos[i].getNumero() + "\n";
        }
        return listadispositivos;
    }

    
      public String listar_nombre() {
        String listadispositivos = "";
        for (int i = 0; i < contador; i++) {
            listadispositivos += "\n" + "Tipo de Dispositivo: " + objdispositivos[i].getCorreo()+ "\n" + "Nombre del dispositivo: "
                    + objdispositivos[i].getCorreo();
        }
        return listadispositivos;
    }  
    
    
    
    
    
    
    //modificar dispositivos
    public void modificar_dispositivo(String nombre) {
        int modi = 0;

        objdispositivos[modi].setNombre(nombre);

    }

    public void modificar_dispositivo1(String correo) {
        int modi = 0;
        objdispositivos[modi].setCorreo(correo);

    }

    public void modificar_dispositivo2(String visible) {
        int modi = 0;
        objdispositivos[modi].setVisible(visible);

    }

}
