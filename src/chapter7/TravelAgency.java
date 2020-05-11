package chapter7;

public class TravelAgency {

    public static void main(String[] args) {

        Bookable[] bookableThings = new Bookable[5];

        Hotel myHotel = new Hotel(100);

        myHotel.cleanRooms();
        System.out.println("Mein Hotel - freie Plätze: " + myHotel.freeSlots());


        bookableThings[0] = myHotel;
        bookableThings[1] = new Hotel(250);
        bookableThings[2] = new Plane(120);
        bookableThings[3] = new Plane(99);

        for(Bookable bookableThing : bookableThings){
            if(bookableThing != null){

                System.out.println("Freie Plätze: " + bookableThing.freeSlots());
                System.out.println("Buchung erfolgreich: " + bookableThing.book(101));
                System.out.println("Freie Plätze: " + bookableThing.freeSlots());

                // nicht sichtbar in Bookable Interface
                //bookableThing.cleanRooms();

            }
        }
    }
}
