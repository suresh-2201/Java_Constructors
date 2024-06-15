package Java_Constructors;

class ParentClass {
    int rollNo;
    String name;
    String branch;

    //default constructor
    ParentClass() {
        System.out.println("Student Details");
    }

    //one argument constructor
    ParentClass(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    //two argument constructor
    ParentClass(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument {
    public static void main(String... args) {
        //calling constructors from main class
        //creating objects and passing values
        new ParentClass();
        new ParentClass(317);
        new ParentClass("Sharan", "CSE");
    }
}