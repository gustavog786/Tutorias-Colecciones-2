package main;

import entidad.Cliente;
import java.util.HashSet;
import servicio.ServicioCliente;


public class Main {

   
    public static void main(String[] args) {
        //Creo el servicio de clientes
        ServicioCliente servicioCliente = new ServicioCliente();
        //creo el conjunto de nombre "clientesBanco" del tipo cliente
        HashSet<Cliente> clientesBanco = new HashSet<>();
        //Muestro el conjunto de clientes
        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        //Agrego elementos a la lista
        //1ra forma
        Cliente c1 = new Cliente("Juan Lopez", 00001, 150000);
        clientesBanco.add(c1);
        
        //2da Forma
        clientesBanco.add(new Cliente("Pedro Gonzales", 00002, 200000));
        clientesBanco.add(new Cliente("Maria Rodriguez", 00003, 50000));
        clientesBanco.add(new Cliente("Karina Garcia", 00004, 250000));
        clientesBanco.add(new Cliente("Luciano Gomez", 00005, 10000));
        
       //Muestro la lista completa
        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        //agrego el mismo cliente
        clientesBanco.add(new Cliente("Karina Garcia", 00004, 250000));
        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        
        //Elimino un objeto del conjunto mediante itarator
        servicioCliente.eliminarCliente(clientesBanco);
        servicioCliente.mostrarConjuntoClientes(clientesBanco);
        
        //ordenar Clientes
        System.out.println("Ordeno por Nombre");
        servicioCliente.ordenarPorNombre(clientesBanco);
        
        System.out.println("Ordeno por Numero de Cuenta");
        servicioCliente.ordenarPorNCuenta(clientesBanco);
        
        System.out.println("Ordeno por Saldo");
        servicioCliente.ordenarPorSaldo(clientesBanco);   
    }
    
}
