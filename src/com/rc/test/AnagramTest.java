package com.rc.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AnagramTest {

    //test anagram method
    @Test
    public void testAnagram() {
        Anagram anagram = new Anagram();
        String input1 = "listen";
        String input2 = "silent";
        boolean isAnagram = anagram.checkAnagram(input1, input2);
        assertTrue(isAnagram);

        input1 = "God";
        input2 = "Doggy";
        isAnagram = anagram.checkAnagram(input1, input2);
        assertFalse(isAnagram);
    }

}
