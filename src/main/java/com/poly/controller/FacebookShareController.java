package com.poly.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FacebookShareController {

    @Autowired
    HttpServletRequest req;
    
    @Autowired
    HttpSession ss;

    private static final String FACEBOOK_SHARE_URL = "https://www.facebook.com/dialog/share";
    private static final String APP_ID = "1035305550719180";

//    @GetMapping("/share-on-facebook")
//    @ResponseBody
//    public String shareOnFacebook(@RequestParam String url) {
//        String shareUrl = FACEBOOK_SHARE_URL +
//                "?app_id=" + APP_ID +
//                "&href=" + url +
//                "&display=popup";
//
//        return "<script>window.location.href='" + shareUrl + "';</script>";
//    }

    @GetMapping("/share-on-facebook")
    @ResponseBody
    public String shareOnFacebook() {
        String url = (String) ss.getAttribute("url");
        System.out.println(url);
        String shareUrl = FACEBOOK_SHARE_URL +
                "?app_id=" + APP_ID +
                "&href=" + url +
                "&display=popup";

        return "<script>window.location.href='" + shareUrl + "';</script>";
    }

    @GetMapping("/")
    public String getHome() {
    	String url = req.getRequestURL().toString();
    	ss.setAttribute("url", url);
        return "index";
    }
}

