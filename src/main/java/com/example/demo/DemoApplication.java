package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  @Autowired
  UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    List<User> users = userRepository.findAll();

    users.forEach(e -> System.err.println(e));
    User user = new User();
    user.setName("toan1");
    user.setDeleteFlag(false);
    userRepository.save(user);
  }
}
