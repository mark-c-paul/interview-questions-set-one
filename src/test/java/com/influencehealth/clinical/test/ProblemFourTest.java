package com.influencehealth.clinical.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;

public class ProblemFourTest
{
    public final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final Integer ZERO = Integer.valueOf(0);
    public final Integer ONE = Integer.valueOf(1);
    public final Integer TWO = Integer.valueOf(2);
    public final Integer THREE = Integer.valueOf(3);
    public final Integer FOUR = Integer.valueOf(4);
    public final Integer TEN = Integer.valueOf(10);

    @Test
    public void testAnalyzeEmptyString()
    {
        Map<String, Integer> map = ProblemFour.analyze("");
        assertNotNull(map);
        for (int i = 0; i < LETTERS.length(); i++)
        {
            assertEquals(ZERO, map.get(LETTERS.substring(i, i + 1)));
        }

        assertEquals(ZERO, map.get("OTHER"));
    }

    @Test
    public void testAnalyzeEmptyNull()
    {
        String str = null;
        Map<String, Integer> map = ProblemFour.analyze(str);
        assertNotNull(map);
        for (int i = 0; i < LETTERS.length(); i++)
        {
            assertEquals(ZERO, map.get(LETTERS.substring(i, i + 1)));
        }

        assertEquals(ZERO, map.get("OTHER"));
    }

    @Test
    public void testAnalyzeMyDogHasFleas()
    {
        String str = "My dog has fleas.";
        Map<String, Integer> map = ProblemFour.analyze(str);

        assertNotNull(map);
        assertEquals(FOUR, map.get("OTHER"));
        assertEquals(ONE, map.get("M"));
        assertEquals(ONE, map.get("Y"));
        assertEquals(ONE, map.get("D"));
        assertEquals(ONE, map.get("O"));
        assertEquals(ONE, map.get("G"));
        assertEquals(ONE, map.get("H"));
        assertEquals(TWO, map.get("A"));
        assertEquals(TWO, map.get("S"));
        assertEquals(ONE, map.get("F"));
        assertEquals(ONE, map.get("L"));
        assertEquals(ONE, map.get("E"));
    }

    @Test
    public void testAnalyzeUpperLowerOther()
    {
        String str = "AaAaAaAaAabBbBbBbBbBcCcCcCcCcC1234567890";
        Map<String, Integer> map = ProblemFour.analyze(str);

        assertNotNull(map);
        assertEquals(TEN, map.get("OTHER"));
        assertEquals(TEN, map.get("A"));
        assertEquals(TEN, map.get("B"));
        assertEquals(TEN, map.get("C"));
    }

}
