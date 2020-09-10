package Model;

class Car {

    public String make;
    public String model;
    public String year;
    public int xVel;
    public int yVel;

    public Car(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.xVel = 0;
        this.yVel = 0;
    }

    public void Accelerate(int vel, String direction) {
        if(direction.equals("x")){
            this.xVel = vel;
        } else {
            this.yVel = vel;
        }
    }

    public String getMake() {
        return make;
    }
}