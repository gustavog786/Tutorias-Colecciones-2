package entidad;


public class Cliente {
    private String nombre;
    private int nCuenta;
    private double saldo;
    
    //constructores

    public Cliente() {
    }

    public Cliente(String nombre, int nCuenta, double saldo) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //to String

//    @Override
//    public String toString() {
//        return "Cliente{" + "nombre=" + nombre + ", nCuenta=" + nCuenta + ", saldo=" + saldo + '}';
//    }

    @Override
    public String toString() {
        return  nombre + "\t" + nCuenta + "\t" + saldo;
    }
    
    
    /*sobreescribo el metodo equals
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Cliente) {       //preguntamos si obj se instacio como Cliente
            Cliente aux=(Cliente)obj;  //casteamos
            if (this.nCuenta == aux.nCuenta) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
*/
    /*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.nCuenta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.nCuenta != other.nCuenta) {
            return false;
        }
        return true;
    }
    */
    
}
