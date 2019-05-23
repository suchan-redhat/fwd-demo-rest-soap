package com.fwd.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuredSummary {
	
	@JsonProperty("__type")
    private String type;
	
	@JsonProperty("ChildCount")
    private Integer childCount;
	
	
    @JsonProperty("FamilyPlanBPremium")
    private Integer familyPlanBPremium;
	
	
    @JsonProperty("FamilyPlanCount")
    private Integer familyPlanCount;
	
	
    @JsonProperty("FamilyPlanPremium")
    private Integer familyPlanPremium;
	
	
    @JsonProperty("IndividualPlanBPremium")
    private Integer individualPlanBPremium;
	
	
    @JsonProperty("IndividualPlanCount")
    private Integer individualPlanCount;
	
	
    @JsonProperty("IndividualPlanPremium")
    private Integer individualPlanPremium;
	
	
    @JsonProperty("OtherCount")
    private Integer otherCount;
	
	
    @JsonProperty("SelfCount")
    private Integer selfCount;
	
	
    @JsonProperty("SpouseCount")
    private Integer spouseCount;
	
	
    @JsonProperty("WithChildPlanBPremium")
    private Integer withChildPlanBPremium;
	
	
    @JsonProperty("WithChildPlanCount")
    private Integer withChildPlanCount;
	
	
    @JsonProperty("WithChildPlanPremium")
    private Integer withChildPlanPremium;
	
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Integer getFamilyPlanBPremium() {
        return familyPlanBPremium;
    }

    public void setFamilyPlanBPremium(Integer familyPlanBPremium) {
        this.familyPlanBPremium = familyPlanBPremium;
    }

    public Integer getFamilyPlanCount() {
        return familyPlanCount;
    }

    public void setFamilyPlanCount(Integer familyPlanCount) {
        this.familyPlanCount = familyPlanCount;
    }

    public Integer getFamilyPlanPremium() {
        return familyPlanPremium;
    }

    public void setFamilyPlanPremium(Integer familyPlanPremium) {
        this.familyPlanPremium = familyPlanPremium;
    }

    public Integer getIndividualPlanBPremium() {
        return individualPlanBPremium;
    }

    public void setIndividualPlanBPremium(Integer individualPlanBPremium) {
        this.individualPlanBPremium = individualPlanBPremium;
    }

    public Integer getIndividualPlanCount() {
        return individualPlanCount;
    }

    public void setIndividualPlanCount(Integer individualPlanCount) {
        this.individualPlanCount = individualPlanCount;
    }

    public Integer getIndividualPlanPremium() {
        return individualPlanPremium;
    }

    public void setIndividualPlanPremium(Integer individualPlanPremium) {
        this.individualPlanPremium = individualPlanPremium;
    }

    public Integer getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(Integer otherCount) {
        this.otherCount = otherCount;
    }

    public Integer getSelfCount() {
        return selfCount;
    }

    public void setSelfCount(Integer selfCount) {
        this.selfCount = selfCount;
    }

    public Integer getSpouseCount() {
        return spouseCount;
    }

    public void setSpouseCount(Integer spouseCount) {
        this.spouseCount = spouseCount;
    }

    public Integer getWithChildPlanBPremium() {
        return withChildPlanBPremium;
    }

    public void setWithChildPlanBPremium(Integer withChildPlanBPremium) {
        this.withChildPlanBPremium = withChildPlanBPremium;
    }

    public Integer getWithChildPlanCount() {
        return withChildPlanCount;
    }

    public void setWithChildPlanCount(Integer withChildPlanCount) {
        this.withChildPlanCount = withChildPlanCount;
    }

    public Integer getWithChildPlanPremium() {
        return withChildPlanPremium;
    }

    public void setWithChildPlanPremium(Integer withChildPlanPremium) {
        this.withChildPlanPremium = withChildPlanPremium;
    }
}
