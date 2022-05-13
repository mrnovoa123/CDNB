package Doc_Refact_deposito;

/**
 * La clase Pricipal, por donde empieza la ejecución del proyecto
 **/

public class Main {
     /**
     * Javadoc the Main
     */
    /**
    Comentarios Javadoc en clase CCuenta
    
    Nivel Clase -> etiquetas:
    @autor
    @version
    @since
    
    Nivel Método -> etiquetas:
    @param
    @return
    @throws
    */

    public static void main(String[] args) {
        operativa_cuenta(1000);
    }

    
    public static void operativa_cuenta(float cantidad) {
        //CCuenta cuenta1;
        CCuenta cuenta1;
        
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
