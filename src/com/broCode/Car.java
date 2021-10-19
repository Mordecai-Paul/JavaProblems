package com.broCode;

import java.lang.reflect.Array;

public class Car {
        //attributes.
        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "blue";
        double price = 5000.00;
        void drive(){
            System.out.println("You drive the car");
        }
        void brake(){
            System.out.println("You step on the brake");
        }
}

    /*
     Arrays
     */
class ArrayFood{
    String name;
    ArrayFood(String name){
        this.name = name;

    }
}

    /*
    inheritance.
     */
class Motorcar extends Vehicle {
        int wheels = 2;
        int doors = 4;

}

 class Vehicle{
    double speed;
   public void go()
    {
        System.out.println("This vechicle is moving");
    }
  public  void stop()
    {
        System.out.println("This vechicle is stopped");
    }

     protected void speed() {
     }
 }
class carToString{

    /*
      toString() = special method that all objects inherits,
      that return a string that "textually represents" an object
      can be used both implicitly and explicitly.
           */
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String toString(){
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;

    }



}
class Human{
    //constructor is a special method that is called when
    //an object is instantiated (created). created different object with different argument.
        String name;
        int age;
        double weight;

        Human(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;

        }
        void eat(){
            System.out.println(this.name + "is eating");

        }
        void drink(){
            System.out.println(this.name + "is drinking \"burp\"  " );
        }

}

class constructorOverLoading
{
    /*
    Overloaded constructors = Multiple constructors within
    a class with the same name, but have different Parameters
    name + parameter = signature.
     */
    String BREAD;
    String sauce;
    String cheese;
    String topping;
    constructorOverLoading(String bread, String sauce , String cheese, String topping )
    {
        this.BREAD = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping= topping;
    }
    constructorOverLoading(String bread ,String sauce){
        this.BREAD = bread;
        this.sauce = sauce;
    }

    constructorOverLoading(String bread ,String sauce, String cheese){
        this.BREAD = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }


}



//passing object as argument to a method.
class Garage{
    void park(CarOne car){
        System.out.println("The " + car.name+ "\tis parked in the garage");
    }
}

class CarOne{
    String name;
    CarOne(String name){
        this.name = name;

    }

}

/*
         static = modifiers. A single Copy of a variable| method
         is created and shared.
         the class "owns" the static member.
 */



//explaining static method.
class Friend {

   final String name;
    static int NUMBER_OF_FRIENDS;

     Friend(String name) {
        this.name = name;
        NUMBER_OF_FRIENDS++;
    }

    static void displayFriends()
    {
        System.out.println("You have " + NUMBER_OF_FRIENDS + "friends.");
    }
}