package com.csc3402.lab.lab11.service;

import com.csc3402.lab.lab11.dto.UserDto;
import com.csc3402.lab.lab11.model.User;

public interface UserService {

    /**
     * Save user from UserDto
     * @param userDto the user data transfer object
     */
    void saveUser(UserDto userDto);

    /**
     * Find user by email
     * @param email the email address
     * @return User object or null if not found
     */
    User findByEmail(String email);

    /**
     * Check if user exists by email
     * @param email the email address
     * @return true if user exists, false otherwise
     */
    boolean existsByEmail(String email);
}