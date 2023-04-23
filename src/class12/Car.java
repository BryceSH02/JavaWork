package class12;

public class Car {

    String color;

    String model;

    String brand;

    int year;

    boolean isAutomatic;




    void honk(){
        System.out.println("beep beep....");
    }
    void move(){
        System.out.println("Starting the"+model+" engine");
    }

    void stopCar(){
        System.out.println("Applying the brakes to stop car");
    }
    void turn(){
        System.out.println("turning.....");
    }
}
