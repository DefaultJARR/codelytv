package SOLID.ISP;

/* Bad
public interface Animal {
    void fly();
    void run();
    void bark();
}*/

import SOLID.ISP.Domain.Bird;
import SOLID.ISP.Domain.Dog;

public class test {
    public static void main(String[] args) {
        /*
            I segregate the methods in of Animal Interface in 2 separated interfaces
            which let create more modular implementations, avoiding the implementation of
            bodiless methods.
        */
        Dog dog = new Dog();
        dog.run();
        dog.bark();

        Bird bird = new Bird();
        bird.run();
        bird.fly();
    }
}
