package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");

        Car audi = new Car("Audi A3");

        ferrari.accelerate(100);
        ferrari.accelerate(100);
        ferrari.accelerate(100);
        ferrari.decelerate(95);
        ferrari.decelerate(10);


        ferrari.printStatus();
        audi.printStatus();
    }
}
