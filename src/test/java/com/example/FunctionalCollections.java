package com.example;

import javaslang.collection.List;
import javaslang.control.Try;
import org.junit.Test;

import java.util.stream.Stream;

public class FunctionalCollections {

    @Test
    public void testConvertToIntegerAndSumTypesafely() {
        System.out.println(
                List.of("1", "2", "3")
                        .map(s -> Try.of(() -> Integer.parseInt(s)).toOption())
                        .foldLeft(0, (acc, curr) -> acc + curr.getOrElse(0))
        );
    }

    @Test
    public void testCollectStreamToImmutableCollection() {
        System.out.println(
                Stream.of("a", "b", "c").collect(List.collector())
        );
    }

}
