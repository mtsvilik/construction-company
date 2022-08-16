package com.solvd.constructioncompany.project;

import com.solvd.constructioncompany.materialresource.BuildingMaterial;
import com.solvd.constructioncompany.materialresource.officesupply.OfficeSupply;

import java.math.BigDecimal;
import java.util.List;

public class PromotionProject<M extends BuildingMaterial, S extends OfficeSupply> {

    private String title;
    private Integer square;
    private BigDecimal price;
    private List<M> materials;
    private List<S> supplies;

    public PromotionProject(String title) {
        this.title = title;
    }

    public BigDecimal countSquareMeterCost(Integer square, BigDecimal price) {
        BigDecimal bigDecimal = new BigDecimal(square);
        return price.divide(bigDecimal);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<M> getMaterials() {
        return materials;
    }

    public void setMaterials(List<M> materials) {
        this.materials = materials;
    }

    public List<S> getSupplies() {
        return supplies;
    }

    public void setSupplies(List<S> supplies) {
        this.supplies = supplies;
    }
}
