import java.util.*;

public class vertically {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2; // One way to place all tiles horizontally, one way to place them vertically.
        }

        if (n < m) {
            return 1; // Only one way to place them vertically.
        }

        // Place a tile vertically (reducing height by m)
        int vertPlacements = placeTiles(n - m, m);

        // Place a tile horizontally (reducing height by 1)
        int horPlacements = placeTiles(n - 1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2; // Example input
        System.out.println(placeTiles(n, m)); // Output should be the number of ways to place tiles.
    }
}