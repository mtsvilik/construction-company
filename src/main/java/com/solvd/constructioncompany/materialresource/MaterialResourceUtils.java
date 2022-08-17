package com.solvd.constructioncompany.materialresource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MaterialResourceUtils {

    private static final Logger LOGGER = LogManager.getLogger(MaterialResourceUtils.class);

    public static void displayColor(Vehicle vehicle) {
        switch (vehicle.getColor()) {
            case WHITE:
                LOGGER.info("The color of the vehicle is white");
                break;
            case BLACK:
                LOGGER.info("The color of the vehicle is black");
                break;
            case RED:
                LOGGER.info("The color of the vehicle is red");
                break;
            case GREY:
                LOGGER.info("The color of the vehicle is grey");
                break;
            default:
                break;
        }
    }

    public static void showColor() {
        LOGGER.info(Arrays.toString(Color.values()));
        LOGGER.info(Color.BLACK.ordinal());
        LOGGER.info(Color.GREY.name());
        LOGGER.info(Color.WHITE.getCode());
        LOGGER.info(Color.valueOf("RED"));

    }
}
