package com.kdh.practice.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hash_1Test {

    @DisplayName("프로그래머스 레벨2 전화번호 목록")
    @Test
    void testCase1() {
        String [] phone_book = {"119","97674223", "1195524421"};

        boolean expected = false;
        Hash_1 s1 = new Hash_1();
        assertEquals(expected, s1.hash_1(phone_book));
    }

    @DisplayName("프로그래머스 레벨2 전화번호 목록")
    @Test
    void testCase2() {
        String [] phone_book = {"123","456", "789"};

        boolean expected = true;
        Hash_1 s2 = new Hash_1();
        assertEquals(expected, s2.hash_1(phone_book));
    }
}
