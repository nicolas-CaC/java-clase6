package clase5adhoc;

public class Clase5adhoc {

    public static void main(String[] args) throws ClassNotFoundException {

        Datos datos = new Datos();
//        datos.escribiendoDatos();
        
        Datos obtenidos;
        obtenidos = datos.leyendoDatos();
        System.out.println(obtenidos.getFrase());
        
    }

}
