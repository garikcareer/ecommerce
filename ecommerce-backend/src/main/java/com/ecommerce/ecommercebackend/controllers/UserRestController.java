package com.ecommerce.ecommercebackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserRestController {

//    @PostMapping(path = "/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        // Perform authentication logic here
//        // This is just a basic example, you should implement proper authentication logic
////        if ("exampleuser".equals(loginRequest.getUsername()) && "password123".equals(loginRequest.getPassword())) {
////            return ResponseEntity.ok().build();
////        } else {
////            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
////        }
////    }
////
////    public static class LoginRequest {
////        private String username;
////        private String password;
////        // Getters and setters
//        var response = "";
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
}
