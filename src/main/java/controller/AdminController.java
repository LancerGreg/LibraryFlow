package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import unit.Admin;
import service.AdminService;

import java.util.Collection;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Admin> getAllUser(){
        return adminService.getAllUser();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Admin getUserById(@PathVariable("id") int id){
        return adminService.getAdminById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") int id){
        adminService.removeAdminById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody Admin admin){
        adminService.updateAdmin(admin);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody Admin admin){
        adminService.insertAdmin(admin);
    }

}
