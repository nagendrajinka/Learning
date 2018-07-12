package training.weekTwo;

/**
 * Program to add two strings letter by letter
 */

public class JoiningTwoStrings {
    public static void TwoStrings() {
        String s1 = "abcd";
        String s2 = "efgh";
        String s3 = " ";
        int len = s1.length() + s2.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                s3 += s1.charAt(i / 2);
            } else {
                s3 += s2.charAt((i - 1) / 2);
            }
        }
        System.out.println(s3);
    }
    public static void main(String[] args) {
        TwoStrings();
    }
}
