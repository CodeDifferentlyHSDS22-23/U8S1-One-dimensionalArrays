package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Array;

public class ArrayTest {
    @Test
    public void arrayTest01(){
        String expected = "2 \n" +
                "5 \n";

        String actual = Array.fixArray();
        Assertions.assertEquals(expected, actual);
    }
}
