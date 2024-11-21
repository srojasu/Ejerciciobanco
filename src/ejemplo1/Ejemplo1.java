
package ejemplo1;

/**
 *
 * @author Néstor Bolívar
    
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente uno = new Cliente("Nestor", 1123879);
        Cliente dos = new Cliente("Pablo", 1092851);
        
        Cuenta cuenta1 = new Cuenta(uno.nombre, 1000, uno.getCedula());
        Cuenta cuenta2 = new Cuenta(dos.nombre, 1000, dos.getCedula());
        
        double x = cuenta1.getSaldo();
        System.out.println("Saldo actual: " + x);
        
        cuenta1.retirar(500000);
        double y = cuenta1.getSaldo();
        System.out.println("Retiro realizado con exito. Saldo actual: " + y);
        
        cuenta1.consignacion(3000000);
        double v = cuenta1.getSaldo();
        System.out.println("Consignacion realizada con exito. Saldo actual: "+ v);
        
        
        
        
        

      
        
    }
 

}
