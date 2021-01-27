package ge.edu.btu;

public class Passenger {
    private String name;
    private boolean ticket;

    public Passenger(String name, boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return this.name;
    }

    public boolean haveTicket() {
        return this.ticket;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
