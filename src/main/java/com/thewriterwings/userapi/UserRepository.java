package com.thewriterwings.userapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	
	Iterable<User> findByUserName(String userName);
}
