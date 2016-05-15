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
            "activityLogs"
    })
    public class Activities {

        @JsonProperty("activityLogs")
        private List<ActivityLog> activityLogs = new ArrayList<ActivityLog>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The activityLogs
         */
        @JsonProperty("activityLogs")
        public List<ActivityLog> getActivityLogs() {
            return activityLogs;
        }

        /**
         *
         * @param activityLogs
         * The activityLogs
         */
        @JsonProperty("activityLogs")
        public void setActivityLogs(List<ActivityLog> activityLogs) {
            this.activityLogs = activityLogs;
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
