package chapter7;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookableTest {

    static int seats = 100;
    static private Bookable bookableHotel;
    static private Bookable bookablePlane;

    @BeforeAll
    static void setUpEnv(){

    }

    @BeforeEach
    void setUp() {
        bookableHotel = new Hotel(seats);
        bookablePlane = new Plane(seats);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void freeSlotsHotel() {
        assertEquals(100, bookableHotel.freeSlots());
    }

    @Test
    @DisplayName("Buchung positiv Test")
    void positivBookingHotel() {
        try{
            bookableHotel.book(60);
        }catch(NotEnoughFreeSlots e){
            assertTrue(false, "NotEnoughFreeSlots Exception thrown!");
        }
        assertEquals(40, bookableHotel.freeSlots());
    }

    @Test
    @DisplayName("Buchung positiv Test - ohne Ausnahme")
    void positivBookingHotelNoException() {
        assertDoesNotThrow(()->{
            bookableHotel.book(60);
        });
        assertEquals(40, bookableHotel.freeSlots());
    }

    @Test
    void failingBookingHotel() {
        int seatsToBook = 101;
        String expectedExceptionMessage = "Es wurde versucht " + seatsToBook + " Slots zu buchen; freie Slots " + seats;

        try{
            bookableHotel.book(seatsToBook);
        }catch(Exception e){
            assertTrue(e instanceof NotEnoughFreeSlots);
            assertEquals(expectedExceptionMessage, e.getMessage());
        }
        assertEquals(100, bookableHotel.freeSlots());
    }

    @Test
    void failingBookingHotelException(){

        assertThrows(NotEnoughFreeSlots.class, () -> {
            bookableHotel.book(101);
        });
    }

    @Test
    void freeSlotsPlane() {
        assertEquals(100, bookablePlane.freeSlots());
    }

    @Test
    void failingBookingPlane() {
        //assertFalse(bookablePlane.book(101));
        assertEquals(100, bookablePlane.freeSlots());
    }
}