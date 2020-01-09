package chapter6;

public class Farm {

    public static void main(String[] args) {

        /*

        Animal myAnimal = new Animal(30.0f, 15.0f, "mein Tier");

        myAnimal.breath();
        myAnimal.eat();
        myAnimal.move();
        //myAnimal.bark();
        */

        Dog myDog = new Dog(25.0f, 20.0f, "Bello", "Schaeferhund");

        myDog.bark();
        myDog.breath();
        myDog.eat();
        myDog.move();

        System.out.println(myDog.toString());
        System.out.println(myDog);



    }
}
