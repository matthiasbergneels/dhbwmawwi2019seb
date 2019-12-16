package chapter5;

public class CarTest {

    public static void main(String[] args) {

        System.out.println("Anzahl Autos: " + Car.getCarCounter());


        Car myCar = new Car("HD-XX 1234", Brands.MERCEDES, 600, 5, Car.COLOR_RED);
        System.out.println("Anzahl Autos: " + Car.getCarCounter());
        Car yourCar = new Car("HD-YY 5678", Brands.AUDI, 150, 3, "Rot");

        Car yourCar2 = new Car("HD-YY 5678", Brands.AUDI, 150, 3, "Rot");
        Car yourCar3 = new Car("HD-YY 5678", Brands.AUDI, 150, 3, "Rot");


        // no access on private attributes
        //myCar.color = "gelb";
        //myCar.hp = 165;
        //myCar.licensePlate = "HD-XX 1243";

        //yourCar.licensePlate = "HD-YY 5678";

        myCar.accelerate();
        myCar.brake();

        //myCar.hp = 565;

        System.out.println("farbe von deinem Auto: " + yourCar.getColor());

        //yourCar.color = "kack braun";
        yourCar.setColor("kack braun");

        System.out.println("farbe von deinem Auto: " + yourCar.getColor());


        System.out.println("Leistung von meinem Auto: " + myCar.getHp());

        System.out.println("Leistung von deinem Auto: " + yourCar.getHp());

        System.out.println("Anzahl Autos: " + Car.getCarCounter());


        myCar = null;
        yourCar = null;

        System.gc();

        try {
            Thread.sleep(500);
        }catch(Exception e){

        }

        System.out.println("Anzahl Autos: " + Car.getCarCounter());

    }
}
