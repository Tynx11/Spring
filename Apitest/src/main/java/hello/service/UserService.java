package hello.service;

import hello.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {


        List<User> getAllUsers();
        User getInfoByLogin(String login);
        void addUser(User user);


}
