package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 24
    @Test
    public void beginWithNotTest01() {

        // Given
        String str = "candy";

        // When
        String expected = "not candy";
        String actual = AlgoChallenge.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest02() {

        // Given
        String str = "x";

        // When
        String expected = "not x";
        String actual = AlgoChallenge.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest03() {

        // Given
        String str = "not bad";

        // When
        String expected = "not bad";
        String actual = AlgoChallenge.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 25
    @Test
    public void popular3Test01() {

        // Given
        String str = "Java";

        // When
        String expected = "JavJavJav";
        String actual = AlgoChallenge.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test02() {

        // Given
        String str = "Chocolate";

        // When
        String expected = "ChoChoCho";
        String actual = AlgoChallenge.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "abcabcabc";
        String actual = AlgoChallenge.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


}
