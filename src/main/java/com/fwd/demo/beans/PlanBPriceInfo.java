package com.fwd.demo.beans;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanBPriceInfo {
	@JsonProperty("__type")
    private String type;
	
	
    @JsonProperty("AfterCoupon")
    private Integer afterCoupon;
	
	
    @JsonProperty("Commission")
    private Double commission;
	
	
    @JsonProperty("CommissionAmount")
    private Double commissionAmount;
	
	
    @JsonProperty("CommissionChange")
    private Double commissionChange;
	
	
    @JsonProperty("CouponAmount")
    private Integer couponAmount;
	
	
    @JsonProperty("DirectDAmount")
    private Integer directDAmount;
	
	
    @JsonProperty("DirectDiscount")
    private Integer directDiscount;
	
	
    @JsonProperty("DirectDiscountChange")
    private Integer directDiscountChange;
	
	
    @JsonProperty("GrossPremium")
    private Integer grossPremium;
    
    
    @JsonProperty("GroupDAmount")
    private Integer groupDAmount;
    
    
    @JsonProperty("GroupDiscount")
    private Integer groupDiscount;
    
    
    @JsonProperty("GroupDiscountChange")
    private Integer groupDiscountChange;
    
    
    @JsonProperty("Levy")
    private Integer levy;
    
    
    @JsonProperty("LevyAmount")
    private Integer levyAmount;
    
    
    @JsonProperty("NetPremium")
    private Double netPremium;
    
    
    @JsonProperty("SaleDAmount")
    private Integer saleDAmount;
    
    
    @JsonProperty("SaleDiscount")
    private Integer saleDiscount;
    
    
    @JsonProperty("Tax")
    private Integer tax;
    
    
    @JsonProperty("TaxAmount")
    private Integer taxAmount;
    
    
    @JsonProperty("TotalDue")
    private Double totalDue;
    
    
    @JsonProperty("InsuranceLevy")
    private InsuranceLevy insuranceLevy;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAfterCoupon() {
        return afterCoupon;
    }

    public void setAfterCoupon(Integer afterCoupon) {
        this.afterCoupon = afterCoupon;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Double getCommissionChange() {
        return commissionChange;
    }

    public void setCommissionChange(Double commissionChange) {
        this.commissionChange = commissionChange;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getDirectDAmount() {
        return directDAmount;
    }

    public void setDirectDAmount(Integer directDAmount) {
        this.directDAmount = directDAmount;
    }

    public Integer getDirectDiscount() {
        return directDiscount;
    }

    public void setDirectDiscount(Integer directDiscount) {
        this.directDiscount = directDiscount;
    }

    public Integer getDirectDiscountChange() {
        return directDiscountChange;
    }

    public void setDirectDiscountChange(Integer directDiscountChange) {
        this.directDiscountChange = directDiscountChange;
    }

    public Integer getGrossPremium() {
        return grossPremium;
    }

    public void setGrossPremium(Integer grossPremium) {
        this.grossPremium = grossPremium;
    }

    public Integer getGroupDAmount() {
        return groupDAmount;
    }

    public void setGroupDAmount(Integer groupDAmount) {
        this.groupDAmount = groupDAmount;
    }

    public Integer getGroupDiscount() {
        return groupDiscount;
    }

    public void setGroupDiscount(Integer groupDiscount) {
        this.groupDiscount = groupDiscount;
    }

    public Integer getGroupDiscountChange() {
        return groupDiscountChange;
    }

    public void setGroupDiscountChange(Integer groupDiscountChange) {
        this.groupDiscountChange = groupDiscountChange;
    }

    public Integer getLevy() {
        return levy;
    }

    public void setLevy(Integer levy) {
        this.levy = levy;
    }

    public Integer getLevyAmount() {
        return levyAmount;
    }

    public void setLevyAmount(Integer levyAmount) {
        this.levyAmount = levyAmount;
    }

    public Double getNetPremium() {
        return netPremium;
    }

    public void setNetPremium(Double netPremium) {
        this.netPremium = netPremium;
    }

    public Integer getSaleDAmount() {
        return saleDAmount;
    }

    public void setSaleDAmount(Integer saleDAmount) {
        this.saleDAmount = saleDAmount;
    }

    public Integer getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Integer saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    public InsuranceLevy getInsuranceLevy() {
        return insuranceLevy;
    }

    public void setInsuranceLevy(InsuranceLevy insuranceLevy) {
        this.insuranceLevy = insuranceLevy;
    }

}
