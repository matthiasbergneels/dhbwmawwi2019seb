package chapter7;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookableTest {

    static private Bookable bookableHotel;
    static private Bookable bookablePlane;

    @BeforeAll
    static void setUpEnv(){

    }

    @BeforeEach
    void setUp() {
        bookableHotel = new Hotel(100);
        bookablePlane = new Plane(100);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void freeSlotsHotel() {
        assertEquals(100, bookableHotel.freeSlots());
    }

    @Test
    void positivBookingHotel() {
        assertTrue(bookableHotel.book(60));
        assertEquals(40, bookableHotel.freeSlots());
    }

    @Test
    void failingBookingHotel() {
        assertFalse(bookableHotel.book(101));
        assertEquals(100, bookableHotel.freeSlots());
    }

    @Test
    void freeSlotsPlane() {
        assertEquals(100, bookablePlane.freeSlots());
    }

    @Test
    void failingBookingPlane() {
        assertFalse(bookablePlane.book(101));
        assertEquals(100, bookablePlane.freeSlots());
    }
}