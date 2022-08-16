package com.solvd.constructioncompany.materialresource.officesupply;

import java.util.Objects;

public class Paper extends OfficeSupply {

    private String classOfPaper;

    public Paper(String title) {
        super(title);
    }

    public String getClassOfPaper() {
        return classOfPaper;
    }

    public void setClassOfPaper(String classOfPaper) {
        this.classOfPaper = classOfPaper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Paper paper = (Paper) o;
        return Objects.equals(classOfPaper, paper.classOfPaper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classOfPaper);
    }

    @Override
    public String toString() {
        return "Paper{" +
                "classOfPaper='" + classOfPaper + '\'' +
                '}';
    }
}
