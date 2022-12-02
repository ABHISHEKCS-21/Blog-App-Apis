package com.mypack.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private Integer id;
	
	@NotNull
	@Size(min =4,message= "Name Must be Mininum 4 charecters!!")
	private String name;
	
	@Email
	private String email;
	
	@NotBlank
	@Size(min=3,max=7,message="Password must be minimum 3 char and maximum 7 char")
	private String password;
	
	@NotNull
	private String about;
}
