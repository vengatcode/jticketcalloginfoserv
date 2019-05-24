
package com.paypal.springbootstarter.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "corrsearchid"
})

//@JsonDeserialize(as = Corrsearchid.class)
public class CorrelationResponse {

	/**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corrsearchid")
    private Corrsearchid corrsearchid;
    @JsonIgnore
    private Map<String, Corrsearchid> additionalProperties = new HashMap<String, Corrsearchid>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corrsearchid")
    public Corrsearchid getCorrsearchid() {
        return corrsearchid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("corrsearchid")
    public void setCorrsearchid(Corrsearchid corrsearchid) {
        this.corrsearchid = corrsearchid;
    }

    @JsonAnyGetter
    public Map<String, Corrsearchid> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Corrsearchid value) {
        this.additionalProperties.put(name, value);
    }

}
