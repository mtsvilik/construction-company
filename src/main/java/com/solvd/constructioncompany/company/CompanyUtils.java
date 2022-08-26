package com.solvd.constructioncompany.company;

import com.solvd.constructioncompany.human.Employee;
import com.solvd.constructioncompany.human.ICheck;
import com.solvd.constructioncompany.human.IIncrease;
import com.solvd.constructioncompany.materialresource.Source;
import com.solvd.constructioncompany.materialresource.material.Block;
import com.solvd.constructioncompany.materialresource.officesupply.OfficeSupply;
import com.solvd.constructioncompany.materialresource.officesupply.Stapler;
import com.solvd.constructioncompany.project.ICount;
import com.solvd.constructioncompany.project.Project;
import com.solvd.constructioncompany.project.PromotionProject;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompanyUtils {

    public static List<Project> selectProjects(BigDecimal budget, ConstructionCompany company) {
        return company.getProjects().stream()
                .filter(project -> project.getPrice().compareTo(budget) < 0)
                .collect(Collectors.toList());
    }

    public static void showInformation(List<Source> sources) {
        sources.forEach(Source::show);
    }

    public static BigDecimal countSquare(ICount count, PromotionProject<Block, Stapler> project) {
        return count.countSquareMeterCost(project);
    }

    public static boolean checkGender(ICheck check, Employee employee) {
        return check.checkGender(employee);
    }

    public static Employee increaseSalary(IIncrease increase, Employee employee) {
        return increase.increaseSalary(employee);
    }

    public static boolean isPositive(Predicate<Integer> predicate, OfficeSupply supply) {
        return predicate.test(supply.getQuantity());
    }

    public static Integer convert(Function<String, Integer> function) {
        return function.apply("555");
    }
}
