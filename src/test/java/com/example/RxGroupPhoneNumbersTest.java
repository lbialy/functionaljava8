package com.example;

import javaslang.Tuple;
import javaslang.Tuple2;
import org.junit.Test;
import rx.observables.GroupedObservable;

import static com.example.StreamingData.areas;
import static com.example.StreamingData.phoneNumbers;
import static java.lang.System.out;
import static java.util.function.Function.identity;

public class RxGroupPhoneNumbersTest {

    @Test
    public void processNumbers() {
        phoneNumbers
                .filter(num -> num.length() >= 9)
                .map(number -> Tuple.of(number, number)) // _1 will be processed, _2 will save data for later use
                .map(tuple ->
                        tuple.map(
                                num -> num.replaceFirst("^\\+?48", ""),
                                identity()
                        )
                )
                .groupBy(tuple -> tuple._1().substring(0, 2))
                .map(grouped ->
                        GroupedObservable.from(
                                areas.get(grouped.getKey()).getOrElse("Nieznany"), // group key
                                grouped.map(Tuple2::_2)                                  // original number
                        )
                )
                .forEach(grouped -> grouped.forEach(number ->
                                out.println(
                                        grouped.getKey() + ": " + number
                                )
                        )
                );
    }

}
