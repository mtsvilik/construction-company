package com.solvd.constructioncompany.human;

import java.time.LocalDate;
import java.util.Objects;

public class Driver extends Human {

    private String typeOfLicense;

    public Driver(String firstName, String lastName, LocalDate dob) {
        super(firstName, lastName, dob);
    }

    public String getTypeOfLicense() {
        return typeOfLicense;
    }

    public void setTypeOfLicense(String typeOfLicense) {
        this.typeOfLicense = typeOfLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(typeOfLicense, driver.typeOfLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfLicense);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "typeOfLicense='" + typeOfLicense + '\'' +
                '}';
    }
}
