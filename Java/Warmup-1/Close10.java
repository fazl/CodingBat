/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */

public class Close10 {

    static int close10(int i1, int i2){
        return 0; // Remove this line and add your code
    }

    public static void main(String[] args) {
        Verify.check( 8 == close10(8,13));
        Verify.check( 8 == close10(13,8));
        Verify.check( 0 == close10(13,7));
        System.out.println("Close10 tests OK");
    }
}
