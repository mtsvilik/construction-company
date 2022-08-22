package com.solvd.constructioncompany.human;

public enum FamilyStatus {

    MARRIED("Married"),
    NOT_MARRIED("Not married"),
    DIVORCED("Divorced");

    private String name;

    FamilyStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
