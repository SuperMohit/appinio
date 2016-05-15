package com.apponio.entity;

/**
 * Created by mohit on 5/15/16.
 */

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
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
            "errors"
    })
    public class Errors {

        @JsonProperty("errors")
        private List<JSError> errors = new ArrayList<JSError>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The errors
         */
        @JsonProperty("errors")
        public List<JSError> getErrors() {
            return errors;
        }

        /**
         *
         * @param errors
         * The errors
         */
        @JsonProperty("errors")
        public void setErrors(List<JSError> errors) {
            this.errors = errors;
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

