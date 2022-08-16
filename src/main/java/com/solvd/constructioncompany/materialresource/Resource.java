package com.solvd.constructioncompany.materialresource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Resource implements AutoCloseable {

    private static final Logger LOGGER = LogManager.getLogger(Resource.class);

    private String typeOfResource;

    public Resource(String typeOfResource) {
        this.typeOfResource = typeOfResource;
    }

    public Resource() {
    }

    @Override
    public void close() {
        LOGGER.info("Resource closed");
    }

    public void load(Resource resource) {
        if (resource == null) {
            LOGGER.info("Check the resource");
        }
    }

    public void setTypeOfResource(String typeOfResource) {
        this.typeOfResource = typeOfResource;
    }

    public String getTypeOfResource() {
        return typeOfResource;
    }
}
