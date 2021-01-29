package com.hcl.phase2EndProject.services;

import com.hcl.phase2EndProject.models.User;
import com.hcl.phase2EndProject.models.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserCrudRepository userCrudRepository;

    public boolean login(User user) {
        Iterable<User> users = userCrudRepository.findAll();

        for(User userEntity : users) {
            if(userEntity.getUsername().equals(user.getUsername()) && userEntity.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }
}
