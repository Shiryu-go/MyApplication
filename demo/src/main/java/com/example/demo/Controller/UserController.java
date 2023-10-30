package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user")
    public ResponseEntity<UserResponse> getUser(@AuthenticationPrincipal DmsUserDetails dmsUser) {

        logger.info("User " + dmsUser.getFirstName() + " " + dmsUser.getLastName() + " logged in.");

        UserResponse user = new UserResponse();
        user.setUserId(dmsUser.getUserId());
        user.setFirstName(dmsUser.getFirstName());
        user.setLastName(dmsUser.getLastName());
        user.setEmail(dmsUser.getUsername());

        return ResponseEntity.ok(user);
    }
}
