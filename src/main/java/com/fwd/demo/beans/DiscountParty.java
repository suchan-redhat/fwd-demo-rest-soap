package com.fwd.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiscountParty {

	@JsonProperty("__type")
    private String type;
	
	@JsonProperty("PromoteCode")
    private String promoteCode;
	
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPromoteCode() {
        return promoteCode;
    }

    public void setPromoteCode(String promoteCode) {
        this.promoteCode = promoteCode;
    }
    
}
