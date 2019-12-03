package chapter4;

public class LoopExamples {

    public static void main(String[] args) {



        int counter = 0;

        // kopfgesteuerte Schleife - while
        System.out.println("while Schleife:");
        while(counter < 10) {
            counter++; // counter = counter + 1; // counter += 1;
            if(counter == 5){
                System.out.println("Böse Zahl");
                break;
            }
            System.out.println("Zähle " + counter);
        }


        counter = 0;
        // fussgesteuerte Schleife - do-while
        System.out.println("do-while Schleife:");
        do{
            counter++; // counter = counter + 1; // counter += 1;
            if(counter % 2 != 0){
                continue;
            }
            System.out.println("Zähle " + counter);
        }while(counter < 10);


        // Zählerschleife - for
        System.out.println("for Schleife:");
        for(int i = 1; i <= 10; i++){
            System.out.println("Zähle " + i);
        }
    }
}
