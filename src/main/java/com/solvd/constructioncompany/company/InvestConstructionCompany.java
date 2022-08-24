package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.human.Customer;
import com.solvd.constructioncompany.investment.Investment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class InvestConstructionCompany extends ConstructionCompany {

    private List<Investment> investments;

    public InvestConstructionCompany(String name, LocalDate foundationDate) {
        super(name, foundationDate);
    }

    public int countInvestments(List<Investment> investments) {
        return investments.size();
    }

    @Override
    public BigDecimal countAllBudgets(List<Customer> customers) {
        return customers.stream()
                .map(Customer::getBudget)
                .reduce(BigDecimal::add)
                .orElseThrow();
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InvestConstructionCompany that = (InvestConstructionCompany) o;
        return Objects.equals(investments, that.investments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), investments);
    }

    @Override
    public String toString() {
        return "InvestConstructionCompany{" +
                "investments=" + investments +
                '}';
    }
}

