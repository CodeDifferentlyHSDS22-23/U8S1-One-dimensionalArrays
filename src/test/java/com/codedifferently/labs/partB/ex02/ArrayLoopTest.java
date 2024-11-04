package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.ArrayLoop;

public class ArrayLoopTest {
    @Test
    public void arrayTest01(){
        String expected = "Mikasa\n" +
                "Eren\n" +
                "Levi\n" +
                "Armin";

        String actual = ArrayLoop.arrayLoop();
        Assertions.assertEquals(expected, actual);
    }
}
