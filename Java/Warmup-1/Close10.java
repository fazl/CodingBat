/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */

public class Close10 {

    // WRITE YOUR CODE IN THIS METHOD
    static int close10(int i1, int i2){
        return 0; // Remove this line and add your code
    }


    // DO NOT MODIFY THIS METHOD
    public static void main(String[] args) {
        Verify.check( close10(8,13) == 8 );
        Verify.check( close10(13,8) == 8 );
        Verify.check( close10(13,7) == 0 );
        System.out.println("Close10 tests OK");
    }
}
