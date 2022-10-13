import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void TwoPlusTwoShouldEqual4(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqual5(){
        var cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }

}