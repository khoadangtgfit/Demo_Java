package vn.tayjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.tayjava.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
