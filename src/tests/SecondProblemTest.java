package tests;

import  static org.junit.jupiter.api.Assertions.*;

import main.Main;
import org.junit.jupiter.api.Test;

public class SecondProblemTest {
    @Test
    void a(){
        int[] arr = {3, 2, 4, 1};
        assertEquals(2.5, Main.findAverage(arr.length,arr));
    }

    @Test
    void b(){
        int[] arr = {0, 0, 0, 0, 0};
        assertEquals(0.0, Main.findAverage(arr.length,arr));
    }

    @Test
    void c(){
        int[] arr = {8, -2, 4, 0};
        assertEquals(2.5, Main.findAverage(arr.length,arr));
    }
}
