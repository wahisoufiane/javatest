package com.test.test_technique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.test_technique.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
