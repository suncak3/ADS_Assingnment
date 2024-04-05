package main;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("It is the first problem input:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMinimum(n, arr));

        System.out.println("It is the second problem input:");
        int length = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findAverage(length, a));

        System.out.println("It is the third problem input:");
        int b = sc.nextInt();
        System.out.println(isPrime(b));

        System.out.println("It is the fourth problem input:");
        int c = sc.nextInt();
        System.out.println(factorial(c));

        System.out.println("It is the fifth problem input:");
        int t = sc.nextInt();
        System.out.println(findFibonacci(t));

        System.out.println("It is the sixth problem input:");
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(power(d, e));*/

        System.out.println("It is the seventh problem output");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        reversedLinkedList(list.size(),0, list);
        for(Integer el : list){
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("It is the eighth problem input:");
        String s = sc.nextLine();
        System.out.println(checkForDigits(s, 0));

        System.out.println("It is the ninth problem input:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n, k));

        System.out.println("It is the tenth problem input:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
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
     * This method reverses the elements of a given LinkedList.
     * It uses a recursive approach where each call removes the last element
     * and adds it back at the current index.
     *
     * Time complexity: O(n^2), where n is the size of the LinkedList.
     * Each recursive call involves two main operations: removeLast and add.
     * removeLast is O(1) because it simply removes the tail element.
     * The add operation, which inserts the removed element at a specific index,
     * can be up to O(n) because it may need to shift the elements after the insertion point.
     * Since these operations are performed in each recursive call and the number of elements
     * to shift increases as we progress, the total time complexity is quadratic.
     * @param size The number of elements in the LinkedList.
     * @param index The current index for insertion in the recursive call.
     * @param list The LinkedList to be reversed.
     * @return The LinkedList with its elements in reversed order.
     */
    public static LinkedList<Integer> reversedLinkedList(int size, int index, LinkedList<Integer> list){
        if(index == size){
            return list;
        }
        int last = list.removeLast();
        list.add(index, last);
        return reversedLinkedList(size, index + 1, list);
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