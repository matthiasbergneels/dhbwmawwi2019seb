package excersise.chapter4;

public class Fakultaet2 {

    public static void main(String[] args) {
        final int fakultaet = 5;
        int result = 1;

        for(int i = 2; i <= fakultaet; i++){
            result *= i;
        }

        System.out.println("Fakultät von " + fakultaet + " ist " + result);
    }

}
