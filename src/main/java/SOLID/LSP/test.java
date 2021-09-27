package SOLID.LSP;

public class test {
    public static void main(String[] args) {
        /*
            Dogs are not birds, so they can not tweet, then the output of dog.tweet can not
            be a sustitute of the tweet of a real bird,
            then dog.tweet brakes Liskov Sustitution Principle
        */
        Bird dog = new Dog();
        dog.tweet();

        /* A Real Bird */
        Bird eagle = new Eagle();
        eagle.tweet();
    }
}
