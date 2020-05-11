package chapter7.cloneExample;

public class CloneMachine{

    public static void main(String[] args) {

        Sheep dolly1 = new Sheep("Dolly", 5);

        try {

            Sheep dolly2 = (Sheep)dolly1.clone();
            Sheep dolly3 = dolly1;

            System.out.println("Dolly 1: " + dolly1.name + ", " + dolly1.age);
            System.out.println("Dolly 2: " + dolly2.name + ", " + dolly2.age);
            System.out.println("Dolly 3: " + dolly3.name + ", " + dolly3.age);

            dolly1.age = 6;
            dolly2.name = dolly2.name + "-clone";

            System.out.println("Dolly 1: " + dolly1.name + ", " + dolly1.age);
            System.out.println("Dolly 2: " + dolly2.name + ", " + dolly2.age);
            System.out.println("Dolly 3: " + dolly3.name + ", " + dolly3.age);


        }catch(Exception e){
            System.out.println("Klonen ist schiefgegangen!");
        }
    }
}
