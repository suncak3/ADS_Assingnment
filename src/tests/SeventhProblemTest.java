package tests;

import main.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeventhProblemTest {
    @Test
    void a(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 4, 6, 2));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(2, 6, 4, 1));
        assertEquals(expected, Main.reversedLinkedList(list.size(),0, list));
    }

    @Test
    void b(){
        assertEquals(new LinkedList<>(), Main.reversedLinkedList(0,0, new LinkedList<>()));
    }

    @Test
    void c(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1));
        assertEquals(list, Main.reversedLinkedList(list.size(),0, list));
    }

    @Test
    void d(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2));
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(2, 1));
        assertEquals(expected, Main.reversedLinkedList(list.size(),0, list));
    }

}
