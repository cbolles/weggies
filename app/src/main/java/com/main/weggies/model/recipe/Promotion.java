package com.main.weggies.model.recipe;

import java.util.List;

public class Promotion {
    List<String> seasons;
    List<String> years;

    public List<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<String> seasons) {
        this.seasons = seasons;
    }

    public List<String> getYears() {
        return years;
    }

    public void setYears(List<String> years) {
        this.years = years;
    }
}
