import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calc calc = new Calc();
        assertEquals(4, calc.add(2,2));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calc calc = new Calc();
        assertEquals(2, calc.add(4,2));
    }
}