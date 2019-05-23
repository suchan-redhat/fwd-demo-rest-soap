package com.fwd.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceLevy {
	
	@JsonProperty("LevyAmount")
    private Double levyAmount;
	
	@JsonProperty("LevyCap")
    private Double levyCap;
	
	@JsonProperty("LevyRate")
    private Double levyRate;
	
	@JsonProperty("LevyEffectiveDate")
    private String levyEffectiveDate;
	
	@JsonProperty("LevyEffectiveDateStr")
    private String levyEffectiveDateStr;
	
    public Double getLevyAmount() {
        return levyAmount;
    }

    public void setLevyAmount(Double levyAmount) {
        this.levyAmount = levyAmount;
    }

    public Double getLevyCap() {
        return levyCap;
    }

    public void setLevyCap(Double levyCap) {
        this.levyCap = levyCap;
    }

    public Double getLevyRate() {
        return levyRate;
    }

    public void setLevyRate(Double levyRate) {
        this.levyRate = levyRate;
    }

    public String getLevyEffectiveDate() {
        return levyEffectiveDate;
    }

    public void setLevyEffectiveDate(String levyEffectiveDate) {
        this.levyEffectiveDate = levyEffectiveDate;
    }

    public String getLevyEffectiveDateStr() {
        return levyEffectiveDateStr;
    }

    public void setLevyEffectiveDateStr(String levyEffectiveDateStr) {
        this.levyEffectiveDateStr = levyEffectiveDateStr;
    }
}
