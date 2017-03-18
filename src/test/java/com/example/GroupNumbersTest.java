package com.example;

import javaslang.Tuple;
import javaslang.Tuple2;
import javaslang.collection.Map;
import javaslang.collection.Set;
import org.junit.Test;

import static com.example.PhoneNumberData.areas;
import static com.example.PhoneNumberData.phoneNumbers;
import static java.util.function.Function.identity;

public class GroupNumbersTest {

    @Test
    public void processNumbers() {
        Map<String, Set<String>> map = phoneNumbers
                .filter(num -> num.length() >= 9)
                .map(number -> Tuple.of(number, number))
                .map(tuple ->
                        tuple.map(
                                num -> num.replaceFirst("^\\+?48", ""),
                                identity()
                        )
                )
                .groupBy(tuple -> tuple._1().substring(0, 2))
                .bimap(
                        key -> areas.get(key).getOrElse("Nieznany"),
                        value -> value.map(Tuple2::_2)
                );

        System.out.println(map);
    }

}
