package chapter4;

public class SwitchCaseExample {

    public static void main(String[] args) {

        int grade = 3;

        switch(grade){
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("ungenügend");
                break;
            default:
                System.out.println("Keine gültige Note");
        }


        switch(grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("bestanden");
                break;
            case 5:
                System.out.println("durchgefallen");
                break;
            default:
                System.out.println("Keine gültige Note");
        }



        System.out.println("Ende");



    }
}
