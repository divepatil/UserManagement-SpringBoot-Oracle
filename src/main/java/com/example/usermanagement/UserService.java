package com.example.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
    // 1. Create (Save User)
    public void registerUser(User user) {
        userRepository.save(user);
    }

    // 2. Read (Get all Users)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 3. Update (Change User data)
    public void updateUser(User user) {
        userRepository.save(user); // save() works for both Create and Update
    }

    // 4. Delete (Remove User)
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // 5. Login check
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
