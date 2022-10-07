package utilidad;

import entidad.Cliente;
import java.util.Comparator;


public class Comparators {
    
    public static Comparator<Cliente> compareNombre = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente t1, Cliente t2) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
    };
    
    public static Comparator<Cliente> compareNCuenta = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente t1, Cliente t2) {
            return Integer.compare(t1.getnCuenta(), t2.getnCuenta());
        }
    };
    
    public static Comparator<Cliente> compareSaldo = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente t1, Cliente t2) {
            return Double.compare(t1.getSaldo(), t2.getSaldo());
        }
    };
}
