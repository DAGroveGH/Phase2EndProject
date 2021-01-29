package com.hcl.phase2EndProject.services;

import com.hcl.phase2EndProject.models.User;
import com.hcl.phase2EndProject.models.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    UserCrudRepository userCrudRepository;

    public boolean createAccount(User user) {
        if(checkUser(user)) {
            userCrudRepository.save(user);
            return true;
        }
        return false;
    }

    private boolean checkUser(User user) {
        Iterable<User> users = userCrudRepository.findAll();

        for(User userEntity : users) {
            if(userEntity.getUsername().equals(user.getUsername())) {
                return false;
            }
        }
        return true;
    }
}
