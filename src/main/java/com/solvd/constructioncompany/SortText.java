package com.solvd.constructioncompany;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortText {

    private static final Logger LOGGER = LogManager.getLogger(SortText.class);

    public static void main(String[] args) {
        File file = new File("src/main/resources/text.txt");
        try {
            List<String> allWords = new ArrayList<>();
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);

            for (String string : lines) {
                String remove = StringUtils.remove(string, ".");
                String remove1 = StringUtils.remove(remove, ",");
                String remove2 = StringUtils.remove(remove1, "-");
                String remove3 = StringUtils.remove(remove2, "?");
                String remove4 = StringUtils.remove(remove3, "!");
                String remove5 = StringUtils.remove(remove4, ":");
                String remove6 = StringUtils.remove(remove5, ";");
                String remove7 = StringUtils.remove(remove6, "“");
                String remove8 = StringUtils.remove(remove7, "”");
                String lowerCase = remove8.toLowerCase();

                String[] split = StringUtils.split(lowerCase, " ");
                List<String> strings = Arrays.asList(split);
                allWords.addAll(strings);
            }

            Collections.sort(allWords);

            int count = 1;
            for (int i = 0; i < allWords.size() - 1; i++) {
                if (allWords.get(i).equals(allWords.get(i + 1))) {
                    count++;
                } else {
                    System.out.println(allWords.get(i) + " - " + count);
                    count = 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
