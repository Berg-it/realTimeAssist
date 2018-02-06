package tn.bergit.realtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bergit.realtime.bo.User;

/**
 * 
 * @author ABG
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
