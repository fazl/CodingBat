//import static Verify.check;
/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

public class BackAround {
    static String backAround(String s){
        return "TODO";  //Remove this line and add your code
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        Verify.check("tcatt".equals( backAround("cat") ));
        Verify.check("oHelloo".equals( backAround("Hello") ));
        Verify.check("aaa".equals( backAround("a") ));

    }
}
