package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLongestCommonPrefixExample1() {
        Solution solution = new Solution();
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void testLongestCommonPrefixExample2() {
        Solution solution = new Solution();
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void testLongestCommonPrefixEmptyInput() {
        Solution solution = new Solution();
        String[] input = {};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    @Test
    void testLongestCommonPrefixNoCommonPrefix() {
        Solution solution = new Solution();
        String[] input = {"apple", "banana", "cherry"};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }
}