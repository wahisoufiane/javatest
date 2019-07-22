package com.test.test_technique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.test_technique.domain.Profile;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
