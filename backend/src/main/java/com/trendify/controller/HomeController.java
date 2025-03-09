package com.trendify.controller;

import com.trendify.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping

    public ApiResponse HomeControllerHandler(){
        ApiResponse api = new ApiResponse();
        api.setMsg("Welcom to Trendify");
        return api;
    }
}
