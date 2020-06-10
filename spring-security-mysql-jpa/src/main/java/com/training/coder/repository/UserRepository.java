/**
 * 
 */
package com.training.coder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.coder.model.User;

/**
 * @author kaustavbasu
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUsername(String username);
	
	
}
