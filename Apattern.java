// public class Apattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= 9; j++) {

//                 // Conditions for printing star
//                 if ((j == 6 - i) || (j == 4 + i) || (i == 3 && j >= 3 && j <= 7)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // ← This must be OUTSIDE inner loop
//         }
//     }
// }

// public class Apattern {
//     public static void main(String[] args) {

//         int n = 7;  // Letter Size

//         for (int i = 0; i < n; i++) {

//             // ********** S **********
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n / 2 || i == n - 1 ||
//                     (j == 0 && i < n / 2) ||
//                     (j == n - 1 && i > n / 2)) {
//                     System.out.print("*");
//                 } else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** H **********
//             for (int j = 0; j < n; j++) {
//                 if (j == 0 || j == n - 1 || i == n / 2)
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** I **********
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1 || j == n / 2)
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** V **********
//             for (int j = 0; j < n; j++) {
//                 if ((j == i && i < n - 1) ||
//                     (j == n - i - 1 && i < n - 1) ||
//                     (i == n - 1 && j == n / 2))
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** A **********
//             for (int j = 0; j < n; j++) {
//                 if ((i == 0 && j > 0 && j < n - 1) ||
//                     (j == 0 && i > 0) ||
//                     (j == n - 1 && i > 0) ||
//                     (i == n / 2))
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** N **********
//             for (int j = 0; j < n; j++) {
//                 if (j == 0 || j == n - 1 || j == i)
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** I **********
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1 || j == n / 2)
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }

//             System.out.println();
//         }
//     }
// }


// public class Apattern {
//     public static void main(String[] args) {

//         int n = 7;

//         for (int i = 0; i < n; i++) {

//             // ********** A **********
//             for (int j = 0; j < n; j++) {
//                 if ((i == 0 && j > 0 && j < n - 1) ||
//                     (j == 0 && i > 0) ||
//                     (j == n - 1 && i > 0) ||
//                     (i == n / 2))
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** Y **********
//             for (int j = 0; j < n; j++) {
//                 if ((i <= n / 2 && (j == i || j == n - i - 1)) ||
//                     (i > n / 2 && j == n / 2))
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** A **********
//             for (int j = 0; j < n; j++) {
//                 if ((i == 0 && j > 0 && j < n - 1) ||
//                     (j == 0 && i > 0) ||
//                     (j == n - 1 && i > 0) ||
//                     (i == n / 2))
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.print("   ");

//             // ********** Z **********
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1 || j == n - i - 1)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }

//             System.out.println();
//         }
//     }
// }

public class Apattern {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 0; i < n; i++) {

            // ********** J **********
            for (int j = 0; j < n; j++) {
                if (i == 0 || 
                    (j == n/2) || 
                    (i == n-1 && j < n/2) ||
                    (j == 0 && i > n/2)) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.print("   ");

            // ********** A **********
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) ||
                    (j == 0 && i > 0) ||
                    (j == n - 1 && i > 0) ||
                    (i == n / 2))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // ********** A **********
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) ||
                    (j == 0 && i > 0) ||
                    (j == n - 1 && i > 0) ||
                    (i == n / 2))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("   ");

            // ********** N **********
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i)
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}

