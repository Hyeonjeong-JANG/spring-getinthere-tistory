package com.example.getintheretistory.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/detail")
    public String detail() {

        return "detail";
    }
}
