/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

Hints: Useful String methods include: length, substring, toUpperCase
toUpperCase() returns the uppercase version of a string, it does not change the string
 */

public class EndUp {
    static String endUp( String s ){
        return "banana";  // Delete this line and replace with your own code
    }

    // DON'T CHANGE THIS CODE:
    public static void main(String[] args) {
        Verify.checkEquals(endUp("Hello"),      "HeLLO");
        Verify.checkEquals(endUp("hi there"),   "hi thERE");
        Verify.checkEquals(endUp("hi"), "HI");
        System.out.println("EndUp tests OK");

    }
}
