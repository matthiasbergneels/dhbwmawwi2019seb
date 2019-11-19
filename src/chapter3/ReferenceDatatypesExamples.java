package chapter3;

public class ReferenceDatatypesExamples {

    public static void main(String[] args) {

        // Simple Data types
        int numberA = 5;
        int numberB;

        // Call by Value
        numberB = numberA;

        numberA = 10;

        System.out.println(numberA);
        System.out.println(numberB);


        // Reference data types
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2;

        // Call by Reference
        numbers2 = numbers1;

        numbers1[0] = 10;

        System.out.println(numbers1[0]);
        System.out.println(numbers2[0]);

    }
}
