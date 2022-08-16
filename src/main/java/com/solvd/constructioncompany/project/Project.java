package com.solvd.constructioncompany.project;

import com.solvd.constructioncompany.exception.InvalidDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Project implements IRun {

    private static final Logger LOGGER = LogManager.getLogger(Project.class);

    private static int counter;

    private String projectTitle;
    private LocalDate foundationDate;
    private BigDecimal price;
    private Integer square;
    private Integer numberOfRooms;

    public Project(String projectTitle, LocalDate foundationDate) {
        this.projectTitle = projectTitle;
        this.foundationDate = foundationDate;
        counter++;
    }

    public Project() {
    }

    @Override
    public void startProject() {
        LOGGER.info("The project starts");
    }

    @Override
    public void finishProject() {
        LOGGER.info("The project is ending");
    }

    public void setFoundationDate(LocalDate foundationDate) {
        if (foundationDate.getYear() < 2019) {
            throw new InvalidDataException("Year is invalid");
        }
        this.foundationDate = foundationDate;
    }

    public static int getCounter() {
        return counter;
    }

    public void showProject() {
        LOGGER.info("Company project: " + getProjectTitle());
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer gerNumberOfRooms() {
        return numberOfRooms;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectTitle, project.projectTitle) && Objects.equals(foundationDate, project.foundationDate) && Objects.equals(price, project.price) && Objects.equals(square, project.square) && Objects.equals(numberOfRooms, project.numberOfRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectTitle, foundationDate, price, square, numberOfRooms);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectTitle='" + projectTitle + '\'' +
                ", foundationDate=" + foundationDate +
                ", price=" + price +
                ", square=" + square +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
