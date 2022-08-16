package com.solvd.constructioncompany.materialresource.officesupply;

import java.util.Objects;

public class OfficeSupply {

    private String title;
    private int quantity;

    public OfficeSupply(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeSupply that = (OfficeSupply) o;
        return quantity == that.quantity && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, quantity);
    }

    @Override
    public String toString() {
        return "OfficeSupply{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
