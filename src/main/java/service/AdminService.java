package service;

import dao.AdminDao;
import unit.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public Collection<Admin> getAllUser(){
        return adminDao.getAllAdmin();
    }

    public Admin getAdminById(int id){
        return adminDao.getAdminById(id);
    }

    public void removeAdminById(int id) {
        adminDao.removeAdminById(id);
    }

    public void updateAdmin(Admin admin){
        adminDao.updateUser(admin);
    }

    public void insertAdmin(Admin admin) {
        adminDao.insertUser(admin);
    }

}
