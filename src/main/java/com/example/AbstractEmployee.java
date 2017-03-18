package com.example;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeImmutable = "*", allParameters = true)
abstract class AbstractEmployee {
    abstract String name();
}