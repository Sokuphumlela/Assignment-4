package nombila.s;

import assignment4.MountainBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BikeRideTest {
    @Test
    public void shouldRunMountainOne() {
        MountainBike bicycle = new MountainBike();
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        System.out.println(bike.currentSpeed());
        assertEquals(bike.currentSpeed(), 14);
    }
}
