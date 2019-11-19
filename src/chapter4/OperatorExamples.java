package chapter4;

public class OperatorExamples {

    public static void main(String[] args) {

        int counter = 1;

        // counter = counter + 1;
        counter++;

        // counter = counter + 1;
        counter += 1;

        // 5 + counter
        // couunter = counter + 1;
        int result = 5 + counter++;

        System.out.println(counter);
        System.out.println(result);



        int x = 1;

        // just don't do it :-)
        result = x++ + x++ + x++;

        System.out.println(x);
        System.out.println(result);



        String text1 = "Hallo";
        String text2 = "Klaus";

        // + - Zeichenkettenverkettung
        String textResult = counter + x + text1 + " " + text2 + "!" + (result + x);

        System.out.println(textResult);
    }
}
