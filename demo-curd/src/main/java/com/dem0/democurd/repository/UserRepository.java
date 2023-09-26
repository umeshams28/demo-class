package com.dem0.democurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dem0.democurd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
