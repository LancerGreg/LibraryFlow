package service;

import dao.UserDao;
import unit.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Collection<User> getAllUser(){
        return userDao.getAllUser();
    }

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }

    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public boolean containsKey(Long id) {
        return userDao.containsKey(id);
    }
}
