package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Passenger> passengerList = new ArrayList<>();

    public boolean addPassenger(Passenger passenger) {
        if(passenger.haveTicket()==true) {
            passengerList.add(passenger);
            return true;
        }else {
            return false;
        }
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
