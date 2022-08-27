package com.solvd.constructioncompany.project;

import com.solvd.constructioncompany.materialresource.material.Block;
import com.solvd.constructioncompany.materialresource.officesupply.Stapler;

import java.math.BigDecimal;

@FunctionalInterface
public interface ICount {

    BigDecimal countSquareMeterCost(PromotionProject<Block, Stapler> project);

}
