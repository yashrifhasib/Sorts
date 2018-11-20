import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        int[] scrambled = { 654, 6541, 978, 614, 415, 123, 48};
        String[] scramble = { "Yashrif", "Nukem", "Dukem", "Bookem" };
        Sorts.Unscrambler( scrambled );
        Sorts.Unscrambler( scramble );
        System.out.println( Arrays.toString( scrambled ) );
        System.out.println( Arrays.toString( scramble ) );
    }
}
