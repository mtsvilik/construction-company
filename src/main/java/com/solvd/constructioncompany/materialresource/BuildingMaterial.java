package com.solvd.constructioncompany.materialresource;

import com.solvd.constructioncompany.exception.InvalidQuantityException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class BuildingMaterial extends Source implements IUse {

    private static final Logger LOGGER = LogManager.getLogger(BuildingMaterial.class);

    private int quantity;

    public BuildingMaterial(String title) {
        super(title);
    }

    public BuildingMaterial() {
    }

    @Override
    public void useSource() {
        LOGGER.info("Concrete is used for the construction of the project");
    }

    @Override
    public void show() {
        super.show();
    }

    public void setQuantity(int quantity) {
        if (quantity == 0) {
            throw new InvalidQuantityException("Quantity of building material is invalid");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BuildingMaterial that = (BuildingMaterial) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity);
    }

    @Override
    public String toString() {
        return "BuildingMaterial{" +
                "quantity=" + quantity +
                '}';
    }
}
