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
        "opinion",
        "jevent",
        "comment",
        "os",
        "browser"
})
public class ActivityLog {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("opinion")
    private Object opinion;
    @JsonProperty("jevent")
    private String jevent;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("os")
    private String os;
    @JsonProperty("browser")
    private String browser;
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
     * The opinion
     */
    @JsonProperty("opinion")
    public Object getOpinion() {
        return opinion;
    }

    /**
     *
     * @param opinion
     * The opinion
     */
    @JsonProperty("opinion")
    public void setOpinion(Object opinion) {
        this.opinion = opinion;
    }

    /**
     *
     * @return
     * The jevent
     */
    @JsonProperty("jevent")
    public String getJevent() {
        return jevent;
    }

    /**
     *
     * @param jevent
     * The jevent
     */
    @JsonProperty("jevent")
    public void setJevent(String jevent) {
        this.jevent = jevent;
    }

    /**
     *
     * @return
     * The comment
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The os
     */
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    /**
     *
     * @param os
     * The os
     */
    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    /**
     *
     * @return
     * The browser
     */
    @JsonProperty("browser")
    public String getBrowser() {
        return browser;
    }

    /**
     *
     * @param browser
     * The browser
     */
    @JsonProperty("browser")
    public void setBrowser(String browser) {
        this.browser = browser;
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