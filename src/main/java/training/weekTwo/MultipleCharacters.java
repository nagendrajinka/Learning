package training.weekTwo;

public class MultipleCharacters {
    public static void Multiple(){
        String s1="3a4bc";
        for(int i=0;i<s1.length();i++){
            if((s1.charAt(i)>='a')) {
                if(s1.charAt(i-1)<='a'){
                    for (int j = 0; j < s1.charAt(i - 1) - '0'; j++) {
                        System.out.print(s1.charAt(i));
                    }
                } else {
                    System.out.print(s1.charAt(i));
                }
            }
        }
    }
    public static void main(String[] args){
        Multiple();
    }
}
