package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.human.Customer;
import com.solvd.constructioncompany.human.Employee;
import com.solvd.constructioncompany.materialresource.Source;
import com.solvd.constructioncompany.project.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public abstract class ConstructionCompany extends Company {

    private static final Logger LOGGER = LogManager.getLogger(ConstructionCompany.class);

    private List<Customer> customers;
    private List<Employee> employees;
    private List<Project> projects;
    private List<Source> sources;

    public ConstructionCompany(String name, LocalDate foundationDate) {
        super(name, foundationDate);
    }

    @Override
    public void showCompanyName(Company company) {
        LOGGER.info("Company name: " + company.getName());
    }

    public void showCompanyName() {
        LOGGER.info("Some company name");
    }

    public abstract BigDecimal countAllBudgets(List<Customer> customers);

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConstructionCompany that = (ConstructionCompany) o;
        return Objects.equals(customers, that.customers) && Objects.equals(employees, that.employees) && Objects.equals(projects, that.projects) && Objects.equals(sources, that.sources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customers, employees, projects, sources);
    }

    @Override
    public String toString() {
        return "ConstructionCompany{" +
                "customers=" + customers +
                ", employees=" + employees +
                ", projects=" + projects +
                ", sources=" + sources +
                '}';
    }
}
