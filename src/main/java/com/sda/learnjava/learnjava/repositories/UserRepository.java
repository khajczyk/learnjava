package com.sda.learnjava.learnjava.repositories;

import com.sda.learnjava.learnjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByNickName(String nickName);

}
