

public class universal {
    static class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

static class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

static class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.bark();
        p.eat();
        p.weep();
    }

}