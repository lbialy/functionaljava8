package com.example;

import javaslang.control.Try;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class StreamsAndCheckedExceptions {

    private static SimpleDateFormat sdf =
            new SimpleDateFormat("ddMMyyyy");

    static List<Try<Date>> parseAll(List<String> strings) {
        return strings.stream()
                .map(s -> Try.of(() -> sdf.parse(s))) // won't compile without Try.of(() -> )!
                .collect(Collectors.toList());
    }

}