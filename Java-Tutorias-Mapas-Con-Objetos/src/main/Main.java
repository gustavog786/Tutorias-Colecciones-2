package main;

import entidad.Pelicula;
import java.util.HashMap;
import java.util.Map;
import servicio.ServicioPelicula;


public class Main {

   
    public static void main(String[] args) {
        //Creo el servico de peliculas
        ServicioPelicula servicioPelicula= new ServicioPelicula();
        
        //Creo un mapa con clave de tipo String y valor un objeto
        HashMap<String,Pelicula> peliculas = new HashMap<>();
        
        //Agrego elementos a la lista
        // 1 forma
        Pelicula p1 = new Pelicula("Titanic", 1997, "Drama");
        peliculas.put("A51", p1);
        
        //2da forma
        peliculas.put("B45", new Pelicula("El padrino", 1972, "Drama"));
        peliculas.put("C78", new Pelicula("Matrix", 1999, "Ciencia Ficcion"));
        peliculas.put("A28", new Pelicula("Parasitos", 2019, "Drama"));
        peliculas.put("R66", new Pelicula("Rambo", 1982, "Accion"));
        peliculas.put("J14", new Pelicula("Joker", 2019, "Suspenso"));
        peliculas.put("L12", new Pelicula("El juego del miedo", 2004, "Terror"));
        
        //Muestro el mapa de peliculas
        servicioPelicula.mostrarMapaPeliculas(peliculas);
        
        //Agrego una pelicula con la misma clave
        peliculas.put("B45", new Pelicula("Hulk",2003, "Accion"));
        servicioPelicula.mostrarMapaPeliculas(peliculas);
        
        //Eliminar pelicula con la clave
        
        //Ordenar
        
    }
    
}