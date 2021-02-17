package js.pekah.study.repository;

import js.pekah.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {

    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("testUser03");
        user.setEmail("testUser03@gmail.com");
        user.setPhoneNumber("010-2222-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin3");

        User newUser = userRepository.save(user);
        System.out.println("newUser: " + newUser);
    }

    @Test
    public void read() {
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser -> {
            System.out.println("user: " + selectUser);
            System.out.println("email: " + selectUser.getEmail());
        });
    }

    @Test
    @Transactional
    public void update() {
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser -> {
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    @Transactional
    public void delete() {
        Optional<User> user = userRepository.findById(3L);

        Assertions.assertTrue(user.isPresent());

        user.ifPresent(selectUser -> {
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(3L);

        Assertions.assertFalse(deleteUser.isPresent());

    }
}
