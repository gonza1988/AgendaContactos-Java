
package ventanas;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
    private File archivo;
    
    
    public void crearArchivo() {
        archivo = new File("agendaContactos.txt");
        
        try {
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado");
            }
        } catch (IOException ex) {
            System.err.println("Error, "+ ex);
        }
    }
}
