package vn.tayjava.service;

import vn.tayjava.entity.User;

public interface UserService {
    User getUserById(Long id);
    User createUser(User user);
}
