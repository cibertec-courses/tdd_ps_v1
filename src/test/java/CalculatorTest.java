import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Should return sum of two numbers")
    void shouldReturnSum(){
        Calculator calculator = new Calculator();
        int result = calculator.add(5,5);
        assertEquals(10, result);
    }
}
