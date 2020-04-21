package com.kdh.practice.level2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sort_1Test {

    @DisplayName("프로그래머스 레벨2 H-Index")
    @Test
    void testCase1() {
        //[3, 0, 6, 1, 5]
        int [] cititation = {3, 0, 6, 1, 5};
        int expected = 3;
        Sort_1 s1 = new Sort_1();
        assertEquals(expected, s1.sort_1(cititation));
    }
}

