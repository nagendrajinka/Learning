package training.weekTwo;

/**
 * Program to count multiple characters in a string
 */


public class MultipleCharectersToIntegers {
    public static void Single() {
        String s1 = "aaabbbbc";
        int i = 0, count = 0;
        while (i < s1.length() - 1) {
            if (s1.charAt(i) == s1.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(count + 1);
                System.out.print(s1.charAt(i));
                count = 0;
            }
            i++;
        }
        if (s1.charAt(i - 1) != s1.charAt(i)) {
            System.out.println(s1.charAt(i));
        } else {
            System.out.print(count + 1);
            System.out.println(s1.charAt(i));
        }
    }

    public static void main(String[] args){
        Single();
    }
}
