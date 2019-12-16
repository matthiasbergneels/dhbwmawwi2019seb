package chapter5;

public class Car {

    public static final String COLOR_RED = "rot";
    public static final String COLOR_BLACK = "schwarz";
    public static final String COLOR_BLUE = "blue";

    private Brands brand;
    private String licensePlate;
    private int hp;
    private int doorCount;
    private String color;

    private static int carCounter;

    public Car(String licensePlate, Brands brand, int hp, int doorCount, String color){
        this.setBrand(brand);
        this.setLicensePlate(licensePlate);
        this.setHp(hp);
        this.setDoorCount(doorCount);
        this.setColor(color);

        carCounter++;
    }

    public Car(Brands brand, int hp, int doorCount, String color){
        this(null, brand, hp, doorCount, color);
    }

    public Car(Brands brand){
        this(brand, 150, 5, "schwarz");
    }


    public void accelerate(){
        System.out.println("das auto ("+ this.licensePlate +") beschleunigt...");
    }

    public void brake(){
        System.out.println("das auto ("+licensePlate+")  wird langsamer...");
    }

    public int getHp(){
        return this.hp;
    }

    public Brands getBrand() {
        return this.brand;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public int getDoorCount() {
        return this.doorCount;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        if(color.equals(COLOR_BLACK) || color.equals(COLOR_RED) || color.equals(COLOR_BLUE)) {
            this.color = color;
        }else{
            this.color = "schwarz";
        }
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    protected void setHp(int hp) {
        if(hp > 50 && hp < 600){
            this.hp = hp;
        }else{
            this.hp = 150;
        }
    }

    public void increaseHp(){
        this.hp = (int)(this.hp * 1.05);
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    private void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public static int getCarCounter(){
        return carCounter;
    }

    protected void finalize(){
        System.out.println("Auto ("+ licensePlate +") wird verschrottet");
        carCounter--;
    }
}
