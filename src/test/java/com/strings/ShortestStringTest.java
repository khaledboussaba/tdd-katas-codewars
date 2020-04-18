package com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestStringTest {

    @Test
    public void findLengthOfShortestString1() {
        assertEquals(3, ShortestString.findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    @Test
    public void findLengthOfShortestString2() {
        assertEquals(3, ShortestString.findShort("turns out random test cases are easier than writing out basic ones"));
    }

    @Test
    public void findLengthOfShortestString3() {
        assertEquals(1, ShortestString.findShort("i love java"));
    }

}