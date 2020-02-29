package tasks.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        assertEquals("54321", ReverseString.reverseString("12345"));
        assertEquals("q", ReverseString.reverseString("q"));
        assertEquals("", ReverseString.reverseString(""));
        assertEquals("df", ReverseString.reverseString("fd"));
        assertEquals("65ref", ReverseString.reverseString("fer56"));
    }
}