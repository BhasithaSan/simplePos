package com.github.BhasithaSan.ecommerce.Service;


import com.github.BhasithaSan.ecommerce.Dao.UserRepo;
import com.github.BhasithaSan.ecommerce.Model.User.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);



    public String register(Users user) {
        try {

            user.setPassword(encoder.encode(user.getPassword()));
            if(user.getUsername() !=null) {
                userRepo.save(user);
                return "success";
            }
            else{
                System.out.println("user name:"+user.getUsername());
                return "not provided";
            }
        } catch (DataIntegrityViolationException e) {
            return "exist";
        } catch (Exception e) {
            return "error";
        }
    }

}
