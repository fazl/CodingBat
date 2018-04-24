/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */

public class DelDel {
    static String delDel(String s){
        return "TODO"; // Delete this line and add your code
    }

    public static void main(String[] args) {

        Verify.check("abc".equals(delDel("adelbc")));
        Verify.check("aHello".equals(delDel("adelHello")));
        Verify.check("adedbc".equals(delDel("adedbc")));
        System.out.println("DelDel tests OK");
    }
}