package dao;

import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import unit.Access;
import unit.Admin;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AdminDao implements AdminDaoInterface {
    private static Date date = new Date();

    private static Map<Integer, Admin> admin;

    static {
        admin = new HashMap<Integer, Admin>(){
            {
                put(1, new Admin(1, 1, new Access(1, "user1", "admin"), date, true));
                put(2, new Admin(2, 2, new Access(2, "user2", "moderator"), date, true));
                put(3, new Admin(3, 3, new Access(3, "user3", "manager"), date, true));
            }
        };
    }

    static MongoRepositoriesAutoConfiguration configuration = new MongoRepositoriesAutoConfiguration();

    static SessionProperties.Mongo mongo = new SessionProperties.Mongo();

    public static SessionProperties.Mongo getMongo() {
        return mongo;
    }

    public Collection<Admin> getAllAdmin(){
        return admin.values();
    }

    public Admin getAdminById(int id){
        return admin.get(id);
    }

    public void removeAdminById(int id) {
        admin.remove(id);
    }

    public void updateUser(Admin admin){
        Admin a = this.admin.get(admin.getId());
        a.setId(admin.getId());
        a.setUserId(admin.getUserId());
        a.setLevelAccess(admin.getLevelAccess());
        a.setDate(admin.getDate());
        a.setActual(admin.isActual());
    }

    public void insertUser(Admin admin) {
        this.admin.put(admin.getId(), admin);
    }
}
