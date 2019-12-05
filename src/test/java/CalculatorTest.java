import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(9,multiply(3,3));
        assertEquals(32,multiply(2,2,2,2,2));
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(2, add(1,1));
        assertEquals(5, add(1,1,1,1,1));
    }
}