package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypack.entities.User;

public interface UserRepo extends JpaRepository<User , Integer>{

}
