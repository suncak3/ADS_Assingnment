package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdProblemTest {
    @Test
    void a(){
        int n = 1;
        assertEquals("Neither prime nor composite", Main.isPrime(n));
    }

    @Test
    void b(){
        int n = 7;
        assertEquals("Prime", Main.isPrime(n));
    }

    @Test
    void c(){
        int n = 10;
        assertEquals("Composite", Main.isPrime(n));
    }
}
