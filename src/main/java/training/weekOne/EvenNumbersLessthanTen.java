package training.weekOne;

/**
 * Program to find even numbers from one to ten
 */

public class EvenNumbersLessthanTen {
    public static void main(String[] args){
        for(int x=1;x<=10;x++){
            if(x%2==0) {
                System.out.println("\n x=" + x);
            }
        }
    }
}
