package com.mypack.payloads;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.mypack.entities.Category;
import com.mypack.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostDto {

	@NotBlank
	private String postTitle;
	@NotBlank
	private String postContent;
	
	 }
