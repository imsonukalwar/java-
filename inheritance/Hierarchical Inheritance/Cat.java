class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }

    public static void main(String[] args) {
        // Objects banate hain
        Dog d = new Dog();
        Cat c = new Cat();

        // Methods call karte hain
        d.eat();   // Animal class se inherit hua
        d.bark();  // Dog ka method

        c.eat();   // Animal class se inherit hua
        c.meow();  // Cat ka method
    }
}
