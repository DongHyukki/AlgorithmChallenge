package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String_1Test {

    @DisplayName("프로그래머스 레벨2 JadenCase")
    @Test
    void testCase1() {
        String s = "3people unFollowed me";
        String expected = "3people Unfollowed Me";
        String_1 s1 = new String_1();
        assertEquals(expected, s1.string_1(s));
    }

    @Test
    void testCase2() {
        String s = "for the last week";
        String expected = "For The Last Week";
        String_1 s1 = new String_1();
        assertEquals(expected, s1.string_1(s));
    }
}
