package com.example.TalentMatchPro.services.ServiceImp;

import com.example.TalentMatchPro.Enums.Role;
import com.example.TalentMatchPro.Enums.Status;
import com.example.TalentMatchPro.models.User;
import com.example.TalentMatchPro.repository.UserRepository;
import com.example.TalentMatchPro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImp implements UserService {
    final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String addUser(User user) {
        user.setRole(Role.ADMIN);
        user.setRegNo(UUID.randomUUID().toString());
        user.setStatus(Status.ACTIVE);
        User respUser=userRepository.save(user);

        return "User With name:"+user.getUsername()+" has been Added to Database Successfully";
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        return null;
    }

    @Override
    public String restPassword(int userId, String password) {
        return null;
    }

    @Override
    public String lockUnlock(int userId) {
        return null;
    }
}
