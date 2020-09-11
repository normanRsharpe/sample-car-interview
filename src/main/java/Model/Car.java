package Model;

class Car {

    private String make;
    private String model;
    private String year;
    private int xVel;
    private int yVel;

    //user should be able to set the make, model, and year of the vehicle on instantiation, but not the velocity.
    public Car(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.xVel = 0;
        this.yVel = 0;
    }

    public void accelerate(int vel, String direction) {
        if(direction.equals("x")){
            this.xVel = vel;
        } else if(direction.equals("y")) {
            this.yVel = vel;
        }
    }

    //Getters
    public String getMake() {
        return this.make;
    }

    public int getxVel(){
        return this.xVel;
    }

    public int getyVel() {
        return yVel;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
}