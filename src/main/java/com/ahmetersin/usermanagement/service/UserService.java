package com.ahmetersin.usermanagement.service;

import com.ahmetersin.usermanagement.model.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public void createUser(User users);
    public Collection<User> getAllUsers();
    public Optional<User> findUserById(int id);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public void deleteAllUsers();
}
