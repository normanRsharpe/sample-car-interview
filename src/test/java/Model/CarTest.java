package Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;


class CarTest {

    //Instantiated a new car with the make of Toyota, model of Corolla, and it was made in 1994
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
        //Given: the instantiated car
        //When: when I call accelerate with velocity of 1, and direction of x
        //Then: I expect the car to have xVelocity of 1.

        newCar.accelerate(1,"x");

        assertSame(newCar.getxVel(), 1);
    }




    @Test
    public void makeCarAccelerateY() throws Exception {
        //Given: the car (toyota, corrola, 1994)
        //When: call accelerate with a of velocity(1) and a of direction("y")
        //Then: we expect it to accelerate with a velocity of 1, in the direction of y

        newCar.accelerate(1, "y");
        assertSame(newCar.getyVel(), 1);
    }



    @Test
    public void shouldNotMakeCarAccelerate() throws Exception {
        //Given: The instantiated car with 0 x/y velocity
        //When: I call the accelerate function with an invalid direction
        //Then: I expect the car to not have changed x/y velocity.

        newCar.accelerate(1,"test");
        assertSame(newCar.getyVel(), 0);
        assertSame(newCar.getxVel(), 0);
    }

}