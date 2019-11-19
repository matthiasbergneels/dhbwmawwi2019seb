package chapter3;

public class DataTypeExamples {

    public static void main(String[] args) {

        // Deklaration
        int numberA;
        int numberB, numberC, numberD;

        // Initialisierung
        numberA = 15;

        // hexadezimales Ganz-Zahlenliteral
        numberA = 0x15A;

        // octales Ganz-Zahlenliteral
        numberA = 056;


        byte numberE = 127;
        byte numberF = 1;



        numberB = 16;
        System.out.println(++numberE);

        // long Ganzzahl-Literal
        long veryLongNumber = 2000000000L;

        numberA = 2000000000;

        veryLongNumber = veryLongNumber + numberA;

        System.out.println(veryLongNumber);

        // double Literal
        double numberG = 7.7d;

        // float Literal
        float numberH = 7.7f; //(float)7.7;


        // "boolean" Literal
        boolean tired = true; // false;

        // char Literal (Zeichen)
        char sign1 = 'h';
        sign1 = '❤';
        sign1 = '\u2764';
        sign1 = '\'';

        // ❤
        System.out.println(sign1);

        // String-Literal (Zeichenkette)
        String text = "Hier \t steht \n ein \"Text\"! \\";
        System.out.println(text);



        // Konvertierungen

        byte numberByte = 100;
        int numberInteger = 1000;

        numberInteger = numberByte;

        numberByte = (byte)numberInteger;

        double numberDouble = 100;

        numberDouble = numberInteger;

        numberInteger = (int)numberDouble;
    }
}
