package com.solvd.constructioncompany.materialresource.material;

import com.solvd.constructioncompany.materialresource.BuildingMaterial;

import java.util.Objects;

public class Brick extends BuildingMaterial {

    private String color;

    public Brick(String title) {
        super(title);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Brick brick = (Brick) o;
        return Objects.equals(color, brick.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Brick{" +
                "color='" + color + '\'' +
                '}';
    }
}
