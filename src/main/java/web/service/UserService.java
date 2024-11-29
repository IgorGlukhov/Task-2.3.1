package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    List<User> getAllUsers();
}
