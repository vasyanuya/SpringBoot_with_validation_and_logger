package com.pp_spring.SpringBoot.service;

import com.pp_spring.SpringBoot.model.User;
import com.pp_spring.SpringBoot.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final Logger log = Logger.getLogger(UserService.class.getName());

    @Autowired
    private UsersRepository usersRepository;

    @Transactional
    public List<User> listUsers() {
        log.info("hello from method listUsers()");
        return usersRepository.findAll();
    }

    @Transactional
    public User readUser(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        log.info("user with id: " + id + " was found");
        return foundUser.orElse(null);
    }

    @Transactional
    public void createUser(User user) {
        usersRepository.save(user);
        log.info("user with name: " + user.getName() + " and age: " +
                user.getAge() + " has been created");
    }

    @Transactional
    public void updateUser(User updatedUser) {
        usersRepository.save(updatedUser);
        log.info("updated name: " + updatedUser.getName() + " updated age: " +
                updatedUser.getAge());
    }

    @Transactional
    public void deleteUser(int id) {
        usersRepository.deleteById(id);
        log.info("user with id: " + id + " has been deleted");
    }
}