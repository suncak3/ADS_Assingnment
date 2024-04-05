package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NinthProblemTest {
    @Test
    void a(){
        int n = 2;
        int k = 1;
        assertEquals(2, Main.binomialCoefficient(n, k));
    }

    @Test
    void b(){
        int n = 7;
        int k = 3;
        assertEquals(35, Main.binomialCoefficient(n, k));
    }

    @Test
    void c() {
        int n = 2;
        int k = 0;
        assertEquals(1, Main.binomialCoefficient(n, k));
    }

    @Test
    void d() {
        int n = 3;
        int k = 3;
        assertEquals(1, Main.binomialCoefficient(n, k));
    }
}
