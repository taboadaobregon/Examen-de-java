package Ejercicio8;

public class Customer {
    private String customerName;
    private int customerID;
    private int rentedMovies;

    public Customer(String customerName, int customerID, int rentedMovies) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.rentedMovies = rentedMovies;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRentedMovies() {
        return rentedMovies;
    }

    public void setRentedMovies(int rentedMovies) {
        this.rentedMovies = rentedMovies;
    }

    public void showCustomerDetails(){
        System.out.println("CustomerName : " + customerName + " customerID : " + customerID + " rentedMovies : " +rentedMovies);
    }
}
