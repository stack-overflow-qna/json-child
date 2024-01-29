package com.romach007.json_child;

import com.google.gson.Gson;
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
        String response = new Gson().toJson(requestPacket);
        System.out.println(response);
        return response;
    }
}
