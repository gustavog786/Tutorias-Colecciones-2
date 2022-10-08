/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import utlidad.Comparators;


public class ServicioPelicula {
    
    public void mostrarMapaPeliculas(HashMap<String,Pelicula> peliculas){
        System.out.println("Clave\t\t   Nombre  \tAnio\tGenero");
        for (Map.Entry<String, Pelicula> entry : peliculas.entrySet()) {
            String key = entry.getKey();
            Pelicula value = entry.getValue();
            System.out.println("Clave: "+ key + "  Valor: "+ value);
        }
        System.out.println("--------\n");
    }
    
    public void mostrarListaPeliculas(ArrayList<Pelicula> listaPeliculas){
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
        System.out.println("------------\n");
    }
    
    public void ordenarPorNombre(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareNombre);
        mostrarListaPeliculas(listaPeliculas);
    }
    
    public void ordenarPorAnio(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareAnio);
        mostrarListaPeliculas(listaPeliculas);
    }
    
    public void ordenarPorGenero(ArrayList<Pelicula> listaPeliculas){
        listaPeliculas.sort(Comparators.compareGenero);
        mostrarListaPeliculas(listaPeliculas);
    }
}
