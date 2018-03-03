package hello.controller;

import hello.model.User;
import hello.repository.UserRepository;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController  {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user")
    public User getUser (@RequestParam (value="login", defaultValue="null") Model model,String login) {
        model.addAttribute("users", userService.getInfoByLogin(login));
        return  new User(login);

    }

}
