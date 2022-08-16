package com.solvd.constructioncompany.info;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private Integer passportNumber;
    private LocalDate dateOfIssue;

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(dateOfIssue, passport.dateOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, dateOfIssue);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }
}
