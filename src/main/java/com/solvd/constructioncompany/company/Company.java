package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.info.Account;
import com.solvd.constructioncompany.info.Address;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Company {

    private String name;
    private LocalDate foundationDate;
    private Address address;
    private Account Account;

    public Company(String name, LocalDate foundationDate) {
        this.name = name;
        this.foundationDate = foundationDate;
    }

    public abstract void showCompanyName(Company company);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(foundationDate, company.foundationDate) && Objects.equals(address, company.address) && Objects.equals(Account, company.Account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundationDate, address, Account);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", foundationDate=" + foundationDate +
                ", address=" + address +
                ", Account=" + Account +
                '}';
    }
}
