package SOLID.ISP.Domain;

/* Bad
public class Dog implements Animal {
    @Override
    public void fly() { }

    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}*/

import SOLID.ISP.Interfaces.ILandAnimal;

// My Correction
public class Dog implements ILandAnimal {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}
