package excurs.unitTests;

import org.junit.jupiter.api.*;

class CalculatorTest {

    static private Calculator testCalculator;

    @BeforeAll
    static void setUpAll(){
        System.out.println("Aufsetzen der Testumgebung für gesamte Klasse");
        testCalculator = new Calculator();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Aufsetzen / erneuern der Testumgebung vor jedem Test");
    }

    @Test
    void add() {
        System.out.println("positiv Test für add Methode");
        int result = testCalculator.add(5, 8);
        Assertions.assertEquals(13, result);
    }

    @Test
    void addNegativtest() {
        System.out.println("negativ Test für add Methode");
        int result = testCalculator.add(5, 8);
        Assertions.assertNotEquals(15, result);
    }

    @Test
    void substract() {
        System.out.println("Test für substract Methode");
        int result = testCalculator.substract(5, 8);
        Assertions.assertEquals(-3, result);
    }

    @Test
    void multiply() {
        System.out.println("Test für multiply Methode");
        int result = testCalculator.multiply(5, 2);
        Assertions.assertEquals(10, result);
    }

    @Test
    void divide() {
        System.out.println("Test für divide Methode");
        double result = testCalculator.divide(10, 2);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    void divide2() {
        System.out.println("Test für divide Methode");
        double result = testCalculator.divide(9, 2);
        Assertions.assertEquals(4.5, result);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Aufräumen der Testumgebung nach jedem Test");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Aufräumen der Testumgebung nach ALLEN Tests");
    }
}