package com.example.TalentMatchPro.services;

import com.example.TalentMatchPro.models.User;

public interface UserService {
    String addUser(User user);
    /*Create user
Update user
Delete user
Approve user (for Admin)
Authenticate user
Reset password
Lock/unlock account*/
    String updateUser(User user);
    String deleteUser(int userId);
    String restPassword(int userId,String password);
    String lockUnlock(int userId);
}
