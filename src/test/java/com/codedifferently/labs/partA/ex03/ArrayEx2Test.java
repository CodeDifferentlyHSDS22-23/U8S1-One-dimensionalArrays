package com.codedifferently.labs.partA.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex03.ArrayEx2;

public class ArrayEx2Test {
    @Test
    public void arrayExTest01(){
        String expected = "size of array is 4\n" +
                "explorer\n" +
                "chrome\n" +
                "opera\n" +
                "firefox";

        String actual = ArrayEx2.arrayExample();
        Assertions.assertEquals(expected, actual);
    }
}
