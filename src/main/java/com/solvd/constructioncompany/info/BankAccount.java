package com.solvd.constructioncompany.info;

import java.time.LocalDate;
import java.util.Objects;

public class BankAccount extends Account {

    private String nameOfBank;

    public BankAccount(Long accountNumber, LocalDate foundationDate, String nameOfBank) {
        super(accountNumber, foundationDate);
        this.nameOfBank = nameOfBank;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(nameOfBank, that.nameOfBank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfBank);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "nameOfBank='" + nameOfBank + '\'' +
                '}';
    }
}
