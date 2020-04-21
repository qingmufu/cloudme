package com.example.mysql;

import org.springframework.data.repository.CrudRepository;

// This is a repository class that manages user records
// It will be AUTO IMPLEMENTED by Spring into a Bean userRepository which manages users CRUD
public interface UserRepository extends CrudRepository<User, Integer> {

}
