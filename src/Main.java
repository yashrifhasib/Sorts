import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        int[] scrambled = { 654, 6541, 978, 614, 415, 123, 48};
        String[] scrambledString = { "Yashrif", "Nukem", "Dukem", "Bookem" };
        Sorts.Unscrambler( scrambled );
        Sorts.Unscrambler( scrambledString );
        System.out.println( Arrays.toString( scrambled ) );
        System.out.println( Arrays.toString( scrambledString ) );
    }
}
