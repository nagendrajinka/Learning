package training.weekTwo;

/**
 * Program for finding the sum of first hundred prime numbers
 */

public class SumOfPrimeNumbers {

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
        }
        return true;
    }


    public static void main(String[] args) {
        int i = 0, sum = 0;
        int prime = 2;
        while (i < 100) {
            if (isPrimeNumber(prime)) {
                System.out.println(prime);
                i++;
                sum += prime;
            }
            prime++;
        }
        System.out.println("total=" + sum);
    }
}



