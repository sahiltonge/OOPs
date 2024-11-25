class pen { // Creating class
    String colour; // variable
    String type;

    public void write() { // Function or method
        System.out.println("Writing Something");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);

// }
// }

public class ClassAndObjects {

    public static void main(String args[]) {

        pen p1 = new pen();
        p1.colour = "Blue";
        p1.type = "Gel";

        pen p2 = new pen();
        p2.colour = "Black";
        p2.type = "Ball pen";

        p1.printColour();
        p1.printType();

        p2.printColour();
        p2.printType();

        // Student s1 = new Student();
        // s1.name = "Sahil";
        // s1.age = 21;

        // s1.printInfo();

    }

}
