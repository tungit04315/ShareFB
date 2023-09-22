package com.poly.rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrentURLController {

    @GetMapping("/current-url")
    public String getCurrentURL(HttpServletRequest request) {
        // Lấy địa chỉ URL hiện tại từ đối tượng HttpServletRequest
        String currentURL = request.getRequestURL().toString();

        return "Địa chỉ URL hiện tại: " + currentURL;
    }
}
