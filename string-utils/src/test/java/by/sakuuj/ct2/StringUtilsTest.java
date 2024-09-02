package by.sakuuj.ct2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Nested
    class isPositiveNumber_String {

        @Test
        void shouldReturnTrue_OnPositiveNumber() {

            // given
            String positiveNumber = "+324.2341e3";

            // when
            boolean actual = StringUtils.isPositiveNumber(positiveNumber);

            // then
            assertTrue(actual);
        }
    }
}