package com.solvd.constructioncompany;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class SortText {

    public static void main(String[] args) {
        File file = new File("src/main/resources/text.txt");
        File sortText = new File("src/main/resources/sortText.txt");
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);

            List<String> allWords = lines.stream()
                    .map(s -> StringUtils.remove(s, "."))
                    .map(s -> StringUtils.remove(s, ","))
                    .map(s -> StringUtils.remove(s, "-"))
                    .map(s -> StringUtils.remove(s, "?"))
                    .map(s -> StringUtils.remove(s, "!"))
                    .map(s -> StringUtils.remove(s, ":"))
                    .map(s -> StringUtils.remove(s, ";"))
                    .map(s -> StringUtils.remove(s, "“"))
                    .map(s -> StringUtils.remove(s, "”"))
                    .map(s -> s.toLowerCase())
                    .flatMap((p) -> Arrays.stream(p.split(" ")))
                    .sorted()
                    .collect(Collectors.toList());

            Map<String, Integer> wordsMap = new LinkedHashMap<>();
            allWords.forEach(word -> {
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                } else {
                    wordsMap.put(word, 1);
                }
            });

            System.out.println(wordsMap);

            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordsMap.entrySet());
            String join = StringUtils.join(entryList, " ");

            FileUtils.writeStringToFile(sortText, join, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
