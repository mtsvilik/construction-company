package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.materialresource.Source;
import com.solvd.constructioncompany.project.Project;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyUtils {

    public static List<Project> selectProjects(BigDecimal budget, ConstructionCompany company) {
        return company.getProjects().stream()
                .filter(project -> {
                    boolean result = true;
                    int i = project.getPrice().compareTo(budget);
                    if (i >= 0) {
                        result = false;
                    }
                    return result;
                })
                .collect(Collectors.toList());
    }

    public static void showInformation(List<Source> sources) {
        sources.forEach(Source::show);
    }
}
