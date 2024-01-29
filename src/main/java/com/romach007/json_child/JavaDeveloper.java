package com.romach007.json_child;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JavaDeveloper extends CommonInfo{

    @NotNull(message = "currentProject is mandatory")
    String currentProject;

    @NotNull(message = "timeline is mandatory")
    String timeline;

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentPoject) {
        this.currentProject = currentPoject;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }
}
