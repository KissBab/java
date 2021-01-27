package ge.edu.btu;

public class Water {
    private String customerNumber;
    private double amount;


    public Water(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Water{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
