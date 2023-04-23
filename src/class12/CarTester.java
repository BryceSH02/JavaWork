package class12;

public class CarTester {
    public static void main(String[] args) {

        Car car= new Car();

        car.color="Blue";
        car.brand="Honda";
        car.year=2020;
        car.model="Sedan";
        car.isAutomatic=true;

        car.move();
        car.honk();
        car.stopCar();
    }
}
