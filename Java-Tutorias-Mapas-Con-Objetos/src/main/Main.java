package main;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import servicio.ServicioPelicula;


public class Main {

   
    public static void main(String[] args) {
        //Creo el servico de peliculas
        ServicioPelicula servicioPelicula= new ServicioPelicula();
        
        //Creo un mapa con clave de tipo String y valor un objeto 
        HashMap<String,Pelicula> peliculas = new HashMap<>(); 
        
        //Agrego elementos a la lista
        // 1ra forma
        Pelicula p1 = new Pelicula("Titanic ", 1997, "Drama");
        peliculas.put("A51", p1);
        
        //2da forma
        peliculas.put("C78", new Pelicula("Matrix  ", 1999, "Ciencia Ficcion"));
        peliculas.put("B45", new Pelicula("Frosen  ", 2013, "Animacion"));
        peliculas.put("A28", new Pelicula("Avatar  ", 2009, "Ciencia ficcion"));
        peliculas.put("R66", new Pelicula("Rocky   ", 1976, "Drama"));
        peliculas.put("J14", new Pelicula("Joker   ", 2019, "Suspenso"));
        peliculas.put("L12", new Pelicula("Scream  ", 1996, "Terror"));
        
        //Muestro el mapa de peliculas
        servicioPelicula.mostrarPeliculas(peliculas);
        
        //Agrego una pelicula con la misma clave
        peliculas.put("C78", new Pelicula("Jumanji ",1995, "Accion"));
        servicioPelicula.mostrarPeliculas(peliculas);
        
        //Eliminar pelicula con la clave
//        peliculas.remove("B45");
//        servicioPelicula.mostrarPeliculas(peliculas);
        
        //otra forma de eliminar
        
        
        //Ordenar
        //Transfomo el mapa en un arraylist
//        ArrayList<Pelicula> listaPeliculas= new ArrayList(peliculas.values());
//        
//        System.out.println("Ondeno Alfabeticamente por nombre: ");
//        servicioPelicula.ordenarPorNombre(listaPeliculas);
//        
//        System.out.println("Ondeno por anio: ");
//        servicioPelicula.ordenarPorAnio(listaPeliculas);
//        
//        System.out.println("Ondeno Alfabeticamente por genero: ");
//        servicioPelicula.ordenarPorGenero(listaPeliculas);
        
        
        //map.values().removeIf(value -> !value.contains("1"));

    }
    
}
