package com.sda.learnjava.learnjava;

import com.sda.learnjava.learnjava.model.*;
import com.sda.learnjava.learnjava.repositories.QuizRepository;
import com.sda.learnjava.learnjava.repositories.RoleRepository;
import com.sda.learnjava.learnjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Sets;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
​

@Service
public class MockData {
​
    @Autowired
    private RoleRepository roleRepository;
​
    @Autowired
    private UserRepository userRepository;
​
    @Autowired
    private QuizRepository quizRepository;
​
    @Autowired
    private PasswordEncoder passwordEncoder;
​

    @PostConstruct
    public void mockData() {
​
        initQuizzes();
​
        if (!userRepository.existsByUsername("user@user.pl")) {
​
            Role role = roleRepository.findByName(RoleType.USER.getRoleName());
            if (role == null) {
                role = roleRepository.save(new Role(RoleType.USER.getRoleName()));
            }
            User user = new User();
            userRepository.save(user);
            user.setNickName("user@user.pl");
            user.setPasswordHash(passwordEncoder.encode("user12345"));
            user.setRole(Sets.newHashSet(role));
            user.setFirstName("Jan");
            user.setLastName("Kowalski");
​
            userRepository.save(user);
        }
​
        if (!userRepository.existsByUsername("admin@admin.pl")) {
​
            Role role = roleRepository.findByName(RoleType.ADMIN.getRoleName());
            if (role == null) {
                role = roleRepository.save(new Role(RoleType.ADMIN.getRoleName()));
            }
            User user = new User();
            userRepository.save(user);
            user.setUsername("admin@admin.pl");
            user.setPasswordHash(passwordEncoder.encode("admin12345"));
            user.setRoles(Sets.newHashSet(role));
            user.setFirstName("Przemysław");
            user.setSurname("Adminowski");
​
            userRepository.save(user);
        }
​
    }
​

    public void initQuizzes() {
        List<Quiz> all = quizRepository.findAll();
        if (all.size() == 0) {
            Quiz beginnerQuiz = new Quiz("Początkujący");
            Quiz advanceQuiz = new Quiz("Zaawansowany");
            Quiz expertQuiz = new Quiz("Ekspert");
​
            //Question beginnerQuizQuestion1 = new Question("W której wersji Javy pojawił się interfejs Stream API",beginnerQuiz);
            Question beginnerQuizQuestion1 = new Question("W której wersji Javy pojawił się interfejs Stream API");
            Answer beginnerQuizQuestion1Answer1 = new Answer("Java 8", true);
            Answer beginnerQuizQuestion1Answer2 = new Answer("Java 9", false);
            Answer beginnerQuizQuestion1Answer3 = new Answer("Java 10", false);
            Answer beginnerQuizQuestion1Answer4 = new Answer("Java 7", false);
            beginnerQuizQuestion1.setQuizAnswers(Arrays.asList(beginnerQuizQuestion1Answer1, beginnerQuizQuestion1Answer2, beginnerQuizQuestion1Answer3, beginnerQuizQuestion1Answer4));
​
            Question beginnerQuizQuestion2 = new Question("Wybierz poprawny typ danych dla wartości 5.5");
            Answer beginnerQuizQuestion2Answer1 = new Answer("int", false);
            Answer beginnerQuizQuestion2Answer2 = new Answer("double", true);
            Answer beginnerQuizQuestion2Answer3 = new Answer("short", false);
            Answer beginnerQuizQuestion2Answer4 = new Answer("String", false);
            beginnerQuizQuestion2.setQuizAnswers(Arrays.asList(beginnerQuizQuestion2Answer1, beginnerQuizQuestion2Answer2, beginnerQuizQuestion2Answer3, beginnerQuizQuestion2Answer4));
            beginnerQuiz.setQuestions(Arrays.asList(beginnerQuizQuestion1, beginnerQuizQuestion2));
​
​
            quizRepository.save(beginnerQuiz);
            quizRepository.save(advanceQuiz);
            quizRepository.save(expertQuiz);
        }
    }
}




