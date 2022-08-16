package com.solvd.constructioncompany.materialresource.officesupply;

import java.util.Objects;

public class Stapler extends OfficeSupply {

    private String size;

    public Stapler(String title) {
        super(title);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stapler stapler = (Stapler) o;
        return Objects.equals(size, stapler.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Stapler{" +
                "size='" + size + '\'' +
                '}';
    }
}
