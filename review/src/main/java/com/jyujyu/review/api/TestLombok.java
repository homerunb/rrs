package com.jyujyu.review.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLombok {

    @GetMapping("/test/lombok")
    public String testLombok() {
        return "This is Lombok";
    }

}
