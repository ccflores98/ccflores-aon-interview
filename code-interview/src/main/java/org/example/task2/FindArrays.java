package org.example.task2;


public class FindArrays {

    public static void main(String[] args) {
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {7, 8};


        System.out.println("Starting Index: " + findStartingIndexOfSubArray(array, subArray));

    }

    static int findStartingIndexOfSubArray(int[] array, int[] subArray) {
        int n = array.length;
        int m = subArray.length;

        if (m > n) return -1; // If subarray is longer, return -1

        // Iterate through the main array, considering subarray-sized chunks
        for (int i = 0; i <= n - m; i++) {
            // Assume a match is found for this chunk
            boolean match = true;

            // Iterate through the subarray
            for (int j = 0; j < m; j++) {

                // If a mismatch is found, set match to false and break the loop
                if (array[i + j] != subArray[j]) {
                    match = false;
                    break;
                }
            }

            // If a match is found, return the starting index of the subarray
            if (match)  {
                return i;
            }
        }

        return -1; // No Match found
    }


}
