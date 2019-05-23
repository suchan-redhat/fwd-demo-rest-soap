package com.fwd.demo.beans;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceInfo {
	@JsonProperty("__type")
    private String type;
	
	
    @JsonProperty("GrossPremium")
    private Integer grossPremium;
	
	
	@JsonProperty("DirectDiscount")
    private Integer directDiscount;
    
	
	@JsonProperty("DirectDAmount")
    private Integer directDAmount;
    
	
	@JsonProperty("SaleDiscount")
    private Integer saleDiscount;
    
	
	@JsonProperty("SaleDAmount")
    private Integer saleDAmount;
   
	
	@JsonProperty("Commission")
    private Double commission;
    
	
	@JsonProperty("CommissionAmount")
    private Double commissionAmount;
    
	
	@JsonProperty("TotalDue")
    private Double totalDue;
    
	
	@JsonProperty("AfterCoupon")
    private Integer afterCoupon;
    
	
	@JsonProperty("CommissionChange")
    private Double commissionChange;
    
	
	@JsonProperty("DirectDiscountChange")
    private Integer directDiscountChange;
    
	
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
    
	
	@JsonProperty("Tax")
    private Integer tax;
    
	
	@JsonProperty("TaxAmount")
    private Integer taxAmount;
    
	
	@JsonProperty("CouponAmount")
    private Integer couponAmount;
    
	
	@JsonProperty("InsuranceLevy")
    private InsuranceLevy insuranceLevy;
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getGrossPremium() {
        return grossPremium;
    }

    public void setGrossPremium(Integer grossPremium) {
        this.grossPremium = grossPremium;
    }

    public Integer getDirectDiscount() {
        return directDiscount;
    }

    public void setDirectDiscount(Integer directDiscount) {
        this.directDiscount = directDiscount;
    }

    public Integer getDirectDAmount() {
        return directDAmount;
    }

    public void setDirectDAmount(Integer directDAmount) {
        this.directDAmount = directDAmount;
    }

    public Integer getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(Integer saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public Integer getSaleDAmount() {
        return saleDAmount;
    }

    public void setSaleDAmount(Integer saleDAmount) {
        this.saleDAmount = saleDAmount;
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

    public Double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    public Integer getAfterCoupon() {
        return afterCoupon;
    }

    public void setAfterCoupon(Integer afterCoupon) {
        this.afterCoupon = afterCoupon;
    }

    public Double getCommissionChange() {
        return commissionChange;
    }

    public void setCommissionChange(Double commissionChange) {
        this.commissionChange = commissionChange;
    }

    public Integer getDirectDiscountChange() {
        return directDiscountChange;
    }

    public void setDirectDiscountChange(Integer directDiscountChange) {
        this.directDiscountChange = directDiscountChange;
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

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public InsuranceLevy getInsuranceLevy() {
        return insuranceLevy;
    }

    public void setInsuranceLevy(InsuranceLevy insuranceLevy) {
        this.insuranceLevy = insuranceLevy;
    }

}
