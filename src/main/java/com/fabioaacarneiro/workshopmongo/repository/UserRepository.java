package com.fabioaacarneiro.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fabioaacarneiro.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
