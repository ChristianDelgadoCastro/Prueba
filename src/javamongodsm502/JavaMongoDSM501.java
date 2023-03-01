
package javamongodsm501;

/**
 *
 * @author Christian Delgado
 */
public class JavaMongoDSM501 {

    
    public static void main(String[] args) {
            System.out.println("PRIMERO NOS MUESTRA SI LA CONECCION FUE CORRECTA");
        Conexion conec = new Conexion();
            System.out.println("AQUI SE MUESTRAN LOS DATOS ACTUALEZ");
        conec.mostrar();
            System.out.println("AQUI SE INSERTA UN NUEVO DATO");
        conec.insertar("Flor");
            System.out.println("Otra vez el mostrar");
        conec.mostrar();
            System.out.println("AQUI SE ACTUALIZA UN DATO");
        conec.actualizar("Flor", "Scarlet");
            System.out.println("Otra vez el mostrar");
        conec.mostrar();
            System.out.println("AQUI SE VA A ELIMINAR UN DATO");
        conec.eliminar("Scarlet");
            System.out.println("Otra vez el mostrar");
        conec.mostrar();
        
        
        
    }
    
}
