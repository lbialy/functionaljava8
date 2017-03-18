package com.example;

import org.junit.Test;

import static com.example.SafeCharOps.firstCharacter;

public class OptionalCharOpsTestTheRightWay {

    @Test
    public void testOptionalMethods() {

        firstCharacter("cat")
                .flatMap(SafeCharOps::getAlphabetPosition)
                .ifPresent(value -> {
                    assert value == 3;
                });

        assert !firstCharacter("")
                .flatMap(SafeCharOps::getAlphabetPosition)
                .isPresent();
    }

}
