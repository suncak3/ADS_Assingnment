package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EighthProblemTest {
    @Test
    void a(){
        String s = "123456";
        assertEquals("Yes", Main.checkForDigits(s, 0));
    }

    @Test
    void b(){
        String s = "123a456";
        assertEquals("No", Main.checkForDigits(s, 0));
    }

    @Test
    void c(){
        String s = "123456$";
        assertEquals("No", Main.checkForDigits(s, 0));
    }
}
