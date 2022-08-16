package com.solvd.constructioncompany.info;

import java.time.LocalDate;
import java.util.Objects;

public class Account {

    private Long accountNumber;
    private LocalDate foundationDate;

    public Account(Long accountNumber, LocalDate foundationDate) {
        this.accountNumber = accountNumber;
        this.foundationDate = foundationDate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(foundationDate, account.foundationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, foundationDate);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", foundationDate=" + foundationDate +
                '}';
    }
}
