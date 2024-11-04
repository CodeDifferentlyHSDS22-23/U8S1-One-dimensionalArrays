package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.ArrayPractice;

public class ArrayTest {
    @Test
    public void arrayTest01(){
        String expected = "Accessing Elements of Array:\n" +
                "First Element: 12\n" +
                "Second Element: 4\n" +
                "Third Element: 5\n" +
                "Fourth Element: 2\n" +
                "Fifth Element: 5";

        String actual = ArrayPractice.arrayPractice();
        Assertions.assertEquals(expected, actual);
    }
}
