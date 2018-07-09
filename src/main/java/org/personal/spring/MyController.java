package org.personal.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/myapi")
public class MyController {

    @GetMapping("/appname")
    public String getAppName() {
        return "my spring boot security application";
    }
}
