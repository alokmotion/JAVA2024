package com.learn.Arrays;

public class CountSmallerElement {

    public static void main(String[] args) {
        int arr[] = {12, 1, 2, 3, 0, 11, 4};
        int ans[] = new int[arr.length];

        // Loop over each element
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // Compare with elements to the right
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            ans[i] = count; // Store the count in the ans array
        }

        // Print the result
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
