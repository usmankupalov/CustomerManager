package service;

import model.User;

import java.util.Iterator;

public interface IUserService {

    Iterable<User>listAllUser();
    User getUserById(long id);
    User saveUser(User user);
    void deleteUser(long id);

}
