package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Stack_3Test {

    @DisplayName("프로그래머스 레벨2 주식가격")
    @Test
    void testCase() {
        int [] prices = {1, 2, 3, 2, 3};
        int [] expected = {4, 3, 1, 1, 0};
        Stack_3 s3 = new Stack_3();
        assertArrayEquals(expected, s3.stack_3(prices));
    }
}
