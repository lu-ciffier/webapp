package com.lucifer.service;

import com.lucifer.domain.UserAccount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/user-service")
public interface UserService {

    @GetMapping("/hello")
    UserAccount hello(@RequestParam("userId") Long userId);
}
