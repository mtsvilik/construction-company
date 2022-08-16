package com.solvd.constructioncompany.materialresource;

import com.solvd.constructioncompany.human.IMove;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle extends Source implements IMove {

    private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);

    private String engine;
    private LocalDate dateOfRelease;

    public Vehicle(String title, String engine, LocalDate dateOfRelease) {
        super(title);
        this.engine = engine;
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public void moveForward() {
        LOGGER.info("Vehicle is moving forward");
    }

    @Override
    public void moveRight() {
        LOGGER.info("Vehicle turns right");
    }

    @Override
    public void moveStop() {
        LOGGER.info("Vehicle stops");
    }

    @Override
    public void show() {
        super.show();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(engine, vehicle.engine) && Objects.equals(dateOfRelease, vehicle.dateOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engine, dateOfRelease);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                '}';
    }
}

