package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.example.CharacterOps.firstCharacter;
import static com.example.CharacterOps.getAlphabetPosition;

public class ActualCharOpsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullChecks() {

        Character firstChar = firstCharacter("cat");

        if (null == firstChar) {
            // oops. what now? exception? propagate null with return?
        } else {
            // will throw NPE on digit :(
            Integer position = getAlphabetPosition(firstChar);
            System.out.println(position.toString());
            // ...
        }

    }

    @Test
    public void testItThrowsOnDigits() {
        thrown.expect(NullPointerException.class);

        Character firstChar = firstCharacter("123");

        if (null == firstChar) {
            // oops. what now? exception? propagate null with return?
        } else {
            // will throw NPE on digit :(
            Integer position = getAlphabetPosition(firstChar);
            System.out.println(position.toString());
            // ...
        }
    }
}
