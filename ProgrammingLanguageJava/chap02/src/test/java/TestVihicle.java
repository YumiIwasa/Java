import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TestVihicle {
    @Test
    public void testCurrentSpeed() {
        Vehicle vehicle = new Vehicle();
        vehicle.currentSpeed = 15.0;
        assertThat(vehicle.currentSpeed, is(15.0));
    }

    @Test
    public void testCureentAngle() {
        Vehicle vehicle = new Vehicle();
        vehicle.cureentAngle = 5.0;
        assertThat(vehicle.cureentAngle, is(5.0));
    }

    @Test
    public void testName() {
        Vehicle vehicle = new Vehicle();
        vehicle.name = "test";
        assertThat(vehicle.name, is("test"));
    }
}
