public class Verify {
    public static void check(boolean condition){
        if(!condition){
            throw new IllegalStateException("Supplied condition not true");
        }
    }
    public static void check(boolean condition, String description){
        if(!condition){
            throw new IllegalStateException(description);
        }
    }
    public static void checkEquals(String a, String b){
        check(a != null && a.equals(b));
    }
}
