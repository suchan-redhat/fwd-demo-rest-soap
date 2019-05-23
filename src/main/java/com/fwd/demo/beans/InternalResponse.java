package com.fwd.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fwd.demo.beans.DataQuotation;
import com.fwd.demo.beans.Message;

public class InternalResponse {

	@JsonProperty("systemError")
    private Boolean systemError;
	
	
    @JsonProperty("IsSystemError")
    private Boolean isSystemError;
	
	
    @JsonProperty("Result")
    private Boolean result;
	
	
    @JsonProperty("Message")
    private Message message;
	
	
    @JsonProperty("DataQuotation")
    private DataQuotation dataQuotation;
	
    public Boolean getSystemError() {
        return systemError;
    }

    public void setSystemError(Boolean systemError) {
        this.systemError = systemError;
    }

    public Boolean getIsSystemError() {
        return isSystemError;
    }

    public void setIsSystemError(Boolean isSystemError) {
        this.isSystemError = isSystemError;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public DataQuotation getDataQuotation() {
        return dataQuotation;
    }

    public void setDataQuotation(DataQuotation dataQuotation) {
        this.dataQuotation = dataQuotation;
    }

}
