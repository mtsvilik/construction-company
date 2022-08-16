package com.solvd.constructioncompany.materialresource;

import java.time.LocalDate;
import java.util.Objects;

public class Equipment extends Source {

    private LocalDate dateOfRelease;

    public Equipment(String title, LocalDate dateOfRelease) {
        super(title);
        this.dateOfRelease = dateOfRelease;
    }

    @Override
    public void show() {
        super.show();
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
        Equipment equipment = (Equipment) o;
        return Objects.equals(dateOfRelease, equipment.dateOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfRelease);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "dateOfRelease=" + dateOfRelease +
                '}';
    }
}
