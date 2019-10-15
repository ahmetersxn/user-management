package com.ahmetersin.usermanagement.service.Impl;

import com.ahmetersin.usermanagement.model.User;
import com.ahmetersin.usermanagement.repository.UserRepo;
import com.ahmetersin.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public void createUser(List<User> users) {
        userRepo.saveAll(users);
    }

    @Override
    public Collection<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findUserById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteAllUsers() {
        userRepo.deleteAll();
    }
}
