package com.main.weggies.model.recipe;

import java.util.List;

public class Instructions {
    private String testerTips;
    private String chefTips;
    private String equipment;
    private String directions;
    private String disclaimer;
    private List<String> prerequisites;

    public String getTesterTips() {
        return testerTips;
    }

    public void setTesterTips(String testerTips) {
        this.testerTips = testerTips;
    }

    public String getChefTips() {
        return chefTips;
    }

    public void setChefTips(String chefTips) {
        this.chefTips = chefTips;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
}
