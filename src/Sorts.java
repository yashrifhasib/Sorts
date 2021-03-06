public class Sorts {
    public static void Unscrambler( int[] scrambled ) {
        for (int i = 0; i < scrambled.length - 1; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < scrambled.length; j++) {
                if (scrambled[ j ] < scrambled[ lowPosition ]) {
                    lowPosition = j;
                }
            }
            swap(i, lowPosition, scrambled);
        }
    }

    public static void Unscrambler( String[] scrambled ) {
        for (int i = 0; i < scrambled.length - 1; i++) {
            int lowPosition = i;
            for (int j = i + 1; j < scrambled.length; j++) {
                if ( scrambled[ j ].compareToIgnoreCase( scrambled[ lowPosition ] ) < 0 ) {
                    lowPosition = j;
                }
            }
            swap(i, lowPosition, scrambled);
        }
    }

    private static void swap( int indexOne, int indexTwo, int[] arr ) {
        int temp = arr[ indexOne ];
        arr[ indexOne ] = arr[ indexTwo ];
        arr[ indexTwo ] = temp;
    }

    private static void swap( int indexOne, int indexTwo, String[] arr ) {
        String temp = arr[ indexOne ];
        arr[ indexOne ] = arr[ indexTwo ];
        arr[ indexTwo ] = temp;
    }
}
