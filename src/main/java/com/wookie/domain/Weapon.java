package com.wookie.domain;

import java.util.List;
import java.util.Optional;

public class Weapon {
    private String name;
    private Integer damage;
    private List<SpecialRule> specialRules;
    private Integer xpCost;
    private Optional<Integer> xpCostBuildIn;
    private String classAvailability;

    public Weapon(String name, Integer damage, List<SpecialRule> specialRules, Integer xpCost, Optional<Integer> xpCostBuildIn, String classAvailability) {
        this.name = name;
        this.damage = damage;
        this.specialRules = specialRules;
        this.xpCost = xpCost;
        this.xpCostBuildIn = xpCostBuildIn;
        this.classAvailability = classAvailability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public List<SpecialRule> getSpecialRules() {
        return specialRules;
    }

    public void setSpecialRules(List<SpecialRule> specialRules) {
        this.specialRules = specialRules;
    }

    public Integer getXpCost() {
        return xpCost;
    }

    public void setXpCost(Integer xpCost) {
        this.xpCost = xpCost;
    }

    public Optional<Integer> getXpCostBuildIn() {
        return xpCostBuildIn;
    }

    public void setXpCostBuildIn(Optional<Integer> xpCostBuildIn) {
        this.xpCostBuildIn = xpCostBuildIn;
    }

    public String getClassAvailability() {
        return classAvailability;
    }

    public void setClassAvailability(String classAvailability) {
        this.classAvailability = classAvailability;
    }
}
