public class DoubleCallCounter {

    // Recursive method to solve the double counter problem
    public static int solveDoubleCounter(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive calls
        return solveDoubleCounter(n - 1) + solveDoubleCounter(1) + solveDoubleCounter(n - 1);
    }

    public static void main(String[] args) {
        // Hardcoded value for demonstration
        int n = 5; // You can change this to test with other values

        // Calculate and print the result
        int result = solveDoubleCounter(n);
        System.out.println("T(" + n + ") = " + result);
    }
}


