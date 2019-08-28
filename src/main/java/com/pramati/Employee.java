package com.pramati;

import java.util.Date;
import java.util.Objects;

public class Employee {
    String firstName;
    String lastName;
    Date dateOfJoin;

    public Employee(String firstName, String lastName, Date dateOfJoin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
