
package ejemplo1;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta
public class Cuenta {
    
    private String Titular;
    private double Saldo;
    private int id;
    
    public Cuenta(String Titular, double Saldo, int id){
        
    }

    Cuenta(Cliente uno) {
        Titular = uno.nombre;
        Saldo = 100000;
        id = uno.getCedula();
    }
    


    boolean consignacion(double x){
        boolean peticion = true;
        if(peticion == true){
                Saldo = Saldo + x;
                return true;
        }else{
            return false;
        }  
    }

    
    boolean retirar(double x){
        boolean aprovar = true;
        if(aprovar == true){
            Saldo = Saldo - (x - 2600);
            return true;
        }else{
            return false;
            
        }
    }
    
    
    boolean transferir(double x){
        boolean aprovar = true;
        if(aprovar == true){
            Saldo = Saldo - (x - 7800);
            return true;
        }else{
            return false;
            
        }
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getTitular() {
        return Titular;
    }
    
    
}
