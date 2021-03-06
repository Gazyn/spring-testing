package ee.bitweb.testingsample.common.util;

import java.security.SecureRandom;

public final class StringUtil {

    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    private static final SecureRandom RANDOM = new SecureRandom();

    private StringUtil() {
    }

    public static String random(int length) {
        StringBuilder sb = new StringBuilder();

        while (sb.length() < length) {
            int index = RANDOM.nextInt(CHARS.length());
            sb.append(CHARS.charAt(index));
        }

        return sb.toString();
    }
}
