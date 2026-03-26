package com.example.attendance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AboutController {

    @GetMapping("/about")
    public Map<String, String> about() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "黄诗淇");
        info.put("major", "计科");
        return info;
    }
}