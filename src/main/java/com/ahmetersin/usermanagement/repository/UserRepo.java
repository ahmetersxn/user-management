package com.ahmetersin.usermanagement.repository;

import com.ahmetersin.usermanagement.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository <User,Integer> {
}
