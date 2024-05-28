package Coupling;

class Car1  {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Tight {
    Car1 c = new Car1();
    public void startJourney() {
        c.move();
    }
}

