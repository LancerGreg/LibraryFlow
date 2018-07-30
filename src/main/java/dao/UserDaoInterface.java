package dao;

import unit.User;

import java.util.Collection;

public interface UserDaoInterface {
    Collection<User> getAllUser();

    User getUserById(int id);

    void removeUserById(int id);

    void updateUser(User user);

    void insertUser(User user);
}
