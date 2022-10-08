package utlidad;

import entidad.Pelicula;
import java.util.Comparator;


public class Comparators {

    public static Comparator<Pelicula> compareNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getNombre().compareTo(t2.getNombre());
        }
    };
    
    public static Comparator<Pelicula> compareAnio = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
          return Integer.compare(t1.getAnio(), t2.getAnio());
        }
    };
    public static Comparator<Pelicula> compareGenero = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getGenero().compareTo(t2.getGenero());
        }
    };
    
    
}
