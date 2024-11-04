package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex02.ComputeAvg;

public class ComputeAvgTest {
    @Test
    public void computeAvgTest01(){
        String expected = "The student's average score is: 84.2";
        String actual = ComputeAvg.average();
        Assertions.assertEquals(expected, actual);
    }
}
