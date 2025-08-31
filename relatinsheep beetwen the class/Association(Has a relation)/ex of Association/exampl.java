
    class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching...");
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void study() {
        System.out.println(name + " is studying...");
    }
}
public class exampl{
    public static void main(String[] args) {
        // Create objects independently
        Teacher teacher = new Teacher("Mr. Sharma");
        Student student = new Student("Sonu");

        // Association: linking objects
        System.out.println(student.name + " is associated with " + teacher.name);

        teacher.teach();
        student.study();
    }
}