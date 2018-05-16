package hello.controller;

import hello.model.User;
import hello.repository.UserRepository;
import hello.service.UserService;
import hello.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController  {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user")
    public User getUser (@RequestParam (value="login", defaultValue="null") String login) {
        return userService.getInfoByLogin(login)  ;
    }



    @RequestMapping(value = "/all") // /users/all
    public List<User> showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return userService.getAllUsers();
    }



}
