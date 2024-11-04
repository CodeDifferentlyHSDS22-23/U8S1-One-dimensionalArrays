package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.ArrayLoop;
import partB.ex03.FixThisLoop;

public class FixThisLoopTest {
    @Test
    public void fixItTest01(){
        String expected = "The minimum of this array is: -20";
        String actual = FixThisLoop.fixThisLoop();
        Assertions.assertEquals(expected, actual);
    }
}
