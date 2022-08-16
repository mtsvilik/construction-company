package com.solvd.constructioncompany.human;

import com.solvd.constructioncompany.info.Address;
import com.solvd.constructioncompany.info.Passport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Customer extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Customer.class);

    private Address address;
    private Passport passport;
    private BigDecimal budget;

    public Customer(String firstName, String lastName, LocalDate dob) {
        super(firstName, lastName, dob);
    }

    public void showBudget() {
        LOGGER.info("Customer budget is " + getBudget());
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
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
        Customer customer = (Customer) o;
        return Objects.equals(address, customer.address) && Objects.equals(passport, customer.passport) && Objects.equals(budget, customer.budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, passport, budget);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                ", passport=" + passport +
                ", budget=" + budget +
                '}';
    }
}



