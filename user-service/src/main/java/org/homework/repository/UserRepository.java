package org.homework.repository;

import org.homework.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
