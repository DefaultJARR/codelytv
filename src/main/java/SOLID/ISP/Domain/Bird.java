package SOLID.ISP.Domain;

/* Bad
public class Bird implements Animal {
    public void bark() { }
    public void run() {
        System.out.print("Bird is running");
    }
    public void fly() {
        System.out.print("Bird is flying");
    }
}*/

import SOLID.ISP.Interfaces.IFlyingAnimal;
import SOLID.ISP.Interfaces.ILandAnimal;

// My Correction
public class Bird implements IFlyingAnimal, ILandAnimal {
    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
