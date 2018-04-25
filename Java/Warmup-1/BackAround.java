//import static Verify.check;
/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

public class BackAround {

    static String backAround(String s){
        if(s.length() == 0){
            return "";
        }

        char last = s.charAt(s.length()-1);

        return last+s+last;  //Remove this line and add your code
    }

    public static void main(String[] args) {
        Verify.checkEquals( backAround("cat"),   "tcatt" );
        Verify.checkEquals( backAround("Hello"), "oHelloo" );
        Verify.checkEquals( backAround("a"),     "aaa");
        System.out.println("BackAround tests OK");
    }
}
