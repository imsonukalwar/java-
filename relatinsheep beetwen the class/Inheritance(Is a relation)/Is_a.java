/*
We can say the following terms in inheritance relationship. They are as follows:

Vehicle is the parent class (superclass) of Car.
Car is the child class (subclass) of Vehicle.
Car is the parent class of Alto.
Alto is the child class of Vehicle.
Car inherits from Vehicle.
Alto inherits from both Vehicle and Car.
Alto is derived from Car.
Car is derived from Vehicle.
Alto is derived from Vehicle.
Alto is a subtype of both Vehicle and Car.
In the terms of IS-A relationship, the following statements are true:

“Car extends Vehicle” means “Car IS-A Vehicle.”
“Alto extends Car” means “Alto IS-A Car.”
 */

public class Is_a {
    public class Vehicle {
        void dis(){
            System.out.println("this is a vehicle");
        }
    }
public class Car extends Vehicle {
    void disp(){
        System.out.println("vehicle is a car");
    }
}
public class Alto extends Car {
    void di(){
        System.out.println("car is a aulto");
    }
}
public static void main(String[] args) {
    Is_a rel=new Is_a();
    Alto obj=rel.new Alto();
    obj.dis();
    obj.disp();
    obj.di();
}
}
