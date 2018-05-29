package com.wookie.domain;

import java.util.List;
import java.util.Optional;

public class MeleeWeapon extends Weapon{

    public MeleeWeapon(String name, Integer damage, List<SpecialRule> specialRules, Integer xpCost, Optional<Integer> xpCostBuildIn, String classAvailability) {
        super(name, damage, specialRules, xpCost, xpCostBuildIn, classAvailability);
    }
}
