package com.sda.learnjava.learnjava.repositories;

import com.sda.learnjava.learnjava.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {


}
