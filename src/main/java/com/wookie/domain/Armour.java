package com.wookie.domain;

import java.util.List;

public class Armour {

    private String name;
    private Integer armorLegs;
    private Integer armorArms;
    private Integer armorTorso;
    private Integer armorHead;
    private List<SpecialRule> rules;
    private Integer xpCost;
    private String classAvailability;

    public Armour(String name, Integer armorLegs, Integer armorArms, Integer armorTorso, Integer armorHead, List<SpecialRule> rules, Integer xpCost,
        String classAvailability) {
        this.name = name;
        this.armorLegs = armorLegs;
        this.armorArms = armorArms;
        this.armorTorso = armorTorso;
        this.armorHead = armorHead;
        this.rules = rules;
        this.xpCost = xpCost;
        this.classAvailability = classAvailability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArmorLegs() {
        return armorLegs;
    }

    public void setArmorLegs(Integer armorLegs) {
        this.armorLegs = armorLegs;
    }

    public Integer getArmorArms() {
        return armorArms;
    }

    public void setArmorArms(Integer armorArms) {
        this.armorArms = armorArms;
    }

    public Integer getArmorTorso() {
        return armorTorso;
    }

    public void setArmorTorso(Integer armorTorso) {
        this.armorTorso = armorTorso;
    }

    public Integer getArmorHead() {
        return armorHead;
    }

    public void setArmorHead(Integer armorHead) {
        this.armorHead = armorHead;
    }

    public List<SpecialRule> getRules() {
        return rules;
    }

    public void setRules(List<SpecialRule> rules) {
        this.rules = rules;
    }

    public Integer getXpCost() {
        return xpCost;
    }

    public void setXpCost(Integer xpCost) {
        this.xpCost = xpCost;
    }

    public String getClassAvailability() {
        return classAvailability;
    }

    public void setClassAvailability(String classAvailability) {
        this.classAvailability = classAvailability;
    }
}
