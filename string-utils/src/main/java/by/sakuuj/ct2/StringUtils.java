package by.sakuuj.ct2;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {

        double passedNumber;

        try {
            passedNumber = Double.parseDouble(str);
        } catch (RuntimeException ex) {
            return false;
        }

        return Double.compare(passedNumber, 0) > 0;
    }
}