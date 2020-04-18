package com.calculs;

import com.calcul.Persist;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistTest {

    private Persist persistUnderTest;

    @Before
    public void init() {
        persistUnderTest = new Persist();
    }

    @Test
    public void shouldReturn0IfInputNumberContainOneDigit() {
        assertEquals(0, persistUnderTest.persistence(4));
    }

    @Test
    public void shouldReturn1IfInputNumberEquals12() {
        assertEquals(1, persistUnderTest.persistence(12));
    }

    @Test
    public void shouldReturn2IfInputNumberEquals25() {
        assertEquals(2, persistUnderTest.persistence(25));
    }

    @Test
    public void shouldReturn3IfInputNumberEquals39() {
        assertEquals(3, persistUnderTest.persistence(39));
    }

    @Test
    public void shouldReturn3IfInputNumberEquals999() {
        assertEquals(4, persistUnderTest.persistence(999));
    }

    @Test
    public void shouldReturn1IfInputNumberEquals40() {
        assertEquals(1, persistUnderTest.persistence(40));
    }

    @Test
    public void shouldReturn1IfInputNumberEquals100() {
        assertEquals(1, persistUnderTest.persistence(100));
    }

}
