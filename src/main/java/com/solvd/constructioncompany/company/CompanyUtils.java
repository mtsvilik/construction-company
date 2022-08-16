package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.materialresource.Source;
import com.solvd.constructioncompany.project.Project;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyUtils {

    public static List<Project> selectProjects(BigDecimal budget, ConstructionCompany company) {
        List<Project> result = new ArrayList<>();
        for (Project currentProject : company.getProjects()) {
            if (budget.compareTo(currentProject.getPrice()) > 0) {
                result.add(currentProject);
            }
        }
        return result;
    }

    public static void showInformation(List<Source> sources) {
        for (Source source : sources) {
            source.show();
        }
    }
}
