package com.solvd.constructioncompany.materialresource.material;

import com.solvd.constructioncompany.materialresource.BuildingMaterial;

import java.util.Objects;

public class Module extends BuildingMaterial {

    private String shape;

    public Module(String title) {
        super(title);
    }

    public Module() {
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Module module = (Module) o;
        return Objects.equals(shape, module.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shape);
    }

    @Override
    public String toString() {
        return "Module{" +
                "shape='" + shape + '\'' +
                '}';
    }
}
