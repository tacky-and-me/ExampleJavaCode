package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.App;
import com.example.Sub;

public class SubTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testHelloWorld() {
        Sub sub = new Sub();
        String s = sub.printSub();
        String expected = "Hello Class!";
        System.out.println("Hellow Class Test");
        System.out.println(s);
        assertEquals(s, expected);
    }
}
