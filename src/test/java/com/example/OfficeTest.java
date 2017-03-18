package com.example;

import javaslang.collection.HashSet;
import org.junit.Test;

public class OfficeTest {

    @Test
    public void muchSafeSuchImmutableVeryWow() {

        HashSet<Employee> employees = HashSet.of(
                Employee.of("Boss")
        );

        HashSet<Room> rooms = HashSet.of(
                Room.of("Boss' office")
        );

        Office office = Office.builder()
                .employees(employees)
                .rooms(rooms)
                .open(true)
                .build();

        System.out.println(office);
        // Office{
        //  rooms=HashSet(Room{name=Boss' office}),
        //  employees=HashSet(Employee{name=Boss}),
        //  open=true}

        Office officeWithoutEmployees = office
                .withEmployees(HashSet.empty())
                .withOpen(false);

        System.out.println(officeWithoutEmployees);
        // Office{
        //  rooms=HashSet(Room{name=Boss' office}),
        //  employees=HashSet(),
        //  open=false}
    }
}
