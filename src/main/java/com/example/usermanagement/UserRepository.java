package com.example.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // This simple line gives us methods like: 
    // save(), findAll(), deleteById(), findById() 
    // without writing a single line of SQL!
    
    // We can also add a custom search:
    User findByEmail(String email);
}
