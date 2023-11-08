package br.com.sidneydev.userapi.services;

import br.com.sidneydev.userapi.domain.User;
import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
