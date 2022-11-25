package clase5adhoc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos implements Serializable {

    public static final long serialVersionUID = 2L;
    
    public String getFrase(){
        return "Holis, fui recuperado";
    }
    
    
    public Datos getDatos(){
        return new Datos();
    }
    
    
    public void escribiendoDatos(){
        try{
            ObjectOutputStream escritura;  
            escritura = new ObjectOutputStream(new FileOutputStream("C:/Users/Diseno/Desktop/archivo.txt"));
            escritura.writeObject(getDatos());
            escritura.close();
        } 
        catch(IOException e){
            System.out.println("Hubo un error en la escritura:");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finalizado el intento de escritura");
        }
    }
        
    public Datos leyendoDatos() throws ClassNotFoundException{
        try{
            ObjectInputStream lectura = new ObjectInputStream(new FileInputStream("C:/Users/Diseno/Desktop/archivo.txt"));
            return (Datos) lectura.readObject();
        }
        catch(IOException e){
            System.out.println("Hubo un error en la lectura:");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            return null;
        }
    }
        
}
