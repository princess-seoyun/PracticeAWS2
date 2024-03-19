package com.example.diary_back.controller;

import com.example.diary_back.dto.SaveDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diary")
public class MainController {

    @GetMapping("/main")
    public String mainP() {

        String main = "메인 페이지";

        return main;
    }
}
