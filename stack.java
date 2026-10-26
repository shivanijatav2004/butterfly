import java.util.*;

public class stack {

    public static int calcPower(int x, int n) {
        if (n == 0) { // Base case 1: x^0 = 1
            return 1;
        }
        if (x == 0) { // Base case 2: 0^n = 0 for n > 0
            return 0;
        }

        // Optimized: Using Exponentiation by Squaring (O(log n))
        int halfPower = calcPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) { // If n is odd, multiply by x once more
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n); // Fix function name
        System.out.println(ans); // Expected Output: 32
    }
}