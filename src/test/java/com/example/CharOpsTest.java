package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.example.CharacterOps.firstCharacter;
import static com.example.CharacterOps.getAlphabetPosition;

public class CharOpsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testComposability() {

        getAlphabetPosition(firstCharacter("cat")); // 3

        thrown.expect(NullPointerException.class);

        getAlphabetPosition(firstCharacter("")); // will throw NPE

    }

}
