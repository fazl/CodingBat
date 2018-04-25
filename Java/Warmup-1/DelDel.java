/*
Given a string, if the string "del" appears starting at index 1,
then return a string where that "del" has been deleted. Otherwise,
return the string unchanged.

delDel("adelbc")            → "abc"
delDel("adeliciousMeal")    → "aiciousMeal"
delDel("adedbc")            → "adedbc"
delDel("appledelta")        → "appledelta"

Hints: Useful String methods include: indexOf, length, replaceFirst, substring
 */

public class DelDel {
    static String delDel(String s){

        return "TODO"; // Delete this line and add your code

    }

    public static void main(String[] args) {

        Verify.checkEquals( delDel("adelbc"         ),  "abc"           );
        Verify.checkEquals( delDel("adeliciousMeal" ),  "aiciousMeal"   );
        Verify.checkEquals( delDel("adedbc"         ),  "adedbc"        );
        Verify.checkEquals( delDel("appledelta"     ),  "appledelta"    );
        System.out.println("DelDel tests OK");
    }
}