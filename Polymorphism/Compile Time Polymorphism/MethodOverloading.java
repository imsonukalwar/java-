//Compile-time Polymorphism--->>this can achived by method overloading

    // Java program to demonstrate the working of method
// overloading by changing the number of parameters
public class MethodOverloading {
    void show(int num1)
    {
        System.out.println("number 1 : " + num1);
    }
    void show(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
        + "  number 2 : " + num2);
    }
    public static void main(String[] args)
    {
        MethodOverloading obj = new MethodOverloading();
        obj.show(3); 
        obj.show(4, 5); 
    }
}

