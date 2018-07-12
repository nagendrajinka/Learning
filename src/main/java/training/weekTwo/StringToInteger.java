package training.weekTwo;

public class StringToInteger {
    public static void String1() {
        String s1 = "12345";
        int x=0;
        for (int i = 0; i < s1.length(); i++) {
            x = x*10+s1.charAt(i)-'0';
        }
        System.out.println(x);
    }
    public static void main(String[] args){
        String1();
    }
}
