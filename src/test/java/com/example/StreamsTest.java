package com.example;

import org.junit.Test;

import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;

public class StreamsTest {

    @Test
    public void testNumberConversion() {
        List<String> strings = asList("10042017", "23");

        out.println(
                StreamsAndCheckedExceptions.parseAll(strings)
        );

        // [
        //   Success(Mon Apr 10 00:00:00 CEST 2017),
        //   Failure(ParseException: Unparseable date: "23")
        // ]
    }

}
