package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArithmeticTest {
    Arithmetic calc = new Arithmetic();
    @Test
    public void testAdd() { assertEquals(5, calc.add(2, 3)); }
}