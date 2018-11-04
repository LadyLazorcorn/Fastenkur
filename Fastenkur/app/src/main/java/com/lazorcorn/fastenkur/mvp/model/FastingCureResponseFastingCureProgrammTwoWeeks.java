package com.lazorcorn.fastenkur.mvp.model;

public class FastingCureResponseFastingCureProgrammTwoWeeks {
    private FastingCureResponseFastingCureProgrammTwoWeeksTexts texts;
    private FastingCureResponseFastingCureProgrammTwoWeeksGroceryDayList[] groceryDayList;
    private String category;
    private int day;

    public FastingCureResponseFastingCureProgrammTwoWeeksTexts getTexts() {
        return this.texts;
    }

    public void setTexts(FastingCureResponseFastingCureProgrammTwoWeeksTexts texts) {
        this.texts = texts;
    }

    public FastingCureResponseFastingCureProgrammTwoWeeksGroceryDayList[] getGroceryDayList() {
        return this.groceryDayList;
    }

    public void setGroceryDayList(FastingCureResponseFastingCureProgrammTwoWeeksGroceryDayList[] groceryDayList) {
        this.groceryDayList = groceryDayList;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
