package com.solvd.constructioncompany.human;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class HumanUtils {

    private static final Logger LOGGER = LogManager.getLogger(HumanUtils.class);

    public static void displayGender(Human human) {
        switch (human.getGender()) {
            case MALE:
                LOGGER.info("This is a man");
                break;
            case FEMALE:
                LOGGER.info("This is a woman");
                break;
            default:
                break;
        }
    }

    public static void showGender(Human human) {
        if (Human.Gender.FEMALE.equals(human.getGender())) {
            LOGGER.info("This is a woman");
        } else if (Human.Gender.MALE.equals(human.getGender())) {
            LOGGER.info("This is a man");
        }
    }

    public static void displayFamilyStatus(Human human) {
        switch (human.getStatus()) {
            case MARRIED:
                LOGGER.info(" Human is married");
                break;
            case NOT_MARRIED:
                LOGGER.info("Human isn't married");
                break;
            case DIVORCED:
                LOGGER.info("Human is divorced");
                break;
            default:
                break;
        }
    }

    public static void showFamilyStatus() {
        LOGGER.info(Arrays.toString(FamilyStatus.values()));
        LOGGER.info(FamilyStatus.MARRIED.ordinal());
        LOGGER.info(FamilyStatus.DIVORCED.ordinal());
        LOGGER.info(FamilyStatus.DIVORCED.name());
        LOGGER.info(FamilyStatus.valueOf("MARRIED"));
    }
}
