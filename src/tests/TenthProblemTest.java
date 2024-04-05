package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TenthProblemTest {
    @Test
    void a() {
        int a = 32;
        int b = 48;
        assertEquals(16, Main.gcd(a, b));
    }

    @Test
    void b() {
        int a = 10;
        int b = 7;
        assertEquals(1, Main.gcd(a, b));
    }

    @Test
    void c() {
        int a = 2;
        int b = 0;
        assertEquals(a, Main.gcd(a, b));
    }

    @Test
    void d() {
        int a = 3;
        int b = 3;
        assertEquals(3, Main.gcd(a, b));
    }
}
