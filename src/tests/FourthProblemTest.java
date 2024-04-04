package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourthProblemTest {
    @Test
    void a(){
        int n = 0;
        assertEquals(1, Main.factorial(n));
    }

    @Test
    void b(){
        int n = 5;
        assertEquals(120, Main.factorial(n));
    }

    @Test
    void c(){
        int n = 3;
        assertEquals(6, Main.factorial(n));
    }
}
