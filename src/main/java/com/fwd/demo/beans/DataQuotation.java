package com.fwd.demo.beans;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fwd.demo.beans.DiscountParty;
import com.fwd.demo.beans.InsuredSummary;
import com.fwd.demo.beans.Intermediary;
import com.fwd.demo.beans.PlanBPriceInfo;
import com.fwd.demo.beans.PriceInfo;

public class DataQuotation {
	
	@JsonProperty("__type")
    private String type;
	
    @JsonProperty("BusinessSource")
    private Integer businessSource;
	
    @JsonProperty("DiscountParty")    
    private DiscountParty discountParty;
	
    @JsonProperty("Intermediary")
    private Intermediary intermediary;
	
    @JsonProperty("IsCommissionOverride")
    private Boolean isCommissionOverride;
	
    @JsonProperty("PolicyEndorsement")
    private Integer policyEndorsement;
	
    @JsonProperty("PolicyRenewal")
    private Integer policyRenewal;
	
    @JsonProperty("PriceInfo")
    private PriceInfo priceInfo;
	
    @JsonProperty("RequestVer")
    private Integer requestVer;
	
    @JsonProperty("System")
    private String system;
	
    @JsonProperty("TransactionStatus")
    private Integer transactionStatus;
	
    @JsonProperty("eWalletFlag")
    private Boolean eWalletFlag;
	
    @JsonProperty("ApproveDateStr")
    private String approveDateStr;
	
    @JsonProperty("ChildCover")
    private Boolean childCover;
	
    @JsonProperty("ChildInput")
    private Integer childInput;
	
    @JsonProperty("CommencementDateStr")
    private String commencementDateStr;
	
    @JsonProperty("Corporate")
    private Boolean corporate;
	
    @JsonProperty("ExpiryDateStr")
    private String expiryDateStr;
	
    @JsonProperty("InsuredSummary")
    private InsuredSummary insuredSummary;
	
    @JsonProperty("IssueDateStr")
    private String issueDateStr;
	
    @JsonProperty("Noofday")
    private Integer noofday;
	
    @JsonProperty("OtherInput")
    private Integer otherInput;
	
    @JsonProperty("Plan")
    private String plan;
	
    @JsonProperty("PlanB")
    private String planB;
	
    @JsonProperty("PlanBPriceInfo")
    private PlanBPriceInfo planBPriceInfo;
	
    @JsonProperty("SelfCover")
    private Boolean selfCover;
	
    @JsonProperty("SpouseCover")
    private Boolean spouseCover;
	
    @JsonProperty("TransactionDateStr")
    private String transactionDateStr;
	

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBusinessSource() {
        return businessSource;
    }

    public void setBusinessSource(Integer businessSource) {
        this.businessSource = businessSource;
    }

    public DiscountParty getDiscountParty() {
        return discountParty;
    }

    public void setDiscountParty(DiscountParty discountParty) {
        this.discountParty = discountParty;
    }

    public Intermediary getIntermediary() {
        return intermediary;
    }

    public void setIntermediary(Intermediary intermediary) {
        this.intermediary = intermediary;
    }

    public Boolean getIsCommissionOverride() {
        return isCommissionOverride;
    }

    public void setIsCommissionOverride(Boolean isCommissionOverride) {
        this.isCommissionOverride = isCommissionOverride;
    }

    public Integer getPolicyEndorsement() {
        return policyEndorsement;
    }

    public void setPolicyEndorsement(Integer policyEndorsement) {
        this.policyEndorsement = policyEndorsement;
    }

    public Integer getPolicyRenewal() {
        return policyRenewal;
    }

    public void setPolicyRenewal(Integer policyRenewal) {
        this.policyRenewal = policyRenewal;
    }

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public Integer getRequestVer() {
        return requestVer;
    }

    public void setRequestVer(Integer requestVer) {
        this.requestVer = requestVer;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Boolean getEWalletFlag() {
        return eWalletFlag;
    }

    public void setEWalletFlag(Boolean eWalletFlag) {
        this.eWalletFlag = eWalletFlag;
    }

    public String getApproveDateStr() {
        return approveDateStr;
    }

    public void setApproveDateStr(String approveDateStr) {
        this.approveDateStr = approveDateStr;
    }

    public Boolean getChildCover() {
        return childCover;
    }

    public void setChildCover(Boolean childCover) {
        this.childCover = childCover;
    }

    public Integer getChildInput() {
        return childInput;
    }

    public void setChildInput(Integer childInput) {
        this.childInput = childInput;
    }

    public String getCommencementDateStr() {
        return commencementDateStr;
    }

    public void setCommencementDateStr(String commencementDateStr) {
        this.commencementDateStr = commencementDateStr;
    }

    public Boolean getCorporate() {
        return corporate;
    }

    public void setCorporate(Boolean corporate) {
        this.corporate = corporate;
    }

    public String getExpiryDateStr() {
        return expiryDateStr;
    }

    public void setExpiryDateStr(String expiryDateStr) {
        this.expiryDateStr = expiryDateStr;
    }

    public InsuredSummary getInsuredSummary() {
        return insuredSummary;
    }

    public void setInsuredSummary(InsuredSummary insuredSummary) {
        this.insuredSummary = insuredSummary;
    }

    public String getIssueDateStr() {
        return issueDateStr;
    }

    public void setIssueDateStr(String issueDateStr) {
        this.issueDateStr = issueDateStr;
    }

    public Integer getNoofday() {
        return noofday;
    }

    public void setNoofday(Integer noofday) {
        this.noofday = noofday;
    }

    public Integer getOtherInput() {
        return otherInput;
    }

    public void setOtherInput(Integer otherInput) {
        this.otherInput = otherInput;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPlanB() {
        return planB;
    }

    public void setPlanB(String planB) {
        this.planB = planB;
    }

    public PlanBPriceInfo getPlanBPriceInfo() {
        return planBPriceInfo;
    }

    public void setPlanBPriceInfo(PlanBPriceInfo planBPriceInfo) {
        this.planBPriceInfo = planBPriceInfo;
    }

    public Boolean getSelfCover() {
        return selfCover;
    }

    public void setSelfCover(Boolean selfCover) {
        this.selfCover = selfCover;
    }

    public Boolean getSpouseCover() {
        return spouseCover;
    }

    public void setSpouseCover(Boolean spouseCover) {
        this.spouseCover = spouseCover;
    }

    public String getTransactionDateStr() {
        return transactionDateStr;
    }

    public void setTransactionDateStr(String transactionDateStr) {
        this.transactionDateStr = transactionDateStr;
    }

}
