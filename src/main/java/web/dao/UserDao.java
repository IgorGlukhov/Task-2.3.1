package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

        void saveUser(User user);
        User getUser(Long id);
        List<User> getAllUsers();
        void deleteUser(Long id);

}
