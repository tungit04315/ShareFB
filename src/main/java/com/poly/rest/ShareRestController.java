package com.poly.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShareRestController {

    private static final String app_id = "1035305550719180";
    private static final String app_secret = "fb34d19aac2c504bc504f3c650293ae6";

    @GetMapping("/share")
    public String getShare(){

        String postUrl = app_id + "/me/feed";
        String fullUrl = postUrl + "?message=" + "message" + "&access_token=" + app_secret;

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(fullUrl, postUrl, String.class);

        return "chia se thanh cong";
    }
}
