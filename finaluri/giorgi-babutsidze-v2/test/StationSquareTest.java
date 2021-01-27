import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    @Test
    public void addPassengerTest() {
        Train train = new Train();

        Passenger gio = new Passenger("Gio", true);
        Passenger nika = new Passenger("Nika", false);
        Passenger ana = new Passenger("Ana", true);

        assertEquals(true, train.addPassenger(gio));
        assertEquals(false, train.addPassenger(nika));
        assertEquals(true, train.addPassenger(ana));
    }
}
