package dao;

import unit.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao implements UserDaoInterface {

    private static Date date = new Date();

    private static Map<Integer, User> user;

    static {
        user = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "user1", "user1@mail.com", "pass1", date));
                put(2, new User(2, "user2", "user2@mail.com", "pass2", date));
                put(3, new User(3, "user3", "user3@mail.com", "pass3", date));
            }
        };
    }

    public Collection<User> getAllUser(){
        return user.values();
    }

    public User getUserById(int id){
        return user.get(id);
    }

    public void removeUserById(int id) {
        user.remove(id);
    }

    public void updateUser(User user){
        User u = this.user.get(user.getId());
        u.setId(user.getId());
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        u.setDate(user.getDate());
    }

    public void insertUser(User user) {
        this.user.put(user.getId(), user);
    }

    public boolean containsKey(Long id) {
        int idStr = id.compareTo(id);
        return getUserById(idStr) == this.user.get(id);
    }
}
