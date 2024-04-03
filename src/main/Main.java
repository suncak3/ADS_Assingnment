package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It is the first problem input");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMinimum(n, arr));

        System.out.println("It is the second problem input");
        int length = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findAverage(length, a));

        System.out.println("It is the third problem input");
        int b = sc.nextInt();
        System.out.println(isPrime(b));
    }


    /**
     * This method evaluates the minimum element in the array.
     * It uses the loop to go through the whole array.
     * Time complexity: O(n), where n is the length of the array.
     * The method iterates through whole array from 1-st to the n-th element,
     * resulting in linear time complexity.
     * @param length the length of the array.
     * @param arr the given array from which we wind the minimum.
     * @return The minimum element of the given array.
     */
    public static int findMinimum(int length, int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * This method evaluates the average value of the elements in the array.
     * It uses the for loop to go through each element inside the array and calculate their sum.
     * Time complexity: O(n), where in is the length of the array.
     * The method iterates through whole array from 1-st to the n-th element,
     * resulting in linear time complexity.
     * @param length the length of the array.
     * @param arr the given array from which we find average value.
     * @return The average value of the elements in the given array.
     */
    public static double findAverage(double length, int[] arr){
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }

    /**
     * This method determines either the given number is prime or not.
     * It uses the for loop to iterate through each number to the square root of a given number.
     * The loop reaches the square root of the number to reduce the number of iterations,
     * since we will still check all possible divisors of the number when we reach its root.
     * Time complexity: O(sqrt(n)), where n is the given number.
     * This algorithm iterates only from 2 to the square root of the given number in the loop,
     * resulting in square root time complexity and makes it really efficient, especially for large numbers.
     * @param n The number to check for being prime or not.
     * @return The String to indicate the result of check.
     */
    public static String isPrime(int n){
        if(n <= 1){
            return "Neither prime nor composite";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return "Composite";
            }
        }
        return "Prime";
    }
}