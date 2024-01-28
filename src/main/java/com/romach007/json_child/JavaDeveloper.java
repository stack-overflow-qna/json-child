package com.romach007.json_child;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JavaDeveloper extends CommonInfo{

    @NotNull(message = "currentPoject is mandatory")
    String currentPoject;

    @NotNull(message = "timeline is mandatory")
    String timeline;

    public String getCurrentPoject() {
        return currentPoject;
    }

    public void setCurrentPoject(String currentPoject) {
        this.currentPoject = currentPoject;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }
}
