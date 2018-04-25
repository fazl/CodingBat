/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(25) → 8

Hints: Math.abs is a useful method

 */

public class Diff21 {
    static int diff21( int n ){

        return -999; // Delete this line, and add your own code instead

    }

    // DON'T CHANGE THIS CODE
    public static void main(String[] args) {

        Verify.check(  diff21(19) == 2 );
        Verify.check(  diff21(10) == 11 );
        Verify.check(  diff21(21) == 0 );
        Verify.check(  diff21(25) == 8 );
        System.out.println("Diff21 tests OK");

    }
}
