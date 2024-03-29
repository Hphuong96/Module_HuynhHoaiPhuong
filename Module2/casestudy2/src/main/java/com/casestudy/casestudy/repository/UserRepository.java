package com.casestudy.casestudy.repository;

import com.casestudy.casestudy.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}
