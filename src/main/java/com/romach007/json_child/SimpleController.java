package com.romach007.json_child;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String createJavaDeveloper(@Valid @RequestBody JavaDeveloper requestPacket) {
        Gson gson = new GsonBuilder().registerTypeAdapter(JavaDeveloper.class, new JavaDeveloperJsonSerializer()).create();
        String response = gson.toJson(requestPacket);
        System.out.println(response);
        return response;
    }

    @RequestMapping(value = "/createUserJackson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String createJavaDeveloperJackson(@Valid @RequestBody JavaDeveloper requestPacket) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String response = mapper.writeValueAsString(requestPacket);
        System.out.println(response);
        return response;
    }
}
