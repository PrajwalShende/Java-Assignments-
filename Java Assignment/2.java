// Q2:Find maximum sum path involving elements of given arrays
// Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
// We can start from either array, but we can switch between arrays only through its common elements.

// For example,

// Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
// Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }  
// The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100 
// The maximum sum is 199


public class MaximumSumPath {
    // Function to find maximum sum path involving elements of given arrays
    public static int maximumSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;

        // Traverse both arrays
        while (i < m && j < n) {
            
            if (X[i] == Y[j]) {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            } else if (X[i] < Y[j]) { /
                sumX += X[i++];
            } else { 
                sumY += Y[j++];
            }
        }

        // Add remaining elements of X[] and Y[]
        while (i < m) {
            sumX += X[i++];
        }
        while (j < n) {
            sumY += Y[j++];
        }

        // Add maximum of sumX and sumY to result
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        // Find maximum sum path
        int maxSum = maximumSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);
    }
}
