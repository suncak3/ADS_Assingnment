package tests;

import  static org.junit.jupiter.api.Assertions.*;

import main.Main;
import org.junit.jupiter.api.Test;

public class FirstProblemTest {
    @Test
    void a(){
        int[] arr = {10, 1, 32, 3, 45};
        assertEquals(1, Main.findMinimum(arr.length,arr));
    }

    @Test
    void b(){
        int[] arr = {12, -1, 0, 2, -2};
        assertEquals(-2, Main.findMinimum(arr.length,arr));
    }

    @Test
    void c(){
        int[] arr = {10, 3, 4, 228, 5, 0};
        assertEquals(0, Main.findMinimum(arr.length,arr));
    }
}
