package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SixthProblemTest {
    @Test
    void a(){
        int a = 2;
        int n = 10;
        assertEquals(1024, Main.power(a, n));
    }

    @Test
    void b(){
        int a = 2;
        int n = 0;
        assertEquals(1, Main.power(a, n));
    }

    @Test
    void c(){
        int a = 3;
        int n = 4;
        assertEquals(81, Main.power(a, n));
    }
}

