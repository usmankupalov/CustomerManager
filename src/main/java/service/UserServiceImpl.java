package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

public class UserServiceImpl implements IUserService {
      private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> listAllUser() {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
