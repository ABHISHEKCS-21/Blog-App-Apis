package com.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypack.entities.Category;
import com.mypack.entities.Post;
import com.mypack.entities.User;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByuser(User user);
	List<Post> findByCategory(Category category);
}
