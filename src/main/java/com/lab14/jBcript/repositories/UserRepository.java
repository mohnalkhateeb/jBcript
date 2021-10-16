package com.lab14.jBcript.repositories;

import com.lab14.jBcript.modules.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserClass, Long> {
    UserClass findAppUserByEmail(String email);
    Optional<UserClass> findAppUsersByUsername(String username);
}
