package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stack_2Test {

    @DisplayName("프로그래머스 레벨2 프린터")
    @Test
    void testCase1() {
        int [] priorities = {2, 1, 3, 2};
        int location = 2;
        int expected = 1;
        Stack_2 s2 = new Stack_2();
        assertEquals(expected, s2.stack_2(priorities, location));
    }

    @DisplayName("프로그래머스 레벨2 프린터")
    @Test
    void testCase2() {
        int [] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int expected = 5;
        Stack_2 s2 = new Stack_2();
        assertEquals(expected, s2.stack_2(priorities, location));
    }
}
