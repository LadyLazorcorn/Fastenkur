package com.lazorcorn.fastenkur.mvp.model;

public class FastingCureResponseFastingCure {
    private FastingCureResponseFastingCureGlossary[] glossary;
    private FastingCureResponseFastingCureRecipes[] recipes;
    private FastingCureResponseFastingCureProgrammTwoWeeks[] programmTwoWeeks;
    private FastingCureResponseFastingCureTwoWeeksShoppingList[] twoWeeksShoppingList;
    private FastingCureResponseFastingCureMotivational[] motivational;
    private FastingCureResponseFastingCurePrepPhase[] prepPhase;
    private FastingCureResponseFastingCurePoint point;

    public FastingCureResponseFastingCureGlossary[] getGlossary() {
        return this.glossary;
    }

    public void setGlossary(FastingCureResponseFastingCureGlossary[] glossary) {
        this.glossary = glossary;
    }

    public FastingCureResponseFastingCureRecipes[] getRecipes() {
        return this.recipes;
    }

    public void setRecipes(FastingCureResponseFastingCureRecipes[] recipes) {
        this.recipes = recipes;
    }

    public FastingCureResponseFastingCureProgrammTwoWeeks[] getProgrammTwoWeeks() {
        return this.programmTwoWeeks;
    }

    public void setProgrammTwoWeeks(FastingCureResponseFastingCureProgrammTwoWeeks[] programmTwoWeeks) {
        this.programmTwoWeeks = programmTwoWeeks;
    }

    public FastingCureResponseFastingCureTwoWeeksShoppingList[] getTwoWeeksShoppingList() {
        return this.twoWeeksShoppingList;
    }

    public void setTwoWeeksShoppingList(FastingCureResponseFastingCureTwoWeeksShoppingList[] twoWeeksShoppingList) {
        this.twoWeeksShoppingList = twoWeeksShoppingList;
    }

    public FastingCureResponseFastingCureMotivational[] getMotivational() {
        return this.motivational;
    }

    public void setMotivational(FastingCureResponseFastingCureMotivational[] motivational) {
        this.motivational = motivational;
    }

    public FastingCureResponseFastingCurePrepPhase[] getPrepPhase() {
        return this.prepPhase;
    }

    public void setPrepPhase(FastingCureResponseFastingCurePrepPhase[] prepPhase) {
        this.prepPhase = prepPhase;
    }

    public FastingCureResponseFastingCurePoint getPoint() {
        return this.point;
    }

    public void setPoint(FastingCureResponseFastingCurePoint point) {
        this.point = point;
    }
}
