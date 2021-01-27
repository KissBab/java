package ge.edu.btu;

public class Electricity {
    private String customerNumber;
    private double amount;


    public Electricity(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Electricity{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
