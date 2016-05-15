package com.apponio.entity;

/**
 * Created by mohit on 5/15/16.
 */
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "errortype",
        "priority",
        "errordetails"
})
public class JSError {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("errortype")
    private String errortype;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("errordetails")
    private String errordetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The errortype
     */
    @JsonProperty("errortype")
    public String getErrortype() {
        return errortype;
    }

    /**
     *
     * @param errortype
     * The errortype
     */
    @JsonProperty("errortype")
    public void setErrortype(String errortype) {
        this.errortype = errortype;
    }

    /**
     *
     * @return
     * The priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     *
     * @param priority
     * The priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     *
     * @return
     * The errordetails
     */
    @JsonProperty("errordetails")
    public String getErrordetails() {
        return errordetails;
    }

    /**
     *
     * @param errordetails
     * The errordetails
     */
    @JsonProperty("errordetails")
    public void setErrordetails(String errordetails) {
        this.errordetails = errordetails;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
