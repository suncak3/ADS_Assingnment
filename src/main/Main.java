package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMinimum(n, arr));
    }


    /**
     *This method evaluates the minimum element in the array.
     * It uses the loop to go through the whole array.
     * Time complexity: O(n), where n is the length of the array.
     * The function iterates through whole array from 1-st to the n-th element,
     * resulting in linear asymptotic.
     * @param size the length of the array.
     * @param arr the given array from which we wind the minimum.
     * @return The minimum element of the given array.
     */
    public static int findMinimum(int size, int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}