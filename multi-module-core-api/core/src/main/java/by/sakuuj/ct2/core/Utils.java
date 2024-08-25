package by.sakuuj.ct2.core;

import by.sakuuj.ct2.StringUtils;

public class Utils {

    private Utils() {}

    public static boolean isAllPositiveNumbers(String... strings) {

        for (var str : strings) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }

        return true;
    }
}