package Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;


class CarTest {
    Car newCar = new Car("Toyota", "Corolla", "1994");
    @Test
    public void getMake() throws Exception {
        assertSame(newCar.getMake(), "Toyota");
    }

    @Test
    public void makeCarAccelerateX() throws Exception {
        newCar.Accelerate(1,"x");
        assertSame(newCar.xVel, 1);
    }
    @Test
    public void makeCarAccelerateY() throws Exception {
        newCar.Accelerate(1,"y");
        assertSame(newCar.yVel, 1);
    }
    @Test
    public void shouldNotMakeCarAccelerate() throws Exception {
        newCar.Accelerate(1,"L");
        assertSame(newCar.yVel, 0);
        assertSame(newCar.xVel, 0);
    }

}