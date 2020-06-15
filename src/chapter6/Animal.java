package chapter6;

public abstract class Animal {

    private float size;
    private float weight;
    private String description;

    public Animal(float size, float weight, String description){
        this.setSize(size);
        this.setWeight(weight);
        this.setDescription(description);
    }

    public void eat(){
        System.out.println("Das Tier " + description + " frisst.");
    }

    public abstract void breath();

    public final void move(){
        System.out.println("Das Tier " + description + " bewegt sich.");
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Description: " + this.getDescription() + ", Size: " + this.getSize() + ", Weight: " + this.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (Float.compare(animal.size, size) != 0) return false;
        if (Float.compare(animal.weight, weight) != 0) return false;
        return description != null ? description.equals(animal.description) : animal.description == null;
    }

    @Override
    public int hashCode() {
        int result = (size != +0.0f ? Float.floatToIntBits(size) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
