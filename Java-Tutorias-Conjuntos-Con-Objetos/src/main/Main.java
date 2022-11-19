package main;

import entidad.Cliente;
import java.util.HashSet;
import java.util.TreeSet;
import servicio.ServicioCliente;
import utilidad.Comparators;


public class Main {

   
    public static void main(String[] args) {
        //Creo el servicio de clientes
        ServicioCliente servicioCliente = new ServicioCliente();
        //Creo el conjunto de nombre "clientesBanco" del tipo cliente
        HashSet<Cliente> clientesBanco = new HashSet<>();
        //Muestro el conjunto de clientes vacio
        //servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        //Agrego elementos a la lista
        //1ra forma
        Cliente c1 = new Cliente("Juan Lopez", 10001, 150000);
        clientesBanco.add(c1);
        
        //2da Forma
        clientesBanco.add(new Cliente("Pedro Gonzales", 10002, 200000));
        clientesBanco.add(new Cliente("Maria Rodriguez", 10003, 50000));
        clientesBanco.add(new Cliente("Karina Garcia", 10004, 250000));
        clientesBanco.add(new Cliente("Luciano Gomez", 10005, 10000));
        
       //Muestro la lista completa
        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        //agrego el mismo cliente
//         clientesBanco.add(new Cliente("Karina Garcia", 10004, 250000));
//        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        
//        //Elimino un objeto del conjunto mediante itarator
//        servicioCliente.eliminarCliente(clientesBanco);
//        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        
        //Ordenar clientes
        //Trasformo el Hashset en treeset
        
        TreeSet<Cliente> listaclienteTS = new TreeSet<>(Comparators.compareSaldo);
        listaclienteTS.addAll(clientesBanco);       
        System.out.println("Lista ordenada");
        servicioCliente.mostrarConjuntoClientes(listaclienteTS);
//
//        
        listaclienteTS.add(new Cliente("Ana Lopez", 10007, 100));
        System.out.println("Lista ordenada");
        servicioCliente.mostrarConjuntoClientes(listaclienteTS);

    }
}
