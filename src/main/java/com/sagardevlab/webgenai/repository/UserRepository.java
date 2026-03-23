package com.sagardevlab.webgenai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sagardevlab.webgenai.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
