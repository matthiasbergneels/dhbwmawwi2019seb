package chapter6;

public class Dog extends Animal{

    private String race;

    public Dog(float size, float weight, String description, String race){
        super(size, weight, description);
        this.setRace(race);
    }

    public void bark(){
        System.out.println("Der Hund " + this.getDescription() + " bellt.");
    }

    // override eat method
    @Override
    public void eat(){
        super.eat();
        System.out.println("... Fleisch!");
    }

    // overload eat method
    public void eat(float amount){
        System.out.println("Der Hund " + this.getDescription() + " frisst " + amount + " Fleisch!");
    }

    @Override
    public void breath(){
        System.out.println("Der Hund " + this.getDescription() + " atmet. *hechel*");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString() + ", Race: " + this.getRace();
    }
}
