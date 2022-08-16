package com.solvd.constructioncompany.human;

import com.solvd.constructioncompany.info.Address;
import com.solvd.constructioncompany.info.Passport;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Human {

    private Address address;
    private Passport passport;
    private String position;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, LocalDate dob) {
        super(firstName, lastName, dob);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(address, employee.address) && Objects.equals(passport, employee.passport) && Objects.equals(position, employee.position) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, passport, position, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", passport=" + passport +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
