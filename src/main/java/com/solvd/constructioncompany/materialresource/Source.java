package com.solvd.constructioncompany.materialresource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Source {

    private static final Logger LOGGER = LogManager.getLogger(Source.class);

    private String title;

    public Source(String title) {
        this.title = title;
    }

    public Source() {
    }

    public void show() {
        LOGGER.info("Sources: " + getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return Objects.equals(title, source.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Source{" +
                "title='" + title + '\'' +
                '}';
    }
}