package com.influencehealth.clinical.test;

import java.util.HashMap;
import java.util.Map;

/**
 * For this problem, implement the analyze method. Everything outside the analyze method is already implemented. The
 * analyze method takes a string, and counts the occurrences of the letters A-Z. The characterCounts map is a map where
 * the key is a String that holds an individual character, and the value is an Integer that holds the number of
 * occurrences of that character. The analyze method should populate the characterCounts map according to the following
 * guidelines:
 * 
 * - Assume that the characterCounts map is empty at first, and will need to be initialized in the following matter: -
 * Add an entry to the map for each letter A-Z, upper case (26 entries), make the key the corresponding letter, and the
 * value 0. So, for example, the first entry added would have a key of "A" and a value of 0. The second entry would be
 * "B":0, and so on through "Z". Add one more entry where the key value is "OTHER" and the value is 0.
 * 
 * - For each character of the string, determine if the character is a letter. If it is a letter, update the
 * corresponding entry in the map and increment the count by one.
 * 
 * - The analysis should be case-insensitive - for example, both "a" and "A" would increment the counter for "A" in the
 * map.
 * 
 * - Any character other than letter characters should increment the "OTHER" bucket of the map.
 * 
 * - A null or empty string should return an initialized map with all the keys present, and 0's for all the values.
 * 
 * The program includes some unit tests that will test the output of the map given certain strings. Your implementation
 * should be able to run all unit tests without any failures. To run the unit tests, find "ProblemFourTest" under
 * /src/test/java, right click on it and select "Run as->JUnit".
 * 
 * @author scott.tatum
 */
public class ProblemFour
{

    private ProblemFour()
    {
        // non-instantiable
    }

    public static Map<String, Integer> analyze(String message)
    {
        Map<String, Integer> map = new HashMap<>();

        // the rest is up to you!

        return map; // change me to have the proper implementation
    }

}
