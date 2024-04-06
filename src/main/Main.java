package main;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double startTime, endTime;
        double duration;
        System.out.println("Hello, choose the task that you want to run 1-10: ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("It is the first problem input:");
            System.out.println("Input number of elements: ");
            int q = sc.nextInt();
            System.out.println("Input the array: ");
            int[] arr = new int[q];
            for (int i = 0; i < q; i++) {
                arr[i] = sc.nextInt();
            }
            startTime = System.nanoTime();
            int result = findMinimum(q, arr);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Minimum element is: " + result);
            System.out.println("Time complexity: O(n), where n is the length of the array.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 2){
            System.out.println("It is the second problem input:");
            System.out.println("Input number of elements: ");
            int length = sc.nextInt();
            System.out.println("Input the array: ");
            int[] a = new int[length];
            for (int i = 0; i < length; i++) {
                a[i] = sc.nextInt();
            }
            startTime = System.nanoTime();
            double result = findAverage(length, a);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Average value is: " + result);
            System.out.println("Time complexity: O(n), where n is the length of the array.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 3){
            System.out.println("It is the third problem input:");
            System.out.println("Input your number: ");
            int b = sc.nextInt();
            startTime = System.nanoTime();
            String result = isPrime(b);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Your given number is " + result);
            System.out.println("Time complexity: O(sqrt(n)), where n is the given number");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 4){
            System.out.println("It is the fourth problem input:");
            System.out.println("Input your number to calculate its factorial: ");
            int c = sc.nextInt();
            startTime = System.nanoTime();
            int result = factorial(c);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Factorial of a given number is: " + result);
            System.out.println("Time complexity: O(n), where n is the given number");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 5){
            System.out.println("It is the fifth problem input:");
            System.out.println("Input your n-th position in Fibonacci sequence: ");
            int t = sc.nextInt();
            startTime = System.nanoTime();
            int result = findFibonacci(t);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("The element in Fibonacci sequence: " + result);
            System.out.println("Time complexity: O(2^n), where n is the given number");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 6){
            System.out.println("It is the sixth problem input:");
            System.out.println("Input your base number: ");
            int d = sc.nextInt();
            System.out.println("Input your exponent number: ");
            int e = sc.nextInt();
            startTime = System.nanoTime();
            int result = power(d, e);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Base number to the power of exponent is: " + result);
            System.out.println("Time complexity: O(log n), where n is the exponent");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 7){
            System.out.println("It is the seventh problem input: ");
            System.out.println("Input the number of elements: ");
            int size = sc.nextInt();
            System.out.println("Input your array to be reversed: ");
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Reversed sequence: ");
            startTime = System.nanoTime();
            reverseSequence(size - 1, arr);
            System.out.println();
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("Time complexity: O(n), where n is the length of the array.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 8){
            System.out.println("It is the eighth problem input:");
            System.out.println("Input the string: ");
            sc.nextLine();
            String s = sc.nextLine();
            startTime = System.nanoTime();
            String result = checkForDigits(s, 0);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("String contains only digits(y/n): " + result);
            System.out.println("Time complexity: O(n), where n is the length of the string.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 9){
            System.out.println("It is the ninth problem input:");
            System.out.println("Input your coefficients: ");
            int f = sc.nextInt();
            int k = sc.nextInt();
            startTime = System.nanoTime();
            int result = binomialCoefficient(f, k);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("The binomial coefficient is: " + result);
            System.out.println("Time complexity: O(2^n), where n equals or greater than k.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }

        if(n == 10){
            System.out.println("It is the tenth problem input:");
            System.out.println("Input your numbers to find gcd: ");
            int o = sc.nextInt();
            int p = sc.nextInt();
            startTime = System.nanoTime();
            int result = gcd(o, p);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000;
            System.out.println("GCD is: " + result);
            System.out.println("Time complexity: O(log(min(a, b)) where a and b are input numbers.");
            System.out.println("Time taken: " + duration+ " milliseconds.");
        }
    }


    /**
     * This method evaluates the minimum element in the array.
     * It uses the loop to go through the whole array.
     * Time complexity: O(n), where n is the length of the array.
     * The method iterates through whole array from 1-st to the n-th element only once,
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
     * The method iterates through whole array from 1-st to the n-th element only once,
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
     * This algorithm iterates only from 2 to the square root of the given number in the loop only once,
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

    /**
     * This method evaluates the factorial of a given number.
     * Is uses the recursion to iterate through each number.
     * Time complexity: O(n), where n is the given number.
     * This method iterates through each number from 1 to n only once,
     * which causes the linear time complexity.
     * @param n The number for which we calculate the factorial
     * @return The factorial of the input number.
     */
    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    /**
     * This method calculates the nth Fibonacci number.
     * It uses a recursion to iterate through whole sequence.
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm calls itself twice in one call which causes the binary tree,
     * where each node has two children, resulting in exponential time complexity.
     * @param n The position in the Fibonacci sequence for which the number is to be calculated.
     * @return The nth Fibonacci number in the sequence.
     */
    public static int findFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }

    /**
     * This method calculates the power of a number to a given exponent.
     * It uses a recursive approach optimized with exponentiation.
     * Time complexity: O(log n), where n is the power.
     * This recursive algorithm reduces the number of iterations by using the case
     * where n is even, so we can reduce the problem to calculating a^(n/2)once,
     * and then squaring the result, rather than calculating a multiplied by itself n times,
     * which resulting in logarithmic time complexity, not a linear.
     * @param a The base that is to be raised to the power of n.
     * @param n The exponent to which the base a is to be raised.
     * @return The result of raising a to the power of n.
     */
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        else if(n % 2 == 0){
            int half = power(a, n / 2);
            return half * half;
        }
        else{
            return a * power(a, n - 1);
        }
    }

    /**
     * This method prints the elements of a given array in reverse order.
     * It uses a recursive approach to iterate through each element.
     *
     * Time complexity: O(n), where n is the length of the array.
     * This is because the recursive method is called once for each element in the array.
     * @param index The starting index to begin the reverse sequence, usually the last index of the array.
     * @param sequence The array of integers to be printed in reverse.
     */
    public static void reverseSequence(int index, int[] sequence) {
        if (index < 0) {
            return;
        }
        System.out.print(sequence[index] + " ");
        reverseSequence(index - 1, sequence);
    }

    /**
     * This method checks if all characters in the string are digits.
     * It uses recursive approach to iterate through each character of the string.
     *
     * Time complexity: O(n), where n is the length of the given string.
     * The recursive algorithm checks each character of the string,
     * resulting in linear time complexity.
     * @param s The string to be checked.
     * @param index The current position in the string.
     * @return "Yes" if all characters in the string are digits, "No" otherwise.
     */
    public static String checkForDigits(String s, int index){
        if(index == s.length()){
            return "Yes";
        }
        if(!Character.isDigit(s.charAt(index))){
            return "No";
        }
        return checkForDigits(s, index + 1);
    }

    /**
     * This method calculates binomial coefficient (n choose k) of two given number.
     * The method uses the recursive property of binomial coefficients,
     * where each coefficient is the sum of the two coefficients above it.
     *
     * Time complexity: O(2^n), where n greater or equals k.
     * The algorithm calls itself twice at each execution which causes binary tree,
     * so, as the result the time complexity of this code exponential.
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient for the given values of n and k.
     */
    public static int binomialCoefficient(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        return binomialCoefficient(n -1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * This method calculates the gcd of two given number by using Euclidean Algorithm.
     * The Euclidean algorithm is based on the principle that the GCD of two numbers also divides their difference.
     * This method applies this principle recursively.
     *
     * Time complexity: O(log(min(a, b)) where a and b are input numbers.
     * The algorithm's time complexity
     * is logarithmic in the smaller of the two numbers because with each recursive call, the second parameter 'b'
     * becomes the remainder of 'a' divided by 'b', which is strictly less than 'b' and reduces quickly.
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}