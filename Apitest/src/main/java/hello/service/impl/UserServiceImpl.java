package hello.service.impl;

import hello.model.User;
import hello.repository.UserRepository;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getInfoByLogin(String login) {
        return repository.findUserByLogin(login);
    }

    @Override
    public void addUser(User user) {
        if (user == null) {
            return;
        }
        repository.save(user);
    }
}
