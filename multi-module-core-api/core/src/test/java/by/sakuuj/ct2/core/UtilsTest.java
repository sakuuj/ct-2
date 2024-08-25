package by.sakuuj.ct2.core;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Nested
    class isAllPositiveNumbers_String$VarArgs$ {

        @Test
        void shouldReturnTrue_OnAllPositiveNumbers() {
            // given
            String[] passedPositiveNumbers = {"324", "243.243", "11.0e34"};
            boolean expected = true;

            // when
            boolean actual = Utils.isAllPositiveNumbers(passedPositiveNumbers);

            // then
            assertEquals(expected, actual);

        }

    }

}