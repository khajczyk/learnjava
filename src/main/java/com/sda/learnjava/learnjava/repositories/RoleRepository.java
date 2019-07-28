package com.sda.learnjava.learnjava.repositories;

import com.sda.learnjava.learnjava.model.Role;
import com.sda.learnjava.learnjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User, Long> {

    boolean findByName (Role role);

}
