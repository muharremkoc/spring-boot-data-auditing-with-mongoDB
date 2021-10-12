package com.example.springbootmongodbaudit.repository;

import com.example.springbootmongodbaudit.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
