package com.romach007.json_child;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class JavaDeveloperJsonSerializer implements JsonSerializer<JavaDeveloper> {

    @Override
    public JsonElement serialize(JavaDeveloper javaDeveloper, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add("name", context.serialize(javaDeveloper.getName()));
        object.add("pan", context.serialize(javaDeveloper.getPan()));
        object.add("currentProject", context.serialize(javaDeveloper.getCurrentProject()));
        object.add("timeline", context.serialize(javaDeveloper.getTimeline()));
        return object;
    }

}
