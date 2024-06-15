package Java_Constructors;

class Parent {
    // Default constructor
    Parent() {
        System.out.println("Parent class default constructor");
    }

    // Constructor with an int parameter
    Parent(int rollNo) {
        System.out.println("Parent class constructor with rollNo: " + rollNo);
    }

    // Constructor with two String parameters
    Parent(String name, String branch) {
        System.out.println("Parent class constructor with name: " + name + ", branch: " + branch);
    }

    void method1() {
        System.out.println("Used this() and super() in methods");
    }
}

class ChildClass extends Parent {

    String clg;
    String city;

    // Calling Parent class constructor using super() keyword
    ChildClass() {
        super();
    }

    // Calling Parent class argument constructor using super() keyword
    ChildClass(int rollNo) {
        super(rollNo);
    }

    // Calling Parent class argument constructor using super() keyword
    ChildClass(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College: " + this.clg + ", City: " + this.city);
    }
}

public class CallSuperFromChild {
    public static void main(String... args) {
        // Creating objects and passing values
        new ChildClass();
        new ChildClass(317);
        new ChildClass("Sharan", "CSE", "ICFAI", "Hyderabad");
    }
}
