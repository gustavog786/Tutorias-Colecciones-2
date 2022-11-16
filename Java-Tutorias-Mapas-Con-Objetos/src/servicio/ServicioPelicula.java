
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import utlidad.Comparators;


public class ServicioPelicula {
    
    public void mostrarPeliculas(HashMap<String,Pelicula> peliculas){
        System.out.println("Clave\t\t   Nombre  \tAnio\tGenero");
        for (Map.Entry<String, Pelicula> entry : peliculas.entrySet()) {
            String key = entry.getKey();
            Pelicula value = entry.getValue();
            System.out.println("Clave: "+ key + "  Valor: "+ value);
        }
        System.out.println("--------\n");
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> listaPeliculas){
        System.out.println("Nombre\t\tAnio\tGenero");
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("------------\n");
    }
    
    public void ordenarPorNombre(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareNombre);
        mostrarPeliculas(listaPeliculas);
    }
    
    public void ordenarPorAnio(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareAnio);
        mostrarPeliculas(listaPeliculas);
    }
    
    public void ordenarPorGenero(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareGenero);
        mostrarPeliculas(listaPeliculas);
    }
}
