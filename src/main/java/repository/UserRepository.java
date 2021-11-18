package repository;

import model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
    void deleteById(long id);

    User save(User user);

    Iterable<User> findAll();
}
