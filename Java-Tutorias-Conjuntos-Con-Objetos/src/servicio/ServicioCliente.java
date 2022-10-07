package servicio;

import entidad.Cliente;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import utilidad.Comparators;


public class ServicioCliente {
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarConjuntoClientes( HashSet<Cliente> clientesBanco){
        System.out.println("NOMBRE\t\tNCUENTA\tSALDO");
        for (Cliente aux : clientesBanco) {
            System.out.println(aux);
        }
        System.out.println("-----------\n");
    }
    public void eliminarCliente(HashSet<Cliente> clientesBanco){
        System.out.println("Ingrese el nombre del clinte que quiere eliminar: ");
        String clienteEliminado= scan.next();
        boolean esta = false;
        Iterator<Cliente> itClientes = clientesBanco.iterator();
        while (itClientes.hasNext()) {
            if (itClientes.next().getNombre().equalsIgnoreCase(clienteEliminado)) {
                itClientes.remove();
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("El cliente no esta en el conjunto\n");
        }       
    }
    
    //ordeno el conjunto alfabeticamente por nombre
    
    public void ordenarPorNombre(HashSet<Cliente> clientesBanco){
        //Transfomo el conjunto en una lista
        ArrayList<Cliente>listaClientes = new ArrayList<>(clientesBanco);
        listaClientes.sort(Comparators.compareNombre);
        System.out.println("NOMBRE\t\tNCUENTA\tSALDO");
        for (Cliente aux : listaClientes) {
            System.out.println(aux);
        }
        System.out.println("---------\n");
    }
    
     //ordeno el conjunto alfabeticamente por nCuenta
    public void ordenarPorNCuenta(HashSet<Cliente> clientesBanco){
        //Transfomo el conjunto en una lista
        ArrayList<Cliente>listaClientes = new ArrayList<>(clientesBanco);
        listaClientes.sort(Comparators.compareNCuenta);
        System.out.println("NOMBRE\t\tNCUENTA\tSALDO");
        for (Cliente aux : listaClientes) {
            System.out.println(aux);
        }
         System.out.println("---------\n");
    }
    
    //ordeno el conjunto por saldo de menor a mayor
    public void ordenarPorSaldo(HashSet<Cliente> clientesBanco){
        //Transfomo el conjunto en una lista
        ArrayList<Cliente>listaClientes = new ArrayList<>(clientesBanco);
        listaClientes.sort(Comparators.compareSaldo);
        System.out.println("NOMBRE\t\tNCUENTA\tSALDO");
        for (Cliente aux : listaClientes) {
            System.out.println(aux);
        }
    }
}
