package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Heap_1Test {

    @DisplayName("프로그래머스 레벨2 더 맵게")
    @Test
    void testCase1() {
        int [] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int expected = 2;
        Heap_1 s1 = new Heap_1();
        assertEquals(expected, s1.heap_1(scoville, K));
    }
}
