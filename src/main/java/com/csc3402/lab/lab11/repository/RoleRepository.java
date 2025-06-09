package com.csc3402.lab.lab11.repository;

import com.csc3402.lab.lab11.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Find role by name
     * @param name the role name
     * @return Role object or null if not found
     */
    Role findByName(String name);
}