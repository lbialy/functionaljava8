package com.example;

import javaslang.collection.Set;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeImmutable = "*")
abstract class AbstractOffice {
    abstract Set<Room> rooms();

    abstract Set<Employee> employees();

    abstract boolean open();
}
