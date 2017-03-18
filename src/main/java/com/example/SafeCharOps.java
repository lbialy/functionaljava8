package com.example;

import java.util.Optional;

class SafeCharOps {

    static Optional<Character> firstCharacter(String string) {
        return (string.length() > 0) ?
                Optional.of(string.charAt(0)) :
                Optional.empty();
    }

    static Optional<Integer> getAlphabetPosition(Character character) {
        int code = (int) character;

        return isLowerCase(code) ? Optional.of(code - 96) :
                isUpperCase(code) ? Optional.of(code - 64) :
                        Optional.empty();
    }

    private static boolean isLowerCase(int code) {
        return code >= 97 && code <= 122;
    }

    private static boolean isUpperCase(int code) {
        return code >= 65 && code <= 90;
    }

}