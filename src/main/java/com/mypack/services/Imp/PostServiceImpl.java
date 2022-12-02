package com.mypack.services.Imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mypack.entities.Post;
import com.mypack.payloads.PostDto;
import com.mypack.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Override
	public Post createPost(PostDto postDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getAllPost(PostDto postDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post postById(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post updatePost(Post post, Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> getPostByCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostByuser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchPost(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
