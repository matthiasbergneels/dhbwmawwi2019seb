package chapter7;

public class TravelAgency {

    public static void main(String[] args){

        Bookable[] bookableThings = new Bookable[5];

        Hotel myHotel = new Hotel(100);

        myHotel.cleanRooms();
        System.out.println("Mein Hotel - freie Plätze: " + myHotel.freeSlots());

        System.out.println("Passt Hotel zu Bookable: " + (myHotel instanceof Bookable));

        bookableThings[0] = myHotel;
        bookableThings[1] = new Hotel(250);
        bookableThings[2] = new Plane(120);
        bookableThings[3] = new Plane(99);



        for(Bookable bookableThing : bookableThings){
            if(bookableThing != null) {
                System.out.println("Freie Plätze: " + bookableThing.freeSlots());

                try {
                    System.out.println("Jetzt wird gebucht.");
                    bookableThing.book(101);
                    System.out.println("Buchung war erfolgreich!");
                }catch(NotEnoughFreeSlots e){
                    System.out.println(e.getMessage());

                    try {
                        bookableThing.book(e.getFreeSlotsLeft());
                        System.out.println("Trotzdem " + e.getFreeSlotsLeft() + " gebucht!");
                    }catch(NotEnoughFreeSlots e1){
                        System.out.println("Da war noch jemand schneller - nicht mehr genug frei!");
                    }
                    return;
                }finally{
                    System.out.println("Finally wird immer ausgeführt!!");
                }

                System.out.println("Freie Plätze: " + bookableThing.freeSlots());

                // nicht sichtbar in Bookable Interface
                //bookableThing.cleanRooms();

                if (bookableThing instanceof Plane) {
                    Plane myPlane = (Plane) bookableThing;
                    myPlane.fly();
                }
            }
            System.out.println("Ende des Schleifen-Durchlaufs!");
        }

        System.out.println("Ende der main-Methode!");
    }
}
