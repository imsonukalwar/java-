
class Person {
    void role() {
        System.out.println("I am a person.");
    }
}
// overrides the role method
class Father extends Person {
    // Overridden method to show
    public void role() {
        System.out.println("I am a father.");
    }
}
public class polymorph {
    public static void main(String[] args) {
        // Creating a reference of type Person
        // but initializing it with Father class object
        Person p=new Person();
        Father f=new Father();
        
        // Calling the role method. It calls the
        // overridden version in Father class
        p.role();
        f.role();
    }
}
