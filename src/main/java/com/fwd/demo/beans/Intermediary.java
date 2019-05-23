package com.fwd.demo.beans;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Intermediary {
    @JsonProperty("__type")
    private String type;
	
    @JsonProperty("Name")
    private String name;
	
    @JsonProperty("Code")
    private String code;
	

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
