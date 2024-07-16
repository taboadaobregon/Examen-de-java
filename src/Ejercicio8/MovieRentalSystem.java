package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieRentalSystem {

    public void addItem(Scanner scanner, ArrayList<RentalItem> listarenalItem) {
        System.out.print("Ingrese el nombre del itemName: ");
        String itenName = scanner.next();
        System.out.print("Ingrese la edad del id Item: ");
        int idItem = scanner.nextInt();

        System.out.print("Ingrese el estado del item : ");
        String available = scanner.next();

        RentalItem rentalItem = new RentalItem(itenName,idItem,available);
        listarenalItem.add(rentalItem);
        System.out.println("renalItem agregado.");
    }

    public  void registerCustomer(Scanner scanner, List<Customer> customerlist){
        System.out.print("Ingrese el nombre del cliente: ");
        String customerName = scanner.next();
        System.out.print("Ingrese el id del cliente: ");
        int customerId = scanner.nextInt();
        System.out.print("Ingrese el numero de rented Movies : ");
        int rentedMovies = scanner.nextInt();

        Customer cliente = new Customer(customerName,customerId,rentedMovies);
        customerlist.add(cliente);
        System.out.println("Customer agregado.");
    }











}
