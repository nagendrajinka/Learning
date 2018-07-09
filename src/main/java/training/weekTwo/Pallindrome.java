package training.weekTwo;

/**
 * Pallindrome program
 */

public class Pallindrome {

    public static boolean isPallindrome(String name) {
        for(int i=0; i<name.length(); i++) {
            if (name.charAt(i) != name.charAt((name.length()-1)-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("madam"));
    }
}