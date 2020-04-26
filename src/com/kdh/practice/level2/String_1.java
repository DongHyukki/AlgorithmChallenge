package com.kdh.practice.level2;

import java.util.*;
/*
* JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
*
* 제한 조건
* s는 길이 1 이상인 문자열입니다.
* s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
* 첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
* */

class String_1 {
    public String string_1(String s) {
        String str = s.toLowerCase();
        char [] sArr = str.toCharArray();
        sArr[0] = Character.toUpperCase(sArr[0]);

        for(int i=1 ; i< sArr.length ; i++) {
            if(sArr[i] == 32) {
                try{
                    sArr[i+1] = Character.toUpperCase(sArr[i+1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return new String(sArr);
    }
}
