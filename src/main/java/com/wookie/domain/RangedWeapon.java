package com.wookie.domain;

import java.util.List;
import java.util.Optional;

public class RangedWeapon extends Weapon {
    public RangedWeapon(String name, Integer damage, List<SpecialRule> specialRules, Integer xpCost, Optional<Integer> xpCostBuildIn, String classAvailability) {
        super(name, damage, specialRules, xpCost, xpCostBuildIn, classAvailability);
    }
}
