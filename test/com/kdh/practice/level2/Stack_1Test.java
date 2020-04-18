package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack_1Test {

    @DisplayName("프로그래머스 레벨2 기능개발")
    @Test
    void testCase() {
        int [] progresses = {93,30,55};
        int [] speeds = {1,30,5};
        int [] expected = {2,1};
        Stack_1 s1 = new Stack_1();
        assertArrayEquals(expected, s1.stack_1(progresses, speeds));
    }
}