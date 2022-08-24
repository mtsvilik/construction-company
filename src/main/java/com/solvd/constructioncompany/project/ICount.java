package com.solvd.constructioncompany.project;

import java.math.BigDecimal;

@FunctionalInterface
public interface ICount {

    BigDecimal countSquareMeterCost(Integer square, BigDecimal price);

}
