package com.solvd.constructioncompany.investment;

import com.solvd.constructioncompany.exception.InvalidTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Objects;

public class Investment implements IExtend {

    private static final Logger LOGGER = LogManager.getLogger(Investment.class);

    private String typeOfInvestment;
    private LocalDate termOfInvestment;

    public Investment(String typeOfInvestment, LocalDate termOfInvestment) {
        this.typeOfInvestment = typeOfInvestment;
        this.termOfInvestment = termOfInvestment;
    }

    public Investment() {
    }

    @Override
    public void extendTerm() {
        LOGGER.info("The investment period is extended");
    }

    public void showInvestment() {
        LOGGER.info("InvestConstructionCompany: " + getTypeOfInvestment());
    }

    public String getTypeOfInvestment() {
        return typeOfInvestment;
    }

    public void setTypeOfInvestment(String typeOfInvestment) throws InvalidTypeException {
        if (typeOfInvestment.contains("Credit")) {
            throw new InvalidTypeException("Type of investment is invalid");
        }
        this.typeOfInvestment = typeOfInvestment;
    }

    public LocalDate getTermOfInvestment() {
        return termOfInvestment;
    }

    public void setTermOfInvestment(LocalDate termOfInvestment) {
        this.termOfInvestment = termOfInvestment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investment that = (Investment) o;
        return Objects.equals(typeOfInvestment, that.typeOfInvestment) && Objects.equals(termOfInvestment, that.termOfInvestment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfInvestment, termOfInvestment);
    }

    @Override
    public String toString() {
        return "Investment{" +
                "typeOfInvestment='" + typeOfInvestment + '\'' +
                ", termOfInvestment=" + termOfInvestment +
                '}';
    }
}
