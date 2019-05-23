package com.fwd.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fwd.demo.beans.DataQuotation;

public class InternalRequest {

	
	@JsonProperty("__type")
    private String type;
	
	
    @JsonProperty("AppFrom")
    private String appFrom;
	
	
    @JsonProperty("Channel")
    private String channel;
	
	
    @JsonProperty("Company")
    private String company;
	
	
    @JsonProperty("Lang")
    private String lang;
	
	
    @JsonProperty("ProductName")
    private String productName;
	
	
    @JsonProperty("System")
    private String system;
	
	
    @JsonProperty("UserID")
    private String userID;
	
	
    @JsonProperty("Source")
    private String source;
	
    @JsonProperty("DataQuotation")
	private DataQuotation dataQuotation;
	
	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAppFrom() {
        return appFrom;
    }

    public void setAppFrom(String appFrom) {
        this.appFrom = appFrom;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public DataQuotation getDataQuotation() {
        return dataQuotation;
    }

    public void setDataQuotation(DataQuotation dataQuotation) {
        this.dataQuotation = dataQuotation;
    }	
}
