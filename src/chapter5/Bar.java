package chapter5;

public class Bar {

    public static void main(String[] args) {

        Student myStudent = new Student(4711, "Müller", "Fritz");

        myStudent.drink(500.0f);
        myStudent.drink(250.0f, 5.0f);
        myStudent.drink(10.0f, 50.0);


    }
}
