class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor is created");

    }
}

public class Constructors {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.age = 21;

        s1.printInfo();
    }
}
