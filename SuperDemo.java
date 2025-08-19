package oops_skill;

class Vehicle {
    int maxSpeed = 120;
}

// sub class SportsCar extending Vehicle
class SportsCar extends Vehicle {
    int maxSpeed = 180;

    void display() {
        // print maxSpeed from the Vehicle class using super
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

// Driver Program
class SuperDemo {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.display();
    }
}
