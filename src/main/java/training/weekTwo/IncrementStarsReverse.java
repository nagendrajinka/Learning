package training.weekTwo;

/**
 * Program to increment star pattern in reverse order
 */

public class IncrementStarsReverse {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
