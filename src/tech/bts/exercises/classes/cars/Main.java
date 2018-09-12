package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO", 200);

        Car audi = new Car("Audi A3", 150);

        ferrari.printStatus();
        audi.printStatus();
    }
}
