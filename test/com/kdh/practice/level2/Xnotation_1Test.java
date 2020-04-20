package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Xnotation_1Test {

    @DisplayName("프로그래머스 레벨2 124나라의 숫자")
    @Test
    void testCase1() {
        int n = 6;
        String expected = "14";
        Xnotation_1 s1 = new Xnotation_1();
        assertEquals(expected, s1.xnotation_1(n));
    }

    @DisplayName("프로그래머스 레벨2 124나라의 숫자")
    @Test
    void testCase2() {
        int n = 8;
        String expected = "22";
        Xnotation_1 s1 = new Xnotation_1();
        assertEquals(expected, s1.xnotation_1(n));
    }

    @DisplayName("프로그래머스 레벨2 124나라의 숫자")
    @Test
    void testCase3() {
        int n = 10;
        String expected = "41";
        Xnotation_1 s1 = new Xnotation_1();
        assertEquals(expected, s1.xnotation_1(n));
    }

    @DisplayName("프로그래머스 레벨2 124나라의 숫자")
    @Test
    void testCase4() {
        int n = 9;
        String expected = "24";
        Xnotation_1 s1 = new Xnotation_1();
        assertEquals(expected, s1.xnotation_1(n));
    }

}


