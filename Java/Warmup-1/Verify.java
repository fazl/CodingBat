public class Verify {
    public static void check(boolean condition){
        if(!condition){
            throw new IllegalStateException("");
        }
    }
    public static void check(boolean condition, String description){
        if(!condition){
            throw new IllegalStateException(description);
        }
    }
}
