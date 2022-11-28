package com.interview.assesment;

import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
public class UserClient {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String URL="https://randomuser.me/api/";

    @GetMapping("users")
    public ResponseEntity<List<UserDTO>> users() throws JsonProcessingException {

        String json = restTemplate.getForObject(URL, String.class);
        ObjectMapper mapper = new ObjectMapper();
        String gender = mapper.readTree(json).get("results").get(0).get("gender").asText();
        String lastName = mapper.readTree(json).get("results").get(0).get("name").get("last").asText();
        String firstName = mapper.readTree(json).get("results").get(0).get("name").get("first").asText();
        UUID uuid=  UUID.fromString(mapper.readTree(json).get("results").get(0).get("login").get("uuid").asText());
        String city = mapper.readTree(json).get("results").get(0).get("location").get("city").asText();
        String registrationDate = mapper.readTree(json).get("results").get(0).get("registered").get("date").asText();

        //JsonNode res = mapper.readTree(json).get("results");

        //System.out.println(res);

        UserDTO userDTO= new UserDTO(uuid,gender,firstName,lastName,city,registrationDate);
        return ResponseEntity.ok(List.of(userDTO));

    }
}
