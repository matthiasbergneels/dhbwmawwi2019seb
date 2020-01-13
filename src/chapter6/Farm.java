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

        // narrowing Cast --> Sichtbarkeit auf das Objekt wird eingeschränkt
        Animal myAnimal = myDog;

        myAnimal.breath();

        Object myObject = myDog;


        Animal myOtherAnimal = new Bird(9.0f, 10.0f, "Tweety", true);

        //myOtherAnomal.twee


        //widening cast --> Erweitern der Sichtbarkeit auf ein Objekt
        Dog nextDog = (Dog)myAnimal;

        nextDog.bark();


        Animal[] animalShelter = new Animal[5];

        animalShelter[0] = myDog;
        animalShelter[1] = myOtherAnimal;
        animalShelter[2] = new Dog(25.5f, 30.0f, "Wuffi", "Irgendwas");
        animalShelter[3] = new Bird(13, 10, "Piep", true);
        animalShelter[4] = new Bird(13, 10, "PiepPiep", false);


        for(Animal currentAnimal : animalShelter){
            currentAnimal.breath();
            currentAnimal.eat();
            currentAnimal.move();

            if(currentAnimal instanceof Dog) {
                Dog currentDog = (Dog) currentAnimal;
                currentDog.bark();
            }
        }


    }
}
