package com.fwd.demo.beans;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
	@JsonProperty("ErrorAction")
    private List<Object> errorAction = null;
	
	
    @JsonProperty("ErrorFlag")
    private Boolean errorFlag;
	
	
    @JsonProperty("ErrorMessage")
    private List<Object> errorMessage = null;
    
    
    @JsonProperty("ErrorCode")
    private List<Object> errorCode = null;
    
    
    @JsonProperty("InformationFlag")
    private Boolean informationFlag;
    
    
    @JsonProperty("InformationMessage")
    private List<Object> informationMessage = null;
    
    
    @JsonProperty("WarningFlag")
    private Boolean warningFlag;
    
    
    @JsonProperty("WarningMessage")
    private List<Object> warningMessage = null;
    
    public List<Object> getErrorAction() {
        return errorAction;
    }

    public void setErrorAction(List<Object> errorAction) {
        this.errorAction = errorAction;
    }

    public Boolean getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(Boolean errorFlag) {
        this.errorFlag = errorFlag;
    }

    public List<Object> getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(List<Object> errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Object> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(List<Object> errorCode) {
        this.errorCode = errorCode;
    }

    public Boolean getInformationFlag() {
        return informationFlag;
    }

    public void setInformationFlag(Boolean informationFlag) {
        this.informationFlag = informationFlag;
    }

    public List<Object> getInformationMessage() {
        return informationMessage;
    }

    public void setInformationMessage(List<Object> informationMessage) {
        this.informationMessage = informationMessage;
    }

    public Boolean getWarningFlag() {
        return warningFlag;
    }

    public void setWarningFlag(Boolean warningFlag) {
        this.warningFlag = warningFlag;
    }

    public List<Object> getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(List<Object> warningMessage) {
        this.warningMessage = warningMessage;
    }

}
