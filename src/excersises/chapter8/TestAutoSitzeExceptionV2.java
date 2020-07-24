package excersises.chapter8;

public class TestAutoSitzeExceptionV2 {

    public static void main(String[] args) throws FalscheParameter {

            AutoSitz validSeat1 = new AutoSitz(false, "rot");
            System.out.println("1. Sitz produziert!");
            AutoSitz validSeat2 = new AutoSitz(true, "schwarz");
            System.out.println("2. Sitz produziert!");
            AutoSitz validSeat3 = new AutoSitz(true, "blau");
            System.out.println("3. Sitz produziert!");
            AutoSitz validSeat4 = new AutoSitz(false, "blau");
            System.out.println("4. Sitz produziert!");

        System.out.println("Ende der Autositz-produktion!");
    }
}
