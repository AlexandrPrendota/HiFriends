package com.hifriends.service.api;

import com.hifriends.model.User;
import com.hifriends.model.dto.UserDto;

import java.util.List;

/**
 * @author  by aleksandrprendota on 22.08.17.
 */
public interface UserService {

    List<User> getAllActiveUsers(long id);

    void updateUserStatus(long id);

    UserDto registrateUser(String name, String email, String avatar);
}
