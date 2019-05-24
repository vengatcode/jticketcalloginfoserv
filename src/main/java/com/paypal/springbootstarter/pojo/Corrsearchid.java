
package com.paypal.springbootstarter.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "environment",
    "tags",
    "callSummary"
})
//@JsonDeserialize(as = CorrCallSummary.class)
public class Corrsearchid {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    private String environment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    private List<Object> tags = null;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("callSummary")
    private List<CorrCallSummary> callSummary = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("callSummary")
    public List<CorrCallSummary> getCallSummary() {
        return callSummary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("callSummary")
    public void setCallSummary(List<CorrCallSummary> callSummary) {
        this.callSummary = callSummary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public Corrsearchid() {

	}

}
