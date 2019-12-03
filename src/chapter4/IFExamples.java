package chapter4;

public class IFExamples {

    public static void main(String[] args) {

        boolean tired = false;

        if(tired) {
            System.out.println("Ich bin müde");
            System.out.println("Sau müde");
        }else{
            System.out.println("Top fit");
        }

        System.out.println("Ende");


        int speed = 14;

        if(speed > 0 && speed < 10) {
            System.out.println("Schnecken-Tempo");
        }else if(speed >= 15 && speed < 20){
            System.out.println("Oma-Tempo");
        }else if(speed >= 10 && speed < 15){
            System.out.println("Schildkröten-Tempo");
        }else if(speed >= 20){
            System.out.println("Raser");
        }else{
            System.out.println("Fehler - unmöglich");
        }

    }
}
