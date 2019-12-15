package com.auth.server.resourse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultResourse {

    @RequestMapping("/")
    public String welcome() {
        return "welcome!";
    }
}
