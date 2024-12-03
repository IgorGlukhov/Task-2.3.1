package com.example.crud.dao;


import com.example.crud.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id);

}
