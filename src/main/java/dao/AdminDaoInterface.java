package dao;

import unit.Admin;

import java.util.Collection;

public interface AdminDaoInterface {
    Collection<Admin> getAllAdmin();

    Admin getAdminById(int id);

    void removeAdminById(int id);

    void updateUser(Admin admin);

    void insertUser(Admin admin);
}
