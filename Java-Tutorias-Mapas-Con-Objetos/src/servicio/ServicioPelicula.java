/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gusta
 */
public class ServicioPelicula {
    
    public void mostrarMapaPeliculas(HashMap<String,Pelicula> peliculas){
        for (Map.Entry<String, Pelicula> entry : peliculas.entrySet()) {
            String key = entry.getKey();
            Pelicula value = entry.getValue();
            System.out.println("Clave: "+ key + "  Valor: "+ value);
        }
        System.out.println("--------\n");
    }
}
