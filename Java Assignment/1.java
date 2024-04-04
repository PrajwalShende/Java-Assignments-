//  Merge two arrays by satisfying given constraints
// Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
//  merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

import java.util.Arrays;

public class MergeArrays {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
       
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
        // Merge X and Y
        int i = n, j = 0, index = 0;
        while (i < m && j < n) {
            if (X[i] <= Y[j]) {
                X[index++] = X[i++];
            } else {
                X[index++] = Y[j++];
            }
        }
        
       
        while (j < n) {
            X[index++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        // Merge arrays
        mergeArrays(X, Y);
        
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
