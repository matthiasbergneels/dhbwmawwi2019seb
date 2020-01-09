package chapter6;

public final class Bird extends Animal{

    private boolean flyable;

    public Bird(float size, float weight, String description, boolean flyable){
        super(size, weight, description);
        this.setFlyable(flyable);
    }

    public void tweet(){
        System.out.println("Der Vogel " + this.getDescription() + " zwitschert.");
    }

    @Override
    public void breath(){
        System.out.println("Der Vogel " + this.getDescription() + " atmet. *zwitscher*");
    }

    public boolean isFlyable() {
        return flyable;
    }

    public void setFlyable(boolean flyable) {
        this.flyable = flyable;
    }
}
