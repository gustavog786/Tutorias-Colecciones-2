package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
        
        //Creamos un conjunto de nombre "lenguajes" de tipo String
        HashSet<String> lenguajes = new HashSet<>();
        
        //Agregamos datos con add
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        lenguajes.add("Rubi");
        lenguajes.add("C");
        lenguajes.add("PHP");
        
        // mostramos el conjunto
        //Lo recorremos con forEach
        for (String aux : lenguajes) {
            System.out.println(aux +" ");
        }
        System.out.println("-----\n");
        
        //agregamos otro dato repetido
        lenguajes.add("JavaScript");
        
        //Mostramos otra vez el conjunto
        for (String aux : lenguajes) {
            System.out.println(aux +" ");
        }
        System.out.println("-------\n");
        
        // Eliminar elementos
        // Por medio del nombre
        lenguajes.remove("C");
        
        //Mostramos otra vez el conjunto
        for (String aux : lenguajes) {
            System.out.println(aux +" ");
        }
        System.out.println("-------\n");
        
        //Iterator
        Iterator<String> itLenguajes = lenguajes.iterator();
        while (itLenguajes.hasNext()) {
            if (itLenguajes.next().equals("Rubi")) {
                itLenguajes.remove();
            }   
        }
        //Muestro los lenguajes sin Rubi
         for (String aux : lenguajes) {
            System.out.println(aux +" ");
        }
        System.out.println("-------\n");
        
        //Ordenar el conjunto, lo convertimos en lista y luego lo ordeno
        ArrayList<String> listalenguajes = new ArrayList<>(lenguajes);
        Collections.sort(listalenguajes);
        
        //Muestro lista ordenada
        System.out.println("Lista ordenada alfabeticamente");
        for (String aux : listalenguajes) {
            System.out.println(aux + "");
        }
        System.out.println("-------\n");
    }
    
}
