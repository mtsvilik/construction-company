package com.solvd.constructioncompany;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SortText {

    private static final Logger LOGGER = LogManager.getLogger(SortText.class);

    public static void main(String[] args) {
        File file = new File("src/main/resources/text.txt");
        File sortText = new File("src/main/resources/sortText.txt");
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

            Map<String, Integer> wordsMap = new LinkedHashMap<>();
            for (int i = 0; i < allWords.size() - 1; i++) {
                if (wordsMap.containsKey(allWords.get(i))) {
                    wordsMap.put(allWords.get(i), wordsMap.get(allWords.get(i)) + 1);
                } else {
                    wordsMap.put(allWords.get(i), 1);
                }
            }
            System.out.println(wordsMap);

            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordsMap.entrySet());
            String join = StringUtils.join(entryList, " ");

            FileUtils.writeStringToFile(sortText, join, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
