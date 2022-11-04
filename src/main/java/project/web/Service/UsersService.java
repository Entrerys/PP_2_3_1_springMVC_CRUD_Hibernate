package project.web.Service;

import project.web.Model.User;

import java.util.List;

public interface UsersService {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(int id, User user);

    void removeUserById(int id);
}
