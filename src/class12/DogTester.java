package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();

        actualDog.name="Thor";
        actualDog.age=15;
        actualDog.breed="Husky";
        actualDog.color="Black and White";
    }
}
