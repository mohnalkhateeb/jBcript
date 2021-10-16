package com.lab14.jBcript.repositories;

import com.lab14.jBcript.modules.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByUserClass_Username(String name);
    void deletePostByUserClass_UsernameAndId(String username, Long id);
}
