package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FifthProblemTest {
    @Test
    void a(){
        int n = 5;
        assertEquals(5, Main.findFibonacci(n));
    }

    @Test
    void b(){
        int n = 17;
        assertEquals(1597, Main.findFibonacci(n));
    }

    @Test
    void c(){
        int n = 0;
        assertEquals(0, Main.findFibonacci(n));
    }
}
