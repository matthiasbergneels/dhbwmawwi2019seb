package chapter3;

public class ArrayExamples {

    public static void main(String[] args) {

        int[] numbers = new int[10]; // {0, 0, 0, ...}

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //numbers[10] = 1000;

        System.out.println(numbers[1]);
        System.out.println(numbers[5]);
        //System.out.println(numbers[10]);

        System.out.println(numbers.length);


        String[] words = {"Hallo", "Klaus", "Wurst", "Käse"};

        System.out.println(words[2]);
        System.out.println(words.length);
        System.out.println(words);


        char[][] tictactoe = new char[3][3];

        tictactoe[1][1] = 'X';
        tictactoe[0][1] = 'O';


        String[][] sentences = new String[10][];

        sentences[0] = new String[3];

        sentences[0][0] = "Ich";
        sentences[0][1] = "hab";
        sentences[0][2] = "hunger";

        sentences[1] = new String[5];

        sentences[1][0] = "Ich";
        sentences[1][1] = "mag";
        sentences[1][2] = "nicht";
        sentences[1][3] = "viel";
        sentences[1][4] = "lernen";

        System.out.println(sentences.length);
        System.out.println(sentences[0].length);
        System.out.println(sentences[1].length);


        String[][] sentences2 = {{"Ich", "hab", "hunger"},{"Ich", "mag", "nicht", "viel", "lernen"}};

    }
}
