import java.util.*;

public class jvm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Added Scanner object

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        
        // Print a specific element
        System.out.println("Element at index 3: " + arr[3]);

        // Input using for loop
        System.out.println("Enter 5 integers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print entire array using Arrays.toString()
        System.out.println("Array elements: " + Arrays.toString(arr));

        // Print using enhanced for-loop
        System.out.print("Array elements using loop: ");
        for(int num : arr) { 
            System.out.print(num + " ");
        }

        System.out.println(); // Print new line
        sc.close(); // Close the scanner
    }
}