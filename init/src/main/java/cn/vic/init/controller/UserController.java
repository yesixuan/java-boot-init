package cn.vic.init.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("user/{id}")
    public String query(@PathVariable(value = "id") Integer id) {
        return "id: " + id;
    }
}
