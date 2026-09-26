package classesObjects_04;

public class DogClient {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.name = "Husky";
        dog1.age = 32;
        dog1.breed= "debbie";
        dog1.color = "Bklack";
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.breed);
        dog1.bark();
        dog1.sleep();
        dog1.eat();

    }
}
