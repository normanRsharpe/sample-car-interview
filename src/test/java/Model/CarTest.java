package Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;


class CarTest {
    Car newCar = new Car("Toyota", "Corolla", "1994");
    @Test
    public void getMake() throws Exception {
        //Given: the instantiated newCar with a make of Toyota
        //When: I call the get make function
        //Then: I expect the function to return the string Toyota

        assertSame(newCar.getMake(), "Toyota");
    }

    @Test
    public void makeCarAccelerateX() throws Exception {
        //Given:
        //When:
        //Then:

        newCar.accelerate(1,"x");
        assertSame(newCar.xVel, 1);
    }
    @Test
    public void makeCarAccelerateY() throws Exception {
        //Given:
        //When:
        //Then:

        newCar.accelerate(1,"y");
        assertSame(newCar.yVel, 1);
    }
    @Test
    public void shouldNotMakeCarAccelerate() throws Exception {
        //Given: The instantiated car with 0 x/y velocity
        //When: I call the accelerate function with an invalid direction
        //Then: I expect the car to not have changed x/y velocity.

        newCar.accelerate(1,"test");
        assertSame(newCar.yVel, 0);
        assertSame(newCar.xVel, 0);
    }

}