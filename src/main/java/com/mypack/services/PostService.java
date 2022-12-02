package com.mypack.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mypack.entities.Post;
import com.mypack.payloads.PostDto;

@Service
public interface PostService {
	//create
	public Post createPost(PostDto postDto);
	
	//get All Post
	public List<Post> getAllPost(PostDto postDto);
	
	//getById
	public Post postById(Post post);
	
	//update
	public Post updatePost(Post post ,Integer postId);
	
	//delete
	public void deletePost(Integer postId);
	
	//get All post by category
	public List<Post> getPostByCategory(Integer categoryId);
	
	//get All post by User
	public List<Post> getPostByuser(Integer userId);
	
	//search post
	public List<Post> searchPost(String keyword);
}
