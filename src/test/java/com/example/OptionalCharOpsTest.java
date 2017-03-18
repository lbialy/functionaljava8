package com.example;

import org.junit.Test;

import java.util.Optional;

import static com.example.SafeCharOps.firstCharacter;
import static com.example.SafeCharOps.getAlphabetPosition;

public class OptionalCharOpsTest {

    @Test
    public void testOptionalMethods() {

        Optional<Character> firstChar =
                firstCharacter("cat");

        if (firstChar.isPresent()) {

            Optional<Integer> alphabetPosition =
                    getAlphabetPosition(firstChar.get());

            if (alphabetPosition.isPresent()) {
                Integer position = alphabetPosition.get();

                // ...
            }

        }

    }

}
