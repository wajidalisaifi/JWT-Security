package com.exampleJWT.JWT.Controller;

import com.exampleJWT.JWT.entity.User;
import com.exampleJWT.JWT.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/str")
    public String getStr(){
        return "hi i am happy for you JWT";
    }


    @GetMapping("principle")
    public String getLoggedInUser(Principal principal){
        String str =    principal.toString();
        String str2 = principal.getName();
        return str+" :: "+str2;
    }
}
