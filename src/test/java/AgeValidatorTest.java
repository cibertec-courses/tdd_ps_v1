
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeValidatorTest {

    //TC: should return true when age is 18 or more
    @Test
    @DisplayName("should return true when age is 18 or more")
    void shouldReturnTrueWhenAdult(){
        AgeValidator validator = new AgeValidator();
        assertTrue(validator.isAdult(18));
    }

    //TC: should return false when age is less than 18
    @Test
    @DisplayName("should return false when age is less than 18")
    void shouldReturnFalseWhenMinor(){
        AgeValidator validator = new AgeValidator();
        assertFalse(validator.isAdult(16));
    }

}
