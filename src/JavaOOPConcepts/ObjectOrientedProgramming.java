package JavaOOPConcepts;


/*
An abstract class is a superclass (parent class)
that cannot be instantiated. You need to instantiate
 one of its child classes
 if you want to create a new object. **/

abstract class Animal{
    abstract void move();
    abstract void eat();
    void label(){
        System.out.println("Animal's data:");
    }
}

class Bird extends Animal{
    @Override
    void move() {
        System.out.println("Moves by flying.");

    }
    @Override
    void eat(){
        System.out.println("Eats Birdfood.");
    }
}

class Fish extends Animal{
    @Override
    void move(){
        System.out.println("Moves by swimming, ");
    }

    @Override
    void eat() {
        System.out.println("Eat seafood.");
    }
}





/*** Interfaces
 *An interface is a 100% abstract class.
 * It can have only static, final, and public fields and abstract methods.
 * It’s frequently referred to as a blueprint of a class as well.
 * Java interfaces allow us to implement multiple inheritance
 * in our code, as a class can implement any number of interfaces.
 * Classes can access an interface using the implements keyword.
 *** **/

interface Animals{
    public void eat();
    public void sound();


}

interface Birds{
    int numberOfLegs = 2;
    String outerCovering = "feather";

    public void fly();
}

class Eagle implements Animals,Birds{

    @Override
    public void eat() {
        System.out.println("Eats reptile and amphibians.");
    }

    @Override
    public void sound() {
        System.out.println("Has a high-pitched whistling sound.");
    }

    @Override
    public void fly(){
        System.out.println("Flies up to 10,000 feet.");
    }
}


/**
 * With encapsulation, you can protect the fields of a class.
 * To do so, declare the fields as private and providing
 * access to them with getter and setter methods.
 */

class Encapsulation {
    private String name;
    private double averageWeight;
    private int numberOfLegs;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }



    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public  void setName(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}


public class ObjectOrientedProgramming {
    public static void main (String args[])
    {
//        Eagle myEagle = new Eagle();
//        myEagle.eat();
//        myEagle.sound();
//        myEagle.fly();
//
//        System.out.println("Number of legs: " + Birds.numberOfLegs);
//        System.out.println("Outer covering:" + Birds.outerCovering);

        Encapsulation obj = new Encapsulation();
        obj.setAverageWeight(23.4);
        obj.setName("Bird");
        obj.setNumberOfLegs(2);

       System.out.println(obj.getAverageWeight());
       System.out.println(obj.getName());
      System.out.println(obj.getNumberOfLegs());

    }
}
