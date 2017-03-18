package com.example;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeImmutable = "*", allParameters = true)
abstract class AbstractRoom {
    abstract String name();
}

