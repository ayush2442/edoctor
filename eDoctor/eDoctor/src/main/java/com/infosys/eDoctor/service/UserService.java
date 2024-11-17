package com.infosys.eDoctor.service;

import com.infosys.eDoctor.entity.Users;
import com.infosys.eDoctor.reposatory.UsersRepo;
import com.infosys.eDoctor.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {

    @Autowired
    UsersRepo usersRepo;

    public Users addUser(Users user) {

        return usersRepo.save(user);

    }

    public Boolean loginUser(LoginRequest loginRequest) {

        Optional<Users> user = usersRepo.findById(loginRequest.getUserId());
        Users user1 = user.get();

        if(user1 == null) {
            return false;
        }

        if(!user1.getPassword().equals(loginRequest.getPassword())) {
            return false;
        }

        //change
        if (!user1.getUserType().equals(loginRequest.getUserType())) {
            return false;
        }

        return true;



    }

}

