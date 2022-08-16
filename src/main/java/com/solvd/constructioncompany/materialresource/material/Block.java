package com.solvd.constructioncompany.materialresource.material;

import com.solvd.constructioncompany.materialresource.BuildingMaterial;

import java.util.Objects;

public class Block extends BuildingMaterial {

    private int size;

    public Block(String title) {
        super(title);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Block block = (Block) o;
        return size == block.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Block{" +
                "size=" + size +
                '}';
    }
}
