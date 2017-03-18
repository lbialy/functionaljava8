package com.example;

class CharacterOps {

    static Character firstCharacter(String string) {
        return (string.length() > 0) ? string.charAt(0) : null;
    }

    static Integer getAlphabetPosition(Character character) {
        int code = (int) character;

        if (isLowerCase(code))
            return code - 96;
        else if (isUpperCase(code))
            return code - 64;
        else
            return null; // or throw exception?
    }

    private static boolean isLowerCase(int code) {
        return code >= 97 && code <= 122;
    }

    private static boolean isUpperCase(int code) {
        return code >= 65 && code <= 90;
    }

}
