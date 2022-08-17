package com.solvd.constructioncompany.materialresource;

public enum Color {

    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#FF0000"),
    GREY("#808080");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
